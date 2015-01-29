import gittermastschuss.classes.Mastschuss;
import gittermastschuss.classes.TeilMastschuss;

import java.util.Collection;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class VerbindeGGittermastschuss extends JavaRule {

	public void connect(Mastschuss mastschuss, TeilMastschuss teilmastschuss)

	{
		if (teilmastschuss.getHolm1() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getHolm1());
		}
		if (teilmastschuss.getHolm2() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getHolm2());
		}
		if (teilmastschuss.getHolm3() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getHolm3());
		}
		if (teilmastschuss.getHolm4() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getHolm4());
		}
		if (teilmastschuss.getHolm5() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getHolm5());
		}
		if (teilmastschuss.getPfosten1() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten1());
		}
		if (teilmastschuss.getPfosten2() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten2());
		}
		if (teilmastschuss.getPfosten3() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten3());
		}
		if (teilmastschuss.getPfosten4() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten4());
		}
		if (teilmastschuss.getDiagonale1() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale1());
		}
		if (teilmastschuss.getDiagonale2() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale2());
		}
		if (teilmastschuss.getDiagonale3() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale3());
		}
		if (teilmastschuss.getDiagonale4() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale4());
		}
		if (teilmastschuss.getDiagonale5() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale5());
		}
		if (teilmastschuss.getDiagonale6() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale6());
		}
		if (teilmastschuss.getDiagonale7() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale7());
		}
		if (teilmastschuss.getDiagonale8() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale8());
		}
	}

	public void execute(TransformationRunner trafoRunner) {

		/*
		 * Erstellt G für einen Gittermastschuss indem Anfang-Mittel- und
		 * Endeteile über G verbunden werden
		 */

		Collection<Mastschuss> Mastschuesse = InstanceWrapperExtensions.allInstances(Mastschuss.class);

		for (Mastschuss mastschuss : Mastschuesse) {

			// Mastschuss muss bereits expandiert sein
			if (mastschuss.getExpanded().equals(0.5)) {

				// Verbinde MittelTeilMastschusse
				for (TeilMastschuss teilmastschuss : mastschuss.getMittelTeilMastschuss()) {
					connect(mastschuss, teilmastschuss);
				}

				// Verbinde AnfangsTeilMastschuss
				TeilMastschuss teilmastschuss = null;
				teilmastschuss = mastschuss.getAnfangsTeilMastschuss();
				connect(mastschuss, teilmastschuss);

				// Verbinde EndTeilMastschuss
				teilmastschuss = mastschuss.getEndTeilMastschuss();
				connect(mastschuss, teilmastschuss);

				// Mastschuss ist vollständig expandiert
				mastschuss.setExpanded(1.0);
			}

		}

	}
}