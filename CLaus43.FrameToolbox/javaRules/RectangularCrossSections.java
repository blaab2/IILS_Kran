import geometry.Direction;
import geometry.Point;
import geometry.PolyLine;

import java.util.Collection;

import Transformations.PolylineTransformation;
import claus43.frametoolbox.classes.Connection;
import claus43.frametoolbox.classes.Rectangular;
import claus43.frametoolbox.classes.UniversalNode;
import claus43.frametoolbox.classes.WeldPlate;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;


public class RectangularCrossSections extends JavaRule {

	public void execute(TransformationRunner trafoRunner) {

		
		Collection<Rectangular> allRectangularSections = InstanceWrapperExtensions
				.allInstances(Rectangular.class);

		for (Rectangular startRectangular : allRectangularSections) {

			// Check for Connection
			if (startRectangular.getConnection() == null) {
				getLogger().warn(
						"Rectangular Cross Section: "
								+ startRectangular.toString()
								+ " has no connection and will be skipped.");
				// getLogger().warn("Rectangular Cross Section: " +
				// startRectangular.toString() +
				// " has no connection and will be skipped and DELETED.");
				// startRectangular.umlInstance().destroy();
				continue;
			}
			String name = startRectangular.umlInstance().getName();

			// Start Rectangular as PolyLine
			startRectangular.umlInstance().setName(name + "_start");
			startRectangular = createRectanglePoints(startRectangular);

			// End Rectangular as PolyLine
			Rectangular endRectangular = InstanceWrapperExtensions
					.createInstance(Rectangular.class, name + "_end");
			endRectangular.setHeight(startRectangular.getHeight());
			endRectangular.setWidth(startRectangular.getWidth());
			endRectangular.setOrientation(startRectangular.getOrientation());
			endRectangular = createRectanglePoints(endRectangular);

			// Connect Rectangulars to each other
			startRectangular.next_add_(endRectangular);

			// Rectangulars to Connection
			Connection connection = startRectangular.getConnection();
			connection.setEndCross(endRectangular);
			connection.setStartCross(startRectangular);
			// Rectangulars to Connection as Loft Elements
			connection.element_add_(startRectangular);
			connection.element_add_(endRectangular);
			connection.setStart(startRectangular);

			
			// Transformation into Nodes
			PolylineTransformation.rotate(startRectangular,
					connection.getNormal());
			PolylineTransformation.rotate(endRectangular,
					connection.getNormal());
			PolylineTransformation.rotateAroundAxis(startRectangular,
					connection.getNormal(), startRectangular.getOrientation());
			PolylineTransformation.rotateAroundAxis(endRectangular,
					connection.getNormal(), endRectangular.getOrientation());
		    System.out.println("Starteds");
			PolylineTransformation.translateToPoint(startRectangular,
					connection.getStartNode());
			System.out.println("Starteds");	
			PolylineTransformation.translateToPoint(endRectangular,
					connection.getEndNode());
			
			// Treat ConNodes, must be here too (MUCH EASIER THAN LATER)
			// Uni Nodes
			Collection<UniversalNode> allUniNodes = InstanceWrapperExtensions
					.allInstances(UniversalNode.class);
			if (allUniNodes.contains(connection.getStartNode())) {

				UniversalNode uniNode = InstanceWrapperExtensions
						.allInstancesAsMap(UniversalNode.class).get(
								connection.getStartNode().umlInstance()
										.getName());
				PolylineTransformation.translateAlongDirection(
						startRectangular, connection.getNormal(),
						uniNode.getNodeRadius() + uniNode.getScrewDistance()
								+ uniNode.getWeldPlateHeight());

				// Weld Plate Profile Treatment
				WeldPlate newWeldPlate = InstanceWrapperExtensions
						.createInstance(WeldPlate.class, connection
								.umlInstance().getName() + "_weldPlate");
				newWeldPlate.setHeight(-uniNode.getWeldPlateHeight());
				newWeldPlate.setDirection(connection.getNormal());
				newWeldPlate.setUniversalNode(uniNode);
				newWeldPlate.setProfile(startRectangular);

			}
			if (allUniNodes.contains(connection.getEndNode())) {

				UniversalNode uniNode = InstanceWrapperExtensions
						.allInstancesAsMap(UniversalNode.class)
						.get(connection.getEndNode().umlInstance().getName());
				PolylineTransformation.translateAlongDirection(endRectangular,
						connection.getNormal(),
						-uniNode.getNodeRadius() - uniNode.getScrewDistance()
								- uniNode.getWeldPlateHeight());

				// Weld Plate Profile Treatment
				WeldPlate newWeldPlate = InstanceWrapperExtensions
						.createInstance(WeldPlate.class, connection
								.umlInstance().getName() + "_weldPlate");
				newWeldPlate.setHeight(uniNode.getWeldPlateHeight());
				newWeldPlate.setDirection(connection.getNormal());
				newWeldPlate.setUniversalNode(uniNode);
				newWeldPlate.setProfile(endRectangular);

			}
			allUniNodes = null; // Deletion

			// Correct Nodes Into Plane (BUGFIX Catia)
			// correctPointsIntoOnePlane(startRectangular,connection.getNormal());
			// correctPointsIntoOnePlane(endRectangular,
			// connection.getNormal());
		}

	}

