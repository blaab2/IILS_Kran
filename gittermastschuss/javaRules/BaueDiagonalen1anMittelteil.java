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
			if (mittelTeilMastschuss.getVariation().equals(1.) && mittelTeilMastschuss.getDiagonale1() == null) {

				// Add Diagonale1
				Diagonale diagonale1 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_Diagonale1");
				mittelTeilMastschuss.setDiagonale1(diagonale1);

				// Add Diagonale2
				Diagonale diagonale2 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale2");
				mittelTeilMastschuss.setDiagonale2(diagonale2);

				// Add Diagonale3
				Diagonale diagonale3 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale3");
				mittelTeilMastschuss.setDiagonale3(diagonale3);

				// Add Diagonale4
				Diagonale diagonale4 = InstanceWrapperExtensions.createInstance(Diagonale.class, mittelTeilMastschuss.umlInstance()
						.getName() + "_diagonale4");
				mittelTeilMastschuss.setDiagonale4(diagonale4);

			}
		}
	}
}