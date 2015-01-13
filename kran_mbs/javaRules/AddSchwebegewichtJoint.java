import java.util.Collection;

import kran_mbs.classes.MastMBSBodyElement;
import kran_v2.classes.Abspannbock;
import kran_v2.classes.Kran;
import kran_v2.classes.Nebenausleger;
import multibody.profile.uml.classes.MBSModel;
import multibody.profile.uml.classes.Marker;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class AddSchwebegewichtJoint extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		// TODO Insert Rule Code here
		MBSModel mbs = InstanceWrapperExtensions.allInstances(MBSModel.class).iterator().next();
		Kran kran = InstanceWrapperExtensions.allInstances(Kran.class).iterator().next();

		if (kran == null) {
			System.out.println("kein Kran gefunden");
			return;
		}
		if (mbs == null) {
			System.out.println("kein MBS Model gefunden");
		}

		Collection<MastMBSBodyElement> mastMBS = InstanceWrapperExtensions.allInstances(MastMBSBodyElement.class);

		Collection<Nebenausleger> nebenauslegerlist = InstanceWrapperExtensions.allInstances(Nebenausleger.class);
		for (Nebenausleger nebenausleger : nebenauslegerlist) {

			if (nebenausleger != null && !(nebenausleger instanceof Abspannbock)) {
				for (MastMBSBodyElement mastMBSBodyElement : mastMBS) {
					if (mastMBSBodyElement.getMast().equals(nebenausleger)) {

						Marker marker = InstanceWrapperExtensions.createInstance(Marker.class, "GewichteJointMarker");
						mastMBSBodyElement.marker_add_(marker);
						marker.setPositionReference(mastMBSBodyElement);
						marker.setLocalX(nebenausleger.getLaenge() * 1000);

						break;
					}
				}
			}
		}
	}
}
