import java.util.Collection;

import kran_mbs.classes.MastMBSBodyElement;
import kran_v2.classes.Abspannbock;
import kran_v2.classes.Kran;
import kran_v2.classes.Nebenausleger;
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

		// Finde den letzten Spitzenausleger und lege Last1 an
		Collection<Spitzenausleger> spitzenauslegerlist = InstanceWrapperExtensions.allInstances(Spitzenausleger.class);
		for (Spitzenausleger spitzenausleger : spitzenauslegerlist) {

			if (spitzenausleger.getNextspitzenausleger() == null) {

				for (MastMBSBodyElement mastMBSBodyElement : mastMBS) {
					if (mastMBSBodyElement.getMast().equals(spitzenausleger)) {

						Marker marker = InstanceWrapperExtensions.createInstance(Marker.class, "Last1Marker");
						mastMBSBodyElement.marker_add_(marker);
						marker.setPositionReference(mastMBSBodyElement);
						marker.setLocalX(spitzenausleger.getLaenge() * 1000);

						Force force1 = InstanceWrapperExtensions.createInstance(Force.class, "Last1");

						mbs.load_add_(force1);
						// force1.setActionElement(mastMBSBodyElement);
						force1.setActionElement(marker);
						force1.setCoordinateSystem(mbs.getGround());
						force1.setFz("-" + kran.getLast() * 9.81 / 1000);

						break;

					}
				}
				break;

			}
		}

		// GEwichtestapel 1

		Abspannbock abspannbock = InstanceWrapperExtensions.allInstances(Abspannbock.class).iterator().next();

		for (MastMBSBodyElement mastMBSBodyElement : mastMBS) {
			if (mastMBSBodyElement.getMast().equals(abspannbock)) {

				Marker marker = InstanceWrapperExtensions.createInstance(Marker.class, "Gewichte1Marker");
				mastMBSBodyElement.marker_add_(marker);
				marker.setPositionReference(mastMBSBodyElement);
				marker.setLocalX(abspannbock.getLaenge() * 1000);
				Force force1 = InstanceWrapperExtensions.createInstance(Force.class, "Gewichte1");

				mbs.load_add_(force1);

				force1.setActionElement(marker);
				force1.setCoordinateSystem(mbs.getGround());
				force1.setFz("-" + kran.getUnterbau().getGewichte().getGesamtmassesoll() * 9.81 / 1000);

				break;

			}
		}

		// Gewichtestapel 2

		Collection<Nebenausleger> nebenauslegerlist = InstanceWrapperExtensions.allInstances(Nebenausleger.class);
		for (Nebenausleger nebenausleger : nebenauslegerlist) {

			if (nebenausleger != null && !(nebenausleger instanceof Abspannbock)) {
				for (MastMBSBodyElement mastMBSBodyElement : mastMBS) {
					if (mastMBSBodyElement.getMast().equals(nebenausleger)) {

						Marker marker = InstanceWrapperExtensions.createInstance(Marker.class, "Gewichte2Marker");
						mastMBSBodyElement.marker_add_(marker);
						marker.setPositionReference(mastMBSBodyElement);
						marker.setLocalX(nebenausleger.getLaenge() * 1000);
						Force force1 = InstanceWrapperExtensions.createInstance(Force.class, "Gewichte2");

						mbs.load_add_(force1);

						force1.setActionElement(marker);
						force1.setCoordinateSystem(mbs.getGround());
						force1.setFz("-" + kran.getGewichtewagen().getGesamtmassesoll() * 9.81 / 1000);

						break;

					}
				}
			}
		}

	}
}