import java.util.Collection;

import kran_mbs.classes.MastMBSBodyElement;
import kran_v2.classes.Spitzenausleger;
import multibody.profile.uml.classes.Force;
import multibody.profile.uml.classes.MBSModel;
import multibody.profile.uml.classes.Marker;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class AddForces extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		// Finde den letzten Spitzenausleger
		Collection<Spitzenausleger> spitzenauslegerlist = InstanceWrapperExtensions.allInstances(Spitzenausleger.class);
		for (Spitzenausleger spitzenausleger : spitzenauslegerlist) {

			if (spitzenausleger.getNextspitzenausleger() == null) {

				Collection<MastMBSBodyElement> mastMBS = InstanceWrapperExtensions.allInstances(MastMBSBodyElement.class);
				for (MastMBSBodyElement mastMBSBodyElement : mastMBS) {
					if (mastMBSBodyElement.getMast().equals(spitzenausleger)) {

						Marker marker = InstanceWrapperExtensions.createInstance(Marker.class, "Last1Marker");
						marker.setPositionReference(mastMBSBodyElement);
						marker.setLocalX(spitzenausleger.getLaenge());

						Force force1 = InstanceWrapperExtensions.createInstance(Force.class, "Last1");
						MBSModel mbs = InstanceWrapperExtensions.allInstances(MBSModel.class).iterator().next();
						mbs.load_add_(force1);
						// force1.setActionElement(mastMBSBodyElement);
						force1.setActionElement(marker);
						force1.setCoordinateSystem(mbs.getGround());
						force1.setFz("-1000");

						break;

					}
				}
				break;

			}
		}
	}
}