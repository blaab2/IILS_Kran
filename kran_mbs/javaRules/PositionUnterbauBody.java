import java.util.Collection;

import kran_mbs.classes.MBSBody;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class PositionUnterbauBody extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		// Durchsucht alle Bodies nach dem Unterbau Body und setzt dessen
		// Positionswerte

		Collection<MBSBody> bodies = InstanceWrapperExtensions.allInstances(MBSBody.class);
		for (MBSBody body : bodies) {

			if (body.umlInstance().getName().equals("Unterbau")) {

				// body.setLocalX(localX);

			}
		}

	}

}