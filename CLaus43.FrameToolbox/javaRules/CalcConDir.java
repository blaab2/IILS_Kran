import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;

import claus43.frametoolbox.classes.ConDirection;
import claus43.frametoolbox.classes.Connection;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class CalcConDir extends JavaRule {

	public void execute(TransformationRunner trafoRunner) {
		long start = System.currentTimeMillis();
		
		
		Collection<Connection> allCons = InstanceWrapperExtensions
				.allInstances(Connection.class);
	

		int i = 0;
		
		for (Connection connection : allCons) {
			
			
			ConDirection normal = connection.getNormal();
			
			if (normal == null
					|| connection.getEndNode() == null
					|| connection.getStartNode() == null)
				continue;

			normal.setDx(
					connection.getEndNode().getX()
							- connection.getStartNode().getX());
			normal.setDy(
					connection.getEndNode().getY()
							- connection.getStartNode().getY());
			normal.setDz(
					connection.getEndNode().getZ()
							- connection.getStartNode().getZ());
			
			
			Double len = Math.sqrt(normal.getDx()
					* normal.getDx()
					+ normal.getDy()
					* normal.getDy()
					+ normal.getDz()
					* normal.getDz());
			normal.setDx(normal.getDx() / len);
			normal.setDy(normal.getDy() / len);
			normal.setDz(normal.getDz() / len);
			
			i++;
			
		}
 
	}

}