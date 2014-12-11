/**
 * 
 */
package Transformations;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;

import geometry.Direction;
import geometry.Point;

/**
 * @author phoenix
 *
 */
public class PointTransformations {

	public static Point copyPoint(Point point, String name) {
		
		Point newPoint = InstanceWrapperExtensions.createInstance(Point.class,name);
		newPoint.setX(point.getX());
		newPoint.setY(point.getY());
		newPoint.setZ(point.getZ());
		
		return newPoint;
	}
	
	public static Point movePointAlongDirection(Point point,Double distance, Direction direction) {
		
		point.setX(point.getX()+direction.getDx()*distance);
		point.setY(point.getY()+direction.getDy()*distance);
		point.setZ(point.getZ()+direction.getDz()*distance);
		
		return point;
	}
	
}
