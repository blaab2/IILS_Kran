import kran_v2.classes.Kran;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class setStartTime extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		Long l = new Long(System.currentTimeMillis());

		InstanceWrapperExtensions.allInstances(Kran.class).iterator().next().getOutput().setStarttime(l.doubleValue());

	}

}