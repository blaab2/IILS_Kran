import gittermastschuss.classes.Diagonale;
import gittermastschuss.classes.MittelTeilMastschuss;

import java.util.Collection;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class BaueDiagonalen2anMittelteil extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		// fügt an jeden Typ2Mittelteilmastschuss die entsprechenden Diagonalen
		// an
		Collection<MittelTeilMastschuss> mittelTeilMastschusse = InstanceWrapperExtensions.allInstances(MittelTeilMastschuss.class);
		for (MittelTeilMastschuss mittelTeilMastschuss : mittelTeilMastschusse) {

			// Überprüfe ob Mittelteilmastschuss bereits Diagonalen hat
			if (mittelTeilMastschuss.getTyp().equals(2.0) && mittelTeilMastschuss.getDiagonale1() == null) {

				// Add diagonale5
				Diagonale diagonale5 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale5");
				mittelTeilMastschuss.setDiagonale5(diagonale5);
				mittelTeilMastschuss.stahlrohr_add_(diagonale5);
				mittelTeilMastschuss.line_add_(diagonale5);

				// Add diagonale6
				Diagonale diagonale6 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale6");
				mittelTeilMastschuss.setDiagonale6(diagonale6);
				mittelTeilMastschuss.stahlrohr_add_(diagonale6);
				mittelTeilMastschuss.line_add_(diagonale6);

				// Add diagonale7
				Diagonale diagonale7 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale7");
				mittelTeilMastschuss.setDiagonale7(diagonale7);
				mittelTeilMastschuss.stahlrohr_add_(diagonale7);
				mittelTeilMastschuss.line_add_(diagonale7);

			}
		}

	}

}