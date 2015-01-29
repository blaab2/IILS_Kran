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
		if (teilmastschuss.getPfosten12() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten12());
		}
		if (teilmastschuss.getPfosten23() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten23());
		}
		if (teilmastschuss.getPfosten34() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten34());
		}
		if (teilmastschuss.getPfosten45() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten45());
		}
		if (teilmastschuss.getPfosten51() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten51());
		}
		if (teilmastschuss.getPfosten41() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten41());
		}
		if (teilmastschuss.getPfosten31() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getPfosten31());
		}
		if (teilmastschuss.getDiagonale12() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale12());
		}
		if (teilmastschuss.getDiagonale23() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale23());
		}
		if (teilmastschuss.getDiagonale34() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale34());
		}
		if (teilmastschuss.getDiagonale41() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale41());
		}
		if (teilmastschuss.getDiagonale21() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale21());
		}
		if (teilmastschuss.getDiagonale32() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale32());
		}
		if (teilmastschuss.getDiagonale43() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale43());
		}
		if (teilmastschuss.getDiagonale14() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale14());
		}
		if (teilmastschuss.getDiagonale13() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale13());
		}
		if (teilmastschuss.getDiagonale31() != null) {
			mastschuss.getMastschussGeometrie().geometric_add_(teilmastschuss.getDiagonale31());
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