package Transformations;

import geometry.Direction;
import geometry.Point;
import geometry.PolyLine;
import de.iils.dc43.scriptrule.UmlConnectedCollection;

public class PolylineTransformation {

	/**
	 * Translates a Polyline to a new Coordinate.
	 * 
	 * @param PolyLine
	 *            polyline
	 * @param Point
	 *            centerPoint
	 */
	public static void translateToPoint(PolyLine polyline, Point centerPoint) {

		// get all points
		UmlConnectedCollection<Point> points = polyline.getElement();
		if (points.isEmpty()) {
			return;
		}

		// translate points
		for (Point point : points) {
			point.setX(point.getX() + centerPoint.getX());
			point.setY(point.getY() + centerPoint.getY());
			point.setZ(point.getZ() + centerPoint.getZ());
		}

		return;
	}

	/**
	 * Translates a Polyline along a Direction with value distance.
	 * 
	 * @param PolyLine
	 *            polyline
	 * @param Direction
	 *            direction
	 * @param Double
	 *            distance
	 */
	public static void translateAlongDirection(PolyLine polyline, Direction direction, Double distance) {

		// get all points
		UmlConnectedCollection<Point> points = polyline.getElement();
		if (points.isEmpty()) {
			return;
		}

		for (Point point : points) {
			point = PointTransformations.movePointAlongDirection(point, distance, direction);
		}

	}

	/**
	 * Rotates a PolyLine into a new Coordinate System with the new Z-Direction
	 * newZAxis. The Orientation is calculated in a certain way, so that the
	 * Y-Axis stays in the XY-Plane. This can be fixed by a Rotation along the
	 * newZAxis, which is done by another function (This method of calculation
	 * should be quite cheap).
	 * 
	 * @param PolyLine
	 *            polyline
	 * @param Direction
	 *            newZAxis
	 */
	public static void rotate(PolyLine polyline, Direction newZAxis) {

		Double[][] trafoMatrix = new Double[3][3];

		// get all points
		UmlConnectedCollection<Point> points = polyline.getElement();
		if (points.isEmpty()) {
			return;
		}

		Double len = Math.sqrt(newZAxis.getDx() * newZAxis.getDx() + newZAxis.getDy() * newZAxis.getDy() + newZAxis.getDz() * newZAxis.getDz());
		newZAxis.setDx(newZAxis.getDx() / len);
		newZAxis.setDy(newZAxis.getDy() / len);
		newZAxis.setDz(newZAxis.getDz() / len);

		// Rotation
		// Y
		len = Math.sqrt(newZAxis.getDx() * newZAxis.getDx() + newZAxis.getDy() * newZAxis.getDy());
		if (len < 0.001) {
			// newZ is almost z, thus len almost zero. Choose old Y-Axis then.
			trafoMatrix[0][1] = 0.; // y1
			trafoMatrix[1][1] = 1.; // y2
			trafoMatrix[2][1] = 0.; // y3
		} else {
			trafoMatrix[0][1] = newZAxis.getDy() / len; // y1
			trafoMatrix[1][1] = -newZAxis.getDx() / len; // y2
			trafoMatrix[2][1] = 0.; // y3
		}

		// Z
		trafoMatrix[0][2] = newZAxis.getDx(); // z1
		trafoMatrix[1][2] = newZAxis.getDy(); // z2
		trafoMatrix[2][2] = newZAxis.getDz(); // z3
		// X (by cross product)
		trafoMatrix[0][0] = trafoMatrix[1][1] * trafoMatrix[2][2] - trafoMatrix[2][1] * trafoMatrix[1][2]; // x1
		trafoMatrix[1][0] = trafoMatrix[2][1] * trafoMatrix[0][2] - trafoMatrix[0][1] * trafoMatrix[2][2]; // x2
		trafoMatrix[2][0] = trafoMatrix[0][1] * trafoMatrix[1][2] - trafoMatrix[1][1] * trafoMatrix[0][2]; // x3
		len = Math.sqrt(trafoMatrix[0][0] * trafoMatrix[0][0] + trafoMatrix[1][0] * trafoMatrix[1][0] + trafoMatrix[2][0] * trafoMatrix[2][0]);
		trafoMatrix[0][0] = trafoMatrix[0][0] / len;
		trafoMatrix[1][0] = trafoMatrix[1][0] / len;
		trafoMatrix[2][0] = trafoMatrix[2][0] / len;

		// translate points
		for (Point point : points) {

			Double x = point.getX();
			Double y = point.getY();
			Double z = point.getZ();
			// Rotate into new direction
			point.setX(trafoMatrix[0][0] * x + trafoMatrix[0][1] * y + trafoMatrix[0][2] * z);
			point.setY(trafoMatrix[1][0] * x + trafoMatrix[1][1] * y + trafoMatrix[1][2] * z);
			point.setZ(trafoMatrix[2][0] * x + trafoMatrix[2][1] * y + trafoMatrix[2][2] * z);
		}

		return;

	}

	/**
	 * Rotate a PolyLine along a Direction. (The Rotation is done by a
	 * Quaternion Rotation)
	 * 
	 * @param PolyLine
	 *            polyline
	 * @param Direction
	 *            rotAxis
	 * @param Double
	 *            angle
	 */
	public static void rotateAroundAxis(PolyLine polyline, Direction rotAxis, Double angle) {

		Double[][] orientMatrix = new Double[3][3];
		Double q0, q1, q2, q3;

		// get all points
		UmlConnectedCollection<Point> points = polyline.getElement();
		if (points.isEmpty()) {
			return;
		}

		q0 = Math.cos(angle / 2.);
		q1 = rotAxis.getDx() * Math.sin(angle / 2.);
		q2 = rotAxis.getDy() * Math.sin(angle / 2.);
		q3 = rotAxis.getDz() * Math.sin(angle / 2.);

		orientMatrix[0][0] = Math.pow(q1, 2.) - Math.pow(q2, 2.) - Math.pow(q3, 2.) + Math.pow(q0, 2.);
		orientMatrix[1][0] = 2 * (q1 * q2 - q3 * q0);
		orientMatrix[2][0] = 2 * (q1 * q3 + q2 * q0);

		orientMatrix[0][1] = 2 * (q1 * q2 + q3 * q0);
		orientMatrix[1][1] = -Math.pow(q1, 2.) + Math.pow(q2, 2.) - Math.pow(q3, 2.) + Math.pow(q0, 2.);
		orientMatrix[2][1] = 2 * (q2 * q3 - q1 * q0);

		orientMatrix[0][2] = 2 * (q1 * q3 - q2 * q0);
		orientMatrix[1][2] = 2 * (q2 * q3 + q1 * q0);
		orientMatrix[2][2] = -Math.pow(q1, 2.) - Math.pow(q2, 2.) + Math.pow(q3, 2.) + Math.pow(q0, 2.);

		// translate points
		for (Point point : points) {

			Double x = point.getX();
			Double y = point.getY();
			Double z = point.getZ();
			// Rotate into new direction
			point.setX(orientMatrix[0][0] * x + orientMatrix[0][1] * y + orientMatrix[0][2] * z);
			point.setY(orientMatrix[1][0] * x + orientMatrix[1][1] * y + orientMatrix[1][2] * z);
			point.setZ(orientMatrix[2][0] * x + orientMatrix[2][1] * y + orientMatrix[2][2] * z);
		}

		return;

	}

}
