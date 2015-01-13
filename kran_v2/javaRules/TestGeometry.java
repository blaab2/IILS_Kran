import geometry.Point;

import java.util.Collection;

import org.eclipse.uml2.uml.InstanceSpecification;

import Jama.Matrix;
import de.iils.dc43.geometry.API.GeometryAPI;
import de.iils.dc43.geometry.objectgraph.Graph;
import de.iils.dc43.math.TransformationMatrix;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class TestGeometry extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		GeometryAPI api = new GeometryAPI(trafoRunner.getUmlFileURI());
		Graph<Object> emptyGraph = api.generateEmptyGeometryGraph();

		Collection<Point> points = InstanceWrapperExtensions.allInstances(Point.class);

		InstanceSpecification firstPoint = points.iterator().next().umlInstance();

		TransformationMatrix trafomatrix = api.getLoc2GlobTrans(emptyGraph, firstPoint);

		de.iils.dc43.geometry.datastructure.geometrics.Point pointData = (de.iils.dc43.geometry.datastructure.geometrics.Point) emptyGraph.getNode(firstPoint)
				.getData();

		Matrix newPoint = trafomatrix.times(new Matrix(pointData.getHomogeneousCoordinates(), 4));

	}
}