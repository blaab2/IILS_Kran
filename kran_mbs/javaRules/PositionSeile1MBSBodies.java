import java.util.Collection;

import kran_mbs.classes.Seil1MBSBodyElement;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class PositionSeile1MBSBodies extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		Collection<Seil1MBSBodyElement> bodies = InstanceWrapperExtensions.allInstances(Seil1MBSBodyElement.class);
		for (Seil1MBSBodyElement body : bodies) {
			if (body.getCorrespondingposition() != null) {

				body.setLocalX(body.getSeil().getStart().getX());
				body.setLocalY(body.getSeil().getStart().getY());
				body.setLocalZ(body.getSeil().getStart().getZ());
				body.setLocalTheta(-Math.atan2(body.getSeil().getEnde().getZ() - body.getSeil().getStart().getZ(), body.getSeil().getEnde().getX()
						- body.getSeil().getStart().getX())
						* 180 / Math.PI);

				body.getCorrespondingposition().setDx(body.getLocalX());
				body.getCorrespondingposition().setDy(body.getLocalY());
				body.getCorrespondingposition().setDz(body.getLocalZ());
				body.getCorrespondingposition().setTheta(body.getLocalTheta());

			}
			System.out.println(body.umlInstance().getName());
		}

	}

}