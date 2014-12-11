import java.util.Collection;

import kran_mbs.classes.MastMBSBodyElement;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class RenameMaesteBodies extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Collection<MastMBSBodyElement> mastMBSBodies = InstanceWrapperExtensions.allInstances(MastMBSBodyElement.class);
		for (MastMBSBodyElement mastMBSBodyElement : mastMBSBodies) {

			mastMBSBodyElement.umlInstance().setName("mastMBSBodyElement_" + mastMBSBodyElement.getMast().umlInstance().getName());
			System.out.println(mastMBSBodyElement.umlInstance().getName());
		}
	}

}