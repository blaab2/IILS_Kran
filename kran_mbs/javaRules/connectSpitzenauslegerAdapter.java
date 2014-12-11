import java.util.Collection;

import kran_v2.classes.Kran;
import kran_v2.classes.Spitzenauslegeradapter;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class connectSpitzenauslegerAdapter extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Kran kran = InstanceWrapperExtensions.allInstances(Kran.class).iterator().next();
		Collection<Spitzenauslegeradapter> spitzenausleger = InstanceWrapperExtensions.allInstances(Spitzenauslegeradapter.class);

		for (Spitzenauslegeradapter spitzenauslegeradapter : spitzenausleger) {
			kran.sub_add_(spitzenauslegeradapter.getAbsoluteposition());
			spitzenauslegeradapter.getAbsoluteposition().sub_add_(spitzenauslegeradapter);
		}

	}

}