import gegengewichte.classes.Gewicht;
import gegengewichte.classes.Gewichtestapel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class orderGewichte extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Collection<Gewichtestapel> gewichtecollection = InstanceWrapperExtensions.allInstances(Gewichtestapel.class);

		for (Gewichtestapel gewichte : gewichtecollection) {

			List<Gewicht> gewichtlist = gewichte.getGewicht();
			ArrayList<Gewicht> list = new ArrayList<Gewicht>();
			Gewicht lastgewicht;
			list.addAll(gewichtlist);

			list.remove(gewichte.getFirstgewicht());
			lastgewicht = gewichte.getFirstgewicht();

			for (Gewicht gewicht : list) {
				lastgewicht.setNextgewicht(gewicht);
				lastgewicht = gewicht;
			}

		}

	}
}