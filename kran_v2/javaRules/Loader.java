import kran_v2.classes.Input;
import kran_v2.classes.Kran;
import kran_v2.classes.Output;

import org.eclipse.uml2.uml.Stereotype;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class Loader extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) throws Exception {

		Stereotype spgconstStereo = getProfile(get43Profiles().getSpg()).getOwnedStereotype("spgconst");
		Kran kran = InstanceWrapperExtensions.allInstances(Kran.class).iterator().next();
		Double maxlast = kran.getMaxlast();
		Double theta = kran.getInput().getHauptauslegertheta();
		if (theta < 350.) {
			// lösche alten Graphen
			InstanceWrapperExtensions.deleteInstancesAndLinks(getAllInstances());

			// neues Axiom
			// --------------Instancen--------------
			Kran kran_neu = InstanceWrapperExtensions.createInstance(Kran.class, "Kran0");
			Input input_neu = InstanceWrapperExtensions.createInstance(Input.class, "Input0");
			Output output_neu = InstanceWrapperExtensions.createInstance(Output.class, "Output0");
			// --------------Links--------------
			kran_neu.setInput(input_neu);
			kran_neu.setOutput(output_neu);
			// --------------Parameter--------------
			kran_neu.setSolid(true);
			output_neu.setRuntime(0.);

			input_neu.setArbeitsbereichx(45.);
			input_neu.setMastdichte(0.00785);
			input_neu.setMaxlast(maxlast);
			input_neu.setHauptauslegertheta(theta + 10);

			input_neu.umlSlotArbeitsbereichx().applyStereotype(spgconstStereo);
			input_neu.umlSlotMastdichte().applyStereotype(spgconstStereo);
			input_neu.umlSlotMaxlast().applyStereotype(spgconstStereo);
			input_neu.umlSlotHauptauslegertheta().applyStereotype(spgconstStereo);

		} else {
			System.out.println("execution finished");
			trafoRunner.cancel();
			// throw new Exception();
		}
	}
}