	private Rectangular createRectanglePoints(Rectangular newRectangle) {

		Point p1 = InstanceWrapperExtensions.createInstance(Point.class, "p1");
		p1.setX(newRectangle.getWidth() / 2.);
		p1.setY(newRectangle.getHeight() / 2.);
		p1.setZ(0.);
		// p2
		Point p2 = InstanceWrapperExtensions.createInstance(Point.class, "p2");
		p2.setX(newRectangle.getWidth() / 2.);
		p2.setY(-newRectangle.getHeight() / 2.);
		p2.setZ(0.);
		// p3
		Point p3 = InstanceWrapperExtensions.createInstance(Point.class, "p3");
		p3.setX(-newRectangle.getWidth() / 2.);
		p3.setY(-newRectangle.getHeight() / 2.);
		p3.setZ(0.);
		// p4
		Point p4 = InstanceWrapperExtensions.createInstance(Point.class, "p4");
		p4.setX(-newRectangle.getWidth() / 2.);
		p4.setY(newRectangle.getHeight() / 2.);
		p4.setZ(0.);

		// Next Links
		p1.nextPoint_add_(p2);
		p2.nextPoint_add_(p3);
		p3.nextPoint_add_(p4);
		p4.nextPoint_add_(p1);

		// Assign Points to Profile at Start and End
		newRectangle.setStart(p1);
		newRectangle.element_add_(p1);
		newRectangle.element_add_(p2);
		newRectangle.element_add_(p3);
		newRectangle.element_add_(p4);

		return newRectangle;

	}

	private void correctPointsIntoOnePlane(PolyLine polyline,
			Direction normal) {

		// pOnE = p - dot(p-aufpunkt,normal)/dot(normal,normal)*normal;

		Integer iPoint = 0;
		Double dotProductBasis = 0.;
		Point firstPoint = null;

		// Force all Points into Plane, first Point is the basis
		for (Point point : polyline.getElement()) {

			if (iPoint > 0) {
				Double dotProductPoint = point.getX() * normal.getDx()
						+ point.getY() * normal.getDy() + point.getZ()
						* normal.getDz();

				point.setX(point.getX() + (dotProductBasis - dotProductPoint)
						* normal.getDx());
				point.setY(point.getY() + (dotProductBasis - dotProductPoint)
						* normal.getDy());
				point.setZ(point.getZ() + (dotProductBasis - dotProductPoint)
						* normal.getDz());

			} else {
				dotProductBasis = point.getX() * normal.getDx() + point.getY()
						* normal.getDy() + point.getZ() * normal.getDz();
				firstPoint = point;
			}

			iPoint = iPoint + 1;
		}

	}
}