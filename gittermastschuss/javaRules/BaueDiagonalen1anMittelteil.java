import gittermastschuss.classes.Diagonale;
import gittermastschuss.classes.MittelTeilMastschuss;

import java.util.Collection;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class BaueDiagonalen1anMittelteil extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		// fügt an jeden Typ1 Mittelteilmastschuss die entsprechenden Diagonalen
		// an
		Collection<MittelTeilMastschuss> mittelTeilMastschusse = InstanceWrapperExtensions.allInstances(MittelTeilMastschuss.class);
		for (MittelTeilMastschuss mittelTeilMastschuss : mittelTeilMastschusse) {

			// Überprüfe ob Mittelteilmastschuss bereits Diagonalen hat
			if (mittelTeilMastschuss.getVariation().equals(1.) && mittelTeilMastschuss.getExpanded().doubleValue() == 0) {

				// Add Diagonale1
				Diagonale diagonale1 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_Diagonale12");
				mittelTeilMastschuss.setDiagonale12(diagonale1);

				// Add Diagonale2
				Diagonale diagonale2 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale2");
				mittelTeilMastschuss.setDiagonale23(diagonale2);

				// Add Diagonale3
				Diagonale diagonale3 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale31");
				mittelTeilMastschuss.setDiagonale31(diagonale3);

				// // Add Diagonale3
				// Diagonale diagonale3 =
				// InstanceWrapperExtensions.createInstance(Diagonale.class,
				// mittelTeilMastschuss.umlInstance()
				// .getName() + "_diagonale34");
				// mittelTeilMastschuss.setDiagonale34(diagonale3);
				//
				// // Add Diagonale4
				// Diagonale diagonale4 =
				// InstanceWrapperExtensions.createInstance(Diagonale.class,
				// mittelTeilMastschuss.umlInstance()
				// .getName() + "_diagonale41");
				// mittelTeilMastschuss.setDiagonale41(diagonale4);

			}
		}
	}
}