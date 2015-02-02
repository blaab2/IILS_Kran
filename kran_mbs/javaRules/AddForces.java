import geometry.Component;
import geometry.Cuboid;

import java.util.Collection;

import kran_mbs.classes.MastMBSBodyElement;
import kran_v2.classes.Abspannbock;
import kran_v2.classes.Hauptausleger;
import kran_v2.classes.Kran;
import kran_v2.classes.Nebenausleger;
import kran_v2.classes.Spitzenausleger;
import multibody.profile.uml.classes.Body;
import multibody.profile.uml.classes.Force;
import multibody.profile.uml.classes.GeneralJoint;
import multibody.profile.uml.classes.GeometryFrom43;
import multibody.profile.uml.classes.ImplicitInertiaProperties;
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

						createLast(mbs, kran, mastMBSBodyElement);

						break;

					}
				}
				break;

			}
		}

		if (spitzenauslegerlist.size() == 0) {
			Hauptausleger hauptausleger = InstanceWrapperExtensions.allInstances(Hauptausleger.class).iterator().next();
			for (MastMBSBodyElement mastMBSBodyElement : mastMBS) {
				if (mastMBSBodyElement.getMast().equals(hauptausleger)) {

					createLast(mbs, kran, mastMBSBodyElement);

					break;

				}
			}

		}

		// GEwichtestapel 1

		Abspannbock abspannbock = InstanceWrapperExtensions.allInstances(Abspannbock.class).iterator().next();

		for (MastMBSBodyElement mastMBSBodyElement : mastMBS) {
			if (mastMBSBodyElement.getMast().equals(abspannbock)) {

				Force force1 = InstanceWrapperExtensions.createInstance(Force.class, "Gewichte1");

				mbs.load_add_(force1);

				force1.setActionElement(mastMBSBodyElement.getEndemarker());
				force1.setCoordinateSystem(mbs.getGround());
				force1.setFz("-" + kran.getUnterbau().getGewichte().getGesamtmassesoll() * 9.81);

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
						force1.setFz("-" + kran.getGewichtewagen().getGesamtmassesoll() * 9.81);

						break;

					}
				}
			}
		}

	}

	private void createLast(MBSModel mbs, Kran kran, MastMBSBodyElement mastMBSBodyElement) {
		// Gewichtskraft
		Force force1 = InstanceWrapperExtensions.createInstance(Force.class, "Last1");

		// Gewichtebody erstellen
		Body lastBody = InstanceWrapperExtensions.createInstance(Body.class, "LastBody");
		GeometryFrom43 geometry43 = InstanceWrapperExtensions.createInstance(GeometryFrom43.class, "LastBodyGeometry43");
		Component geometryComponent = InstanceWrapperExtensions.createInstance(Component.class, "LastBodyGeometryComponent");
		Cuboid cuboid = InstanceWrapperExtensions.createInstance(Cuboid.class, "LastCuboid");
		ImplicitInertiaProperties lastInertia = InstanceWrapperExtensions.createInstance(ImplicitInertiaProperties.class, "LastBodyPropertries");
		GeneralJoint generalJoint = InstanceWrapperExtensions.createInstance(GeneralJoint.class, "LastBodyJoint");

		mbs.body_add_(lastBody);
		mbs.joint_add_(generalJoint);

		cuboid.setLengthX(1000.);
		cuboid.setLengthY(1000.);
		cuboid.setLengthZ(1000.);

		lastBody.setPositionReference(mbs.getGround());
		lastBody.setGeometry(geometry43);

		lastBody.setLocalX(-cuboid.getLengthX() / 2);
		lastBody.setLocalY(-cuboid.getLengthY() / 2);
		lastBody.setLocalZ(5000.);
		lastBody.setLocalX(kran.getArbeitsbereichx() * 1000);
		lastBody.setInertiaProperties(lastInertia);

		lastInertia.setDensity(kran.getLast() / (1000 * 1000 * 1000));

		geometry43.setComponent(geometryComponent);

		geometryComponent.setShape(cuboid);

		generalJoint.setBody1(mastMBSBodyElement);
		generalJoint.setBody2(lastBody);
		generalJoint.setAppliedLocation(mastMBSBodyElement.getEndemarker());
		generalJoint.setConstrainRotX(false);
		generalJoint.setConstrainRotY(false);
		generalJoint.setConstrainRotZ(false);
		generalJoint.setConstrainX(true);
		generalJoint.setConstrainY(true);
		generalJoint.setConstrainZ(true);

		// mbs.load_add_(force1);
		// // force1.setActionElement(mastMBSBodyElement);
		// force1.setActionElement(mastMBSBodyElement.getEndemarker());
		// force1.setCoordinateSystem(mbs.getGround());
		// force1.setFz("-" + kran.getLast() * 9.81 / 1000);

	}
}