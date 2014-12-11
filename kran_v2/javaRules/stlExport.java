import org.eclipse.uml2.uml.InstanceSpecification;
import org.jcae.opencascade.jni.TopoDS_Shape;

import vtk.vtkSTLWriter;
import de.iils.dc43.geometry.API.GeometryAPI;
import de.iils.dc43.geometry.objectgraph.Graph;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class stlExport extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		InstanceSpecification rootComponent = null;
		for (InstanceSpecification i : getAllInstances("Kran")) {
			rootComponent = i;
		}
		System.out.println("Generate Geom");
		GeometryAPI api = new GeometryAPI(trafoRunner.getUmlFileURI());
		Graph<TopoDS_Shape> shape = api.generateGeometry(rootComponent);
		shape.getNode(rootComponent);
		System.out.println("Mesh to stl");
		// Stl file
		vtkSTLWriter ws = new vtkSTLWriter();
		QuickMesh qm = new QuickMesh();
		qm.mesh(rootComponent.getName(), shape.getNode(rootComponent).getRepresentation(), 1);
		ws.AddInputDataObject(qm.getData());
		ws.SetFileName(trafoRunner.getProjectDir() + "/Geometry/test.stl");
		ws.Update();
		ws.Write();

	}

}