import geometry.Point;

import java.util.Collection;

import Transformations.PolylineTransformation;
import claus43.frametoolbox.classes.Connection;
import claus43.frametoolbox.classes.UniversalNode;
import claus43.frametoolbox.classes.UserCrossSection;
import claus43.frametoolbox.classes.WeldPlate;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.scriptrule.UmlConnectedCollection;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class TransformUserCrossSection extends JavaRule {

	public void execute(TransformationRunner trafoRunner) {

		Collection<UserCrossSection> allCrossSections = InstanceWrapperExtensions.allInstances(UserCrossSection.class);

		// Iterate over all UserCrossSections == PolyLine
		for (UserCrossSection startCrossSection : allCrossSections) {

			// Check for Connection
			if (startCrossSection.getConnection() == null) {
				getLogger().warn("UserCrossSection: " + startCrossSection.umlInstance().getName() + " has no Connection and will be skipped.");
				// getLogger().warn("UserCrossSection: " +
				// startCrossSection.umlInstance().getName() +
				// " has no Connection and will be skipped and DELETED.");
				// startCrossSection.umlInstance().destroy();
				continue;
			}
			Connection connection = startCrossSection.getConnection();

			UmlConnectedCollection<Point> points = startCrossSection.getElement();
			if (points.isEmpty()) {
				getLogger().warn("UserCrossSection: " + startCrossSection.umlInstance().getName() + " has no Points and will be skipped and DELETED.");
				startCrossSection.umlInstance().destroy();
				continue;
			}
			String name = startCrossSection.umlInstance().getName();

			// Create Copy
			startCrossSection.umlInstance().setName(name + "_start");
			UserCrossSection endCrossSection = createCopyOfUserCrossSection(startCrossSection, name + "_end");

			// Connect CrossSections to each other
			startCrossSection.next_add_(endCrossSection);

			// Circles to Connection
			connection.setEndCross(endCrossSection);
			connection.setStartCross(startCrossSection);
			// Circles to Connection as Loft Elements
			connection.setStart(startCrossSection);
			connection.element_add_(startCrossSection);
			connection.element_add_(endCrossSection);

			// Rotate into new Z-Axis and leave Y in XY-Plane
			PolylineTransformation.rotate(startCrossSection, connection.getNormal());
			PolylineTransformation.rotate(endCrossSection, connection.getNormal());
			// Quaternion-Rotation around new Z-Axis for Orientation fix
			PolylineTransformation.rotateAroundAxis(startCrossSection, connection.getNormal(), startCrossSection.getOrientation());
			PolylineTransformation.rotateAroundAxis(endCrossSection, connection.getNormal(), endCrossSection.getOrientation());
			// Move into new Center Point
			PolylineTransformation.translateToPoint(startCrossSection, connection.getStartNode());
			PolylineTransformation.translateToPoint(endCrossSection, connection.getEndNode());

			// Treat ConNodes, must be here too (MUCH EASIER THAN LATER)
			// Uni Nodes
			Collection<UniversalNode> allUniNodes = InstanceWrapperExtensions.allInstances(UniversalNode.class);
			if (allUniNodes.contains(connection.getStartNode())) {

				UniversalNode uniNode = InstanceWrapperExtensions.allInstancesAsMap(UniversalNode.class).get(connection.getStartNode().umlInstance().getName());
				PolylineTransformation.translateAlongDirection(startCrossSection, connection.getNormal(), uniNode.getNodeRadius() + uniNode.getScrewDistance()
						+ uniNode.getWeldPlateHeight());

				// Weld Plate Profile Treatment
				WeldPlate newWeldPlate = InstanceWrapperExtensions.createInstance(WeldPlate.class, connection.umlInstance().getName() + "_weldPlate");
				newWeldPlate.setHeight(-uniNode.getWeldPlateHeight());
				newWeldPlate.setDirection(connection.getNormal());
				newWeldPlate.setUniversalNode(uniNode);
				newWeldPlate.setProfile(startCrossSection);

			}
			if (allUniNodes.contains(connection.getEndNode())) {

				UniversalNode uniNode = InstanceWrapperExtensions.allInstancesAsMap(UniversalNode.class).get(connection.getEndNode().umlInstance().getName());
				PolylineTransformation.translateAlongDirection(endCrossSection, connection.getNormal(), -uniNode.getNodeRadius() - uniNode.getScrewDistance()
						- uniNode.getWeldPlateHeight());

				// Weld Plate Profile Treatment
				WeldPlate newWeldPlate = InstanceWrapperExtensions.createInstance(WeldPlate.class, connection.umlInstance().getName() + "_weldPlate");
				newWeldPlate.setHeight(uniNode.getWeldPlateHeight());
				newWeldPlate.setDirection(connection.getNormal());
				newWeldPlate.setUniversalNode(uniNode);
				newWeldPlate.setProfile(endCrossSection);

			}
			allUniNodes = null; // Deletion
		}

	}

	private static UserCrossSection createCopyOfUserCrossSection(UserCrossSection userCrossSection, String name) {

		boolean first = true;
		Point firstPoint = null;
		Point lastPoint = null;

		UserCrossSection copy = InstanceWrapperExtensions.createInstance(UserCrossSection.class, name);
		copy.setOrientation(userCrossSection.getOrientation());

		for (Point point : userCrossSection.getElement()) {

			Point newPoint = InstanceWrapperExtensions.createInstance(Point.class, point.umlInstance().getName());
			newPoint.setX(point.getX());
			newPoint.setY(point.getY());
			newPoint.setZ(point.getZ());

			copy.element_add_(newPoint);

			if (first) {
				firstPoint = newPoint;
				copy.setStart(firstPoint);
				lastPoint = newPoint;
				first = false;
			} else {
				lastPoint.nextPoint_add_(newPoint);
				lastPoint = newPoint;
			}
		}
		if (userCrossSection.getElement().size() > 1) {
			lastPoint.nextPoint_add_(firstPoint);
		} else {
			getLogger().warn("UserCrossSection has only one Point, this might cause Errors!");
		}

		return copy;

	}

}