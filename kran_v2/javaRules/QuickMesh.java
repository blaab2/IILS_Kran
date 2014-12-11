
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.jcae.opencascade.jni.TopoDS_Face;
import org.jcae.opencascade.jni.TopoDS_Shape;
import org.jcae.vtk.OCCMeshExtractor;
import org.jcae.vtk.OCCMeshExtractor.FaceData;

import vtk.vtkAppendPolyData;
import vtk.vtkCell;
import vtk.vtkCellArray;
import vtk.vtkCleanPolyData;
import vtk.vtkDataArray;
import vtk.vtkDoubleArray;
import vtk.vtkIntArray;
import vtk.vtkPoints;
import vtk.vtkPolyData;
import vtk.vtkTriangle;

public class QuickMesh {

	private Collection<FaceMesh> faceMeshes = new ArrayList<FaceMesh>();
	private OCCMeshExtractor meshExtractor;
	private int numThreads = 1;
	private String name;
	private vtkPolyData data;

	public void mesh(String name, TopoDS_Shape shape, int numThreads) {
		this.faceMeshes.clear();
		this.meshExtractor = new OCCMeshExtractor(shape);
		this.numThreads = numThreads;
		this.name = name;
		meshMultiCore();
	}

	public void mesh(String name, String file, int numThreads) {
		this.faceMeshes.clear();
		this.meshExtractor = new OCCMeshExtractor(file);
		this.numThreads = numThreads;
		this.name = name;
		meshMultiCore();
	}

