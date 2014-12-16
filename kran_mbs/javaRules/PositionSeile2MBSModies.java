import java.util.Collection;

import kran_mbs.classes.Seil2MBSBodyElement;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class PositionSeile2MBSModies extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		Collection<Seil2MBSBodyElement> bodies = InstanceWrapperExtensions.allInstances(Seil2MBSBodyElement.class);
		for (Seil2MBSBodyElement body : bodies) {
			if (body.getCorrespondingposition() != null) {
				System.out.println("test");
				body.setLocalX(body.getSeil().getEnde().getX());
				body.setLocalY(body.getSeil().getEnde().getY());
				body.setLocalZ(body.getSeil().getEnde().getZ());
				System.out.println("test");
				body.setLocalTheta(-Math.atan2(body.getSeil().getEnde().getZ() - body.getSeil().getStart().getZ(), body.getSeil().getEnde().getX()
						- body.getSeil().getStart().getX())
						* 180 / Math.PI + 180);

				body.getCorrespondingposition().setDx(body.getLocalX());
				body.getCorrespondingposition().setDy(body.getLocalY());
				body.getCorrespondingposition().setDz(body.getLocalZ());
				body.getCorrespondingposition().setTheta(body.getLocalTheta());

			}
			System.out.println(body.umlInstance().getName());
		}

	}

}