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
			if (mittelTeilMastschuss.getVariation().equals(2.) && mittelTeilMastschuss.getExpanded().doubleValue() == 0) {

				// Add diagonale5
				Diagonale diagonale5 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale21");
				mittelTeilMastschuss.setDiagonale21(diagonale5);

				// Add diagonale6
				Diagonale diagonale6 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale32");
				mittelTeilMastschuss.setDiagonale32(diagonale6);

				// Add Diagonale3
				Diagonale diagonale3 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale13");
				mittelTeilMastschuss.setDiagonale13(diagonale3);

				// // Add diagonale7
				// Diagonale diagonale7 =
				// InstanceWrapperExtensions.createInstance(Diagonale.class,
				// mittelTeilMastschuss.umlInstance()
				// .getName() + "_diagonale43");
				// mittelTeilMastschuss.setDiagonale43(diagonale7);
				//
				// // Add diagonale8
				// Diagonale diagonale8 =
				// InstanceWrapperExtensions.createInstance(Diagonale.class,
				// mittelTeilMastschuss.umlInstance()
				// .getName() + "_diagonale14");
				// mittelTeilMastschuss.setDiagonale14(diagonale8);

			}
		}

	}

}