import gegengewichte.classes.Gewicht;
import gegengewichte.classes.Gewichtestapel;

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
			Gewicht lastgewicht;

			gewichtlist.remove(gewichte.getFirstgewicht());
			lastgewicht = gewichte.getFirstgewicht();

			for (Gewicht gewicht : gewichtlist) {
				lastgewicht.setNextgewicht(gewicht);
				lastgewicht = gewicht;
			}

		}

	}
}