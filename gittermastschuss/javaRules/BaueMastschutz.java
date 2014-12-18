import gittermastschuss.classes.AnfangsTeilMastschuss;
import gittermastschuss.classes.EndTeilMastschuss;
import gittermastschuss.classes.Mastschuss;
import gittermastschuss.classes.MittelTeilMastschuss;
import gittermastschuss.classes.TeilMastschuss;

import java.util.Collection;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class BaueMastschutz extends JavaRule {

	public void execute(TransformationRunner trafoRunner) {

		/*
		 * Erstellt einen Gittermastschuss indem Anfang-Mittel- und Endeteile
		 * verkettet werden
		 */

		Collection<Mastschuss> Mastschuesse = InstanceWrapperExtensions.allInstances(Mastschuss.class);

		for (Mastschuss mastschuss : Mastschuesse) {

			mastschuss.setExpanded(0.5);
			// Expandiert Mastschuss wenn nicht bereits expandiert:

			if (mastschuss.getAnfangsTeilMastschuss() == null) {
				// Erzeugtt ein AnfangsTeilMastschuss und fügt dieses dem
				// Mastschuss
				// an
				AnfangsTeilMastschuss anfangsTeil = InstanceWrapperExtensions.createInstance(AnfangsTeilMastschuss.class, mastschuss
						.umlInstance().getName() + "AnfangsTeil");
				mastschuss.setAnfangsTeilMastschuss(anfangsTeil);

				// Erzeugt n Mittelteile und fügt diese dem Mastschuss an
				TeilMastschuss lastItem = anfangsTeil;
				for (int i = 0; i < mastschuss.getTeile(); i++) {
					// erzeuge neues MittelTeil
					MittelTeilMastschuss mittelteil = InstanceWrapperExtensions.createInstance(MittelTeilMastschuss.class, mastschuss
							.umlInstance().getName() + "MittelTeil_" + i);

					// Verbinde neues Teil mit Mastschuss
					mastschuss.mittelTeilMastschuss_add_(mittelteil);

					// Verbinde neues Teil mit Vorgänger
					lastItem.nextteil_(mittelteil);

					// Unterscheiden von ungeraden und geraden Mittelteilen zur
					// Variation der diagonalen Streben
					if (i % 2 == 1) {
						mittelteil.setVariation(2.);
					} else {
						mittelteil.setVariation(1.);
					}

					lastItem = mittelteil;

				}
				EndTeilMastschuss endTeil = InstanceWrapperExtensions.createInstance(EndTeilMastschuss.class, mastschuss.umlInstance()
						.getName() + "EndTeil");
				mastschuss.endTeilMastschuss_(endTeil);
				lastItem.nextteil_(endTeil);
			}

		}

	}

}
