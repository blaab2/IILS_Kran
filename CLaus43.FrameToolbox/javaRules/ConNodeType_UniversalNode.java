import java.util.Collection;

import claus43.frametoolbox.classes.Connection;
import claus43.frametoolbox.classes.CrossSection;
import claus43.frametoolbox.classes.Node;
import claus43.frametoolbox.classes.Screw;
import claus43.frametoolbox.classes.UniversalNode;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class ConNodeType_UniversalNode extends JavaRule {

	public void execute(TransformationRunner trafoRunner) {

		Collection<UniversalNode> uniNodes = InstanceWrapperExtensions
				.allInstances(UniversalNode.class);

		for (UniversalNode universalNode : uniNodes) {

			Collection<Connection> connectionsOfUniNode = universalNode
					.getConnection();
			// Check for Connection
			if (connectionsOfUniNode.isEmpty()) {
				getLogger().warn(
						"UniversalNode: "
								+ universalNode.umlInstance().getName()
								+ " has no Connection and will be skipped!");
				continue;
			}
			// CHECK MISSING //

			Node sphericalNode = InstanceWrapperExtensions.createInstance(
					Node.class, universalNode.umlInstance().getName());
			sphericalNode.setUniversalNode(universalNode);
			sphericalNode.setLx(universalNode.getX());
			sphericalNode.setLy(universalNode.getY());
			sphericalNode.setLz(universalNode.getZ());
			sphericalNode.setRadius(universalNode.getNodeRadius());

			for (Connection connection : connectionsOfUniNode) {

				// Point distNode =
				// InstanceWrapperExtensions.createInstance(Point.class,
				// "distNode");

				CrossSection crossSection = connection.getStartCross();

				if (universalNode.equals(connection.getStartNode())) {

					Screw newScrew = InstanceWrapperExtensions.createInstance(
							Screw.class, connection.umlInstance().getName()
									+ "_screw");
					newScrew.setLx(universalNode.getX());
					newScrew.setLy(universalNode.getY());
					newScrew.setLz(universalNode.getZ());
					newScrew.setRadius(universalNode.getScrewDiameter() / 2.);
					newScrew.setHeight(universalNode.getNodeRadius()
							+ universalNode.getScrewDistance());
					newScrew.setRx(connection.getNormal().getDx());
					newScrew.setRy(connection.getNormal().getDy());
					newScrew.setRz(connection.getNormal().getDz());
					newScrew.setUniversalNode(universalNode);

				} else {

					Screw newScrew = InstanceWrapperExtensions.createInstance(
							Screw.class, connection.umlInstance().getName()
									+ "_screw");
					newScrew.setLx(universalNode.getX());
					newScrew.setLy(universalNode.getY());
					newScrew.setLz(universalNode.getZ());
					newScrew.setRadius(universalNode.getScrewDiameter() / 2.);
					newScrew.setHeight(universalNode.getNodeRadius()
							+ universalNode.getScrewDistance());
					newScrew.setRx(-connection.getNormal().getDx());
					newScrew.setRy(-connection.getNormal().getDy());
					newScrew.setRz(-connection.getNormal().getDz());
					newScrew.setUniversalNode(universalNode);

				}

			}

		}

	}

}