import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;
import de.qd.dc43.multibody.modules.MultibodyMain;

public class callMBSPlugin extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		// Threading
		MultibodyMain.run(trafoRunner.getUmlFileURI());

	}

}