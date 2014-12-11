import geometry.Point;

import java.util.Collection;

import Transformations.PointTransformations;
import claus43.frametoolbox.classes.Circular;
import claus43.frametoolbox.classes.Connection;
import claus43.frametoolbox.classes.UniversalNode;
import claus43.frametoolbox.classes.WeldPlate;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class CircularCrossSections extends JavaRule {

	public void execute(TransformationRunner trafoRunner) {

		Collection<Circular> allCircularSections = InstanceWrapperExtensions
				.allInstances(Circular.class);

		for (Circular startCircular : allCircularSections) {

			// Check for Connection
			if (startCircular.getConnection() == null) {
				getLogger().warn(
						"Circular Cross Section: " + startCircular.toString()
								+ " has no connection and will be skipped.");
				// getLogger().warn("Circular Cross Section: " +
				// startCircular.toString() +
				// " has no connection and will be skipped and DELETED.");
				// startCircular.umlInstance().destroy();
				continue;
			}
			Connection connection = startCircular.getConnection();
			String name = startCircular.umlInstance().getName();

			// == INNER PROFILE == //
			// Start Circular
			startCircular.umlInstance().setName(name + "_start");
			startCircular.setCentre(connection.getStartNode());
			startCircular.setNormal(connection.getNormal());

			// End Circular
			Circular endCircular = InstanceWrapperExtensions.createInstance(
					Circular.class, name + "_end");
			endCircular.setRadius(startCircular.getRadius());
			endCircular.setCentre(connection.getEndNode());
			endCircular.setNormal(connection.getNormal());

			// Connect Circles to each other
			startCircular.next_add_(endCircular);
			// == INNER PROFILE END == //

			// !!!!!! NEW CODE !!!!!!!!! //
			// Cut conCut =
			// InstanceWrapperExtensions.createInstance(Cut.class,name);
			// conCut.setLive(connection);
			// !!!!!!!! END !!!!!!!!!!!! //

			// Circles to Connection
			connection.setEndCross(endCircular);
			connection.setStartCross(startCircular);
			// Circles to Connection as Loft Elements
			connection.element_add_(startCircular);
			connection.element_add_(endCircular);
			connection.setStart(startCircular);

			// Treat ConNodes, must be here too (MUCH EASIER THAN LATER)
			// Uni Nodes
			Collection<UniversalNode> allUniNodes = InstanceWrapperExtensions
					.allInstances(UniversalNode.class);
			if (allUniNodes.contains(connection.getStartNode())) {

				UniversalNode uniNode = InstanceWrapperExtensions
						.allInstancesAsMap(UniversalNode.class).get(
								connection.getStartNode().umlInstance()
										.getName());
				Point newMidPoint = PointTransformations.copyPoint(uniNode,
						"newMidpointAtStart");
				newMidPoint = PointTransformations.movePointAlongDirection(
						newMidPoint,
						uniNode.getNodeRadius() + uniNode.getScrewDistance()
								+ uniNode.getWeldPlateHeight(),
						connection.getNormal());
				startCircular.setCentre(newMidPoint);

				// Weld Plate Profile Treatment
				WeldPlate newWeldPlate = InstanceWrapperExtensions
						.createInstance(WeldPlate.class, connection
								.umlInstance().getName() + "_weldPlate");
				newWeldPlate.setHeight(-uniNode.getWeldPlateHeight());
				newWeldPlate.setDirection(connection.getNormal());
				newWeldPlate.setUniversalNode(uniNode);
				newWeldPlate.setProfile(startCircular);

			}
			if (allUniNodes.contains(connection.getEndNode())) {

				UniversalNode uniNode = InstanceWrapperExtensions
						.allInstancesAsMap(UniversalNode.class)
						.get(connection.getEndNode().umlInstance().getName());
				Point newMidPoint = PointTransformations.copyPoint(uniNode,
						"newMidpointAtEnd");
				newMidPoint = PointTransformations.movePointAlongDirection(
						newMidPoint,
						-uniNode.getNodeRadius() - uniNode.getScrewDistance()
								- uniNode.getWeldPlateHeight(),
						connection.getNormal());
				endCircular.setCentre(newMidPoint);

				// Weld Plate Profile Treatment
				WeldPlate newWeldPlate = InstanceWrapperExtensions
						.createInstance(WeldPlate.class, connection
								.umlInstance().getName() + "_weldPlate");
				newWeldPlate.setHeight(uniNode.getWeldPlateHeight());
				newWeldPlate.setDirection(connection.getNormal());
				newWeldPlate.setUniversalNode(uniNode);
				newWeldPlate.setProfile(endCircular);

			}
			allUniNodes = null; // Deletion
		}

	}

}