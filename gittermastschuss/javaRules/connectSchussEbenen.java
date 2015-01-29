import gittermastschuss.classes.Mastschuss;
import gittermastschuss.classes.MittelTeilMastschuss;
import gittermastschuss.classes.TeilMastschuss;

import java.util.Collection;
import java.util.List;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class connectSchussEbenen extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Collection<Mastschuss> mastschuesse = InstanceWrapperExtensions.allInstances(Mastschuss.class);
		for (Mastschuss mastschuss : mastschuesse) {

			if (mastschuss.getExpanded().doubleValue() == 0.5) {

				List<MittelTeilMastschuss> mittelTeilMastschuesse = mastschuss.getMittelTeilMastschuss();
				TeilMastschuss previtem = mastschuss.getAnfangsTeilMastschuss();

				for (MittelTeilMastschuss mittelTeilMastschuss : mittelTeilMastschuesse) {
					mittelTeilMastschuss.setEbenevorne(previtem.getEbenehinten());
					previtem = mittelTeilMastschuss;
				}

				mastschuss.getEndTeilMastschuss().setEbenevorne(previtem.getEbenehinten());
			}
		}
	}

}