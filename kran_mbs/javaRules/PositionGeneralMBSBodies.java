import java.util.Collection;

import kran_mbs.classes.MBSBody;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class PositionGeneralMBSBodies extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Collection<MBSBody> bodies = InstanceWrapperExtensions.allInstances(MBSBody.class);
		for (MBSBody body : bodies) {
			if (body.getCorrespondingposition() != null) {
				body.setLocalX(body.getCorrespondingposition().getDx().doubleValue());
				body.setLocalY(body.getCorrespondingposition().getDy().doubleValue());
				body.setLocalZ(body.getCorrespondingposition().getDz().doubleValue());
				body.setLocalPhi(body.getCorrespondingposition().getPhi().doubleValue());
				body.setLocalPsi(body.getCorrespondingposition().getPsi().doubleValue());
				body.setLocalTheta(body.getCorrespondingposition().getTheta().doubleValue());

			}
			System.out.println(body.umlInstance().getName());
		}

	}

}