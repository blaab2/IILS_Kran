
import kran_v2.classes.Kran;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class calcRuntime extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		Long l = new Long(System.currentTimeMillis());

		Kran kran = InstanceWrapperExtensions.allInstances(Kran.class).iterator().next();
		kran.getOutput().setRuntime(l.doubleValue() - kran.getOutput().getStarttime());
		System.out.println("----- KranModel generated in " + kran.getOutput().getRuntime() / 1000 + "s -----");
	}

}