	private void meshMultiCore() {
		Collection<TopoDS_Face> occFaces = meshExtractor.getFaces();

		int numberOfProc = Runtime.getRuntime().availableProcessors();
		numberOfProc = numberOfProc > numThreads ? numThreads : numberOfProc;
		ExecutorService executor = Executors.newFixedThreadPool(numberOfProc);
		ArrayList<Thread> threads = new ArrayList<Thread>();

		int i = 1;
		for (Iterator<TopoDS_Face> iterator = occFaces.iterator(); iterator.hasNext();) {
			TopoDS_Face face = iterator.next();
			FaceMesh mesh = new FaceMesh(face, i);
			faceMeshes.add(mesh);
			Thread t = new Thread(mesh);
			threads.add(t);
			executor.execute(t);
			i++;
		}

		executor.shutdown();

		int numFaces = faceMeshes.size();
		System.out.println("Meshing with OCC:");
		System.out.println(" shape: " + name);
		System.out.println(" face(s): " + numFaces);
		System.out.println(" core(s): " + numberOfProc);
		System.out.print(" progress: 0%...");
		double qOld = 0;
		long lastTime = System.currentTimeMillis();
		while (!executor.isTerminated()) {
			double numFinished = 0;
			for (FaceMesh faceMesh : faceMeshes) {
				if (faceMesh.isFinished())
					numFinished++;
			}

			double q = numFinished / numFaces;
			long curTime = System.currentTimeMillis();

			if (qOld != q && (curTime - lastTime > 1000)) {
				System.out.print((int) (q * 10) + "%...");
				lastTime = curTime;
			}

			qOld = q;

			try {
				Thread.currentThread();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		appendData();
		int numTriangles = this.data.GetNumberOfCells();
		long curTime = System.currentTimeMillis();
		System.out.println("100%");
		System.out.println(" triangles: " + numTriangles);
		System.out.println(" time:" + (curTime - lastTime) + " ms");
	}

	private void appendData() {
		vtkAppendPolyData vtkAppendPolyData = new vtkAppendPolyData();
		vtkCleanPolyData vtkCleanPolyData = new vtkCleanPolyData();
		for (FaceMesh mesh : faceMeshes) {
			vtkAppendPolyData.AddInputData(mesh.getData());
		}
		vtkAppendPolyData.Update();
		vtkCleanPolyData.AddInputData(vtkAppendPolyData.GetOutput());
		vtkCleanPolyData.Update();
		this.data = vtkCleanPolyData.GetOutput();
	}

	public vtkPolyData getData() {
		return data;
	}

	private class FaceMesh implements Runnable {

		private FaceData facedata;
		private vtkPolyData data;
		public boolean finished = false;
		private int faceNumber = 0;

		public vtkPolyData getData() {
			return data;
		}

		public boolean isFinished() {
			return finished;
		}

		public FaceMesh(TopoDS_Face topoFace, int faceNumber) {
			facedata = new OCCMeshExtractor.FaceData(topoFace, false);
			this.faceNumber = faceNumber;
		}

		@Override
		public void run() {
			mesh();
			createData();
			this.finished = true;
		}

		private void mesh() {
			facedata.load();
		}

		private void createData() {

			this.facedata.getPolys();

			float[] nodes = this.facedata.getNodes();
			int[] polys = this.facedata.getPolys();
			int polyOffset = 4;

			vtkPoints points = new vtkPoints();
			vtkCellArray triangles = new vtkCellArray();
			vtkPolyData polyData = new vtkPolyData();

			if (polys == null)
				this.data = polyData;

			vtkDataArray faceArray = new vtkIntArray();
			faceArray.SetName("FACE");
			faceArray.SetNumberOfComponents(1);
			faceArray.SetNumberOfTuples(polys.length / polyOffset);

			vtkDataArray areaArray = new vtkDoubleArray();
			areaArray.SetName("AREA");
			areaArray.SetNumberOfComponents(1);
			areaArray.SetNumberOfTuples(polys.length / polyOffset);

			vtkDataArray degenerationArray = new vtkDoubleArray();
			degenerationArray.SetName("DEGENERATION");
			degenerationArray.SetNumberOfComponents(1);
			degenerationArray.SetNumberOfTuples(polys.length / polyOffset);

			for (int i = 0; i < nodes.length / 3; i++) {
				double[] point = new double[] { nodes[i * 3], nodes[i * 3 + 1], nodes[i * 3 + 2] };
				points.InsertNextPoint(point);
			}
			polyData.SetPoints(points);

			for (int i = 0; i < polys.length / polyOffset; i++) {
				if (polys[i * polyOffset] == 3) {
					vtkTriangle vtkTriangle = new vtkTriangle();
					int[] ids = new int[] { polys[i * polyOffset + 1], polys[i * polyOffset + 2], polys[i * polyOffset + 3] };
					vtkTriangle.GetPointIds().SetId(0, ids[0]);
					vtkTriangle.GetPointIds().SetId(1, ids[1]);
					vtkTriangle.GetPointIds().SetId(2, ids[2]);
					int cellId = triangles.InsertNextCell(vtkTriangle);
					faceArray.SetTuple1(cellId, faceNumber);
				}
			}
			polyData.SetPolys(triangles);

			for (int i = 0; i < polys.length / polyOffset; i++) {
				vtkCell cell = polyData.GetCell(i);
				if (cell.GetCellType() == 5) {
					double area = ((vtkTriangle) cell).ComputeArea();
					areaArray.SetTuple1(i, area);
				} else {
					areaArray.SetTuple1(i, 0);
				}
			}

			for (int i = 0; i < polys.length / polyOffset; i++) {
				vtkCell cell = polyData.GetCell(i);
				if (cell.GetCellType() == 5) {
					vtkTriangle triangle = ((vtkTriangle) cell);
					double length0 = triangle.GetEdge(0).GetLength2();
					double length1 = triangle.GetEdge(1).GetLength2();
					double length2 = triangle.GetEdge(2).GetLength2();
					double lengthMin = Math.min(Math.min(length0, length1), length2);
					double lengthMax = Math.max(Math.max(length0, length1), length2);
					double q = lengthMax / lengthMin;
					if (q > 1E6)
						q = 0;
					degenerationArray.SetTuple1(i, q);
				} else {
					degenerationArray.SetTuple1(i, 0);
				}
			}

			polyData.GetCellData().AddArray(faceArray);
			polyData.GetCellData().AddArray(areaArray);
			polyData.GetCellData().AddArray(degenerationArray);

			this.data = polyData;
		}

	}

}
