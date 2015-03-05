import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class Loader extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		InstanceWrapperExtensions.deleteInstancesAndLinks(getAllInstances());
	}

}