import geometry.Component;
import geometry.Sphere;

import java.util.Collection;

import kran_v2.classes.Kran;
import kran_v2.classes.Mast;
import kran_v2.classes.UnterbauModel;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class visualizeCOG extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Component cogcollector = InstanceWrapperExtensions.createInstance(Component.class, "cogcollectorcomponent");

		/* ------------ visualisiere Mastschwerpunkte ------------ */

		/* Settings */
		double minradius = 200.;
		double maxradius = 500.;
		double radius;

		Collection<Mast> maeste = InstanceWrapperExtensions.allInstances(Mast.class);
		Collection<Kran> kraene = InstanceWrapperExtensions.allInstances(Kran.class);
		Kran kran = kraene.iterator().next();

		Double minVol, maxVol;

		minVol = maeste.iterator().next().getVolumen().doubleValue();
		maxVol = maeste.iterator().next().getVolumen().doubleValue();

		for (Mast mast : maeste) {
			if (minVol > mast.getVolumen()) {
				minVol = mast.getVolumen();
			}
			if (maxVol < mast.getVolumen()) {
				maxVol = mast.getVolumen();
			}
		}

		for (Mast mast : maeste) {

			Component cogcomponent = InstanceWrapperExtensions.createInstance(Component.class, mast.umlInstance().getName() + "cogcomponent");
			Sphere cogsphere = InstanceWrapperExtensions.createInstance(Sphere.class, mast.umlInstance().getName() + "cogsphere");

			radius = minradius + (maxradius - minradius) / (maxVol - minVol) * (mast.getVolumen() - minVol);
			if (radius == 0 || maxVol.equals(minVol)) {
				radius = maxradius;
			}

			cogsphere.setRadius(radius);
			cogsphere.setLx(mast.getSchwerpunktx());
			cogsphere.setLy(mast.getSchwerpunkty());
			cogsphere.setLz(mast.getSchwerpunktz());

			cogcomponent.setShape(cogsphere);

			cogcollector.sub_add_(cogcomponent);

		}

		/* ------------ visualisiere Unterbaumodell ------------ */

		Collection<UnterbauModel> unterbaumodelle = InstanceWrapperExtensions.allInstances(UnterbauModel.class);
		UnterbauModel unterbaumodel = unterbaumodelle.iterator().next();

		Component cogcomponent = InstanceWrapperExtensions.createInstance(Component.class, unterbaumodel.umlInstance().getName() + "cogcomponent");
		Sphere cogsphere = InstanceWrapperExtensions.createInstance(Sphere.class, unterbaumodel.umlInstance().getName() + "cogsphere");

		cogsphere.setRadius(500.);
		cogsphere.setLx(unterbaumodel.getSchwerpunktyk());
		cogsphere.setLx(unterbaumodel.getSchwerpunktxk());
		cogsphere.setLy(unterbaumodel.getSchwerpunktyk());
		cogsphere.setLz(unterbaumodel.getSchwerpunktzk());

		cogcomponent.setShape(cogsphere);

		cogcollector.sub_add_(cogcomponent);

		/* ------------ visualisiere Kranschwerpunkt ------------ */

		cogcomponent = InstanceWrapperExtensions.createInstance(Component.class, kran.umlInstance().getName() + "cogcomponent");
		cogsphere = InstanceWrapperExtensions.createInstance(Sphere.class, kran.umlInstance().getName() + "cogsphere");

		cogsphere.setRadius(800.);
		cogsphere.setLx(kran.getSchwerpunktx());
		cogsphere.setLy(kran.getSchwerpunkty());
		cogsphere.setLz(kran.getSchwerpunktz());

		cogcomponent.setShape(cogsphere);

		cogcollector.sub_add_(cogcomponent);

		kran.sub_add_(cogcollector);

	}
}