import fem.FEMLine;
import fem.FEMPunkt;
import geometry.Point;
import gittermastschuss.classes.Stahlrohr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.uml2.uml.InstanceSpecification;

import Jama.Matrix;
import de.iils.dc43.geometry.DataException;
import de.iils.dc43.geometry.API.GeometryAPI;
import de.iils.dc43.geometry.objectgraph.Graph;
import de.iils.dc43.math.TransformationMatrix;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class exportAbaqus extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) throws IOException {

		String outputfile_path = getProjectDir() + "fem/";

		String outputfile_name = "abaqus_export.txt";

		output(outputfile_path + outputfile_name);

		if (new File(outputfile_path).exists() == false) {
			boolean creationWasSuccessful = new File(outputfile_path).mkdirs();
			if (creationWasSuccessful == false) {
				output("Could not create Folder: " + outputfile_path);
			}
		}

		FileWriter fw = new FileWriter(outputfile_path + outputfile_name);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("***********************************");
		bw.newLine();
		bw.write("** ABAQUS FEM FILE KRAN V2");
		bw.newLine();
		bw.write("***********************************");
		bw.newLine();
		bw.write("*HEADING");
		bw.newLine();
		bw.write("3-D KRAN Mastschussse");
		bw.newLine();
		bw.write("SI units (kg, m, s, N)");
		bw.newLine();
		bw.write("1-axis horizontal, 2-axis vertical");
		bw.newLine();
		bw.write("*PREPRINT, ECHO=YES, MODEL=YES, HISTORY=YES");
		bw.newLine();
		bw.write("**");
		bw.newLine();
		bw.write("** Model definition");
		bw.newLine();
		bw.write("**");
		bw.newLine();
		bw.write("*NODE, NSET=NALL");
		bw.newLine();

		// Punkte sammeln
		
		int point_i = 0;
		Collection<Stahlrohr> stahlrohre = InstanceWrapperExtensions.allInstances(Stahlrohr.class);
		ArrayList<FEMLine> femlines = new ArrayList<FEMLine>();
		HashMap<Point, FEMPunkt> points = new HashMap<Point, FEMPunkt>();
		
		GeometryAPI api = new GeometryAPI(trafoRunner.getUmlFileURI());
		Graph<Object> emptyGraph = api.generateEmptyGeometryGraph();
		
		for (Stahlrohr stahlrohr : stahlrohre) {
			Point startPoint = stahlrohr.getStartPoint();
			Point endPoint = stahlrohr.getEndPoint();

			de.iils.dc43.geometry.datastructure.geometrics.Point startpointData = (de.iils.dc43.geometry.datastructure.geometrics.Point) emptyGraph.getNode(startPoint.umlInstance())
					.getData();
			de.iils.dc43.geometry.datastructure.geometrics.Point endpointData = (de.iils.dc43.geometry.datastructure.geometrics.Point) emptyGraph.getNode(endPoint.umlInstance())
					.getData();
			
			TransformationMatrix trafomatrix = api.getLoc2GlobTrans(emptyGraph, startPoint.umlInstance());
			Matrix startPointMatrix = trafomatrix.times(new Matrix(startpointData.getHomogeneousCoordinates(), 4));
				
			startPointMatrix.print(4, 4);
			
			
			FEMPunkt p1 = findSame(startPoint, points);
			if (p1 == null) {
				p1 = new FEMPunkt(startPoint.getX(), startPoint.getY(), startPoint.getZ());
				p1.setIndex(point_i);
				point_i++;
				points.put(startPoint, p1);
			}

			FEMPunkt p2 = points.get(endPoint);
			if (p2 == null) {
				p2 = new FEMPunkt(endPoint.getX(), endPoint.getY(), endPoint.getZ());
				p2.setIndex(point_i);
				point_i++;
				points.put(endPoint, p2);
			}

			FEMLine line = new FEMLine(p1, p2);
			femlines.add(line);
		}

		List<FEMPunkt> fempoints = new ArrayList<FEMPunkt> (points.values());
	
		DecimalFormat format = new DecimalFormat("###000.##");

			for (FEMPunkt femPunkt : fempoints) {
			bw.write(femPunkt.getIndex() + ", " + format.format(femPunkt.getX()) + ", " + format.format(femPunkt.getY()) + ", " + format.format(femPunkt.getZ()));
			bw.newLine();
		}

		
		bw.close();
		
	}

		
	private FEMPunkt findSame(Point np, HashMap<Point, FEMPunkt> points) {
		for (Point p : points.keySet()) {
			if (checkKoordinates(p, np)) {
				return points.get(p);
			}
		}
		return null;
	}

	private boolean checkKoordinates(Point p, Point np) {
		if (p.getX() - np.getX() < 0.0001 && p.getY() - np.getY() < 0.0001 && p.getZ() - np.getZ() < 0.0001) {
			return true;
		}
		return false;
	}

	void exportpoint(int number, int x, int y, int z) {
	}

	void output(String msg) {
		System.out.println("exportAbaqus: " + msg);

	}

}