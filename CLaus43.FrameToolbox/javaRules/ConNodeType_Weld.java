import java.util.Collection;

import claus43.frametoolbox.classes.Connection;
import claus43.frametoolbox.classes.Weld;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class ConNodeType_Weld extends JavaRule {

	public void execute(TransformationRunner trafoRunner) {

		Collection<Weld> allWeldNodes = InstanceWrapperExtensions
				.allInstances(Weld.class);

		for (Weld weld : allWeldNodes) {

			Collection<Connection> connectionsOfWeldNode = weld.getConnection();

			// Check for Connection
			if (connectionsOfWeldNode.isEmpty()) {
				getLogger().warn(
						"WeldNode: " + weld.umlInstance().getName()
								+ " has no Connection and will be skipped!");
				continue;
			}

		}
	}

}