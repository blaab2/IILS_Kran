import java.util.Collection;

import kran_mbs.classes.Seil1MBSBodyElement;
import kran_mbs.classes.Seil2MBSBodyElement;

import org.eclipse.uml2.uml.InstanceSpecification;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class ConnectCorrespoindingSeilBodies extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Collection<Seil1MBSBodyElement> seil1bodies = InstanceWrapperExtensions.allInstances(Seil1MBSBodyElement.class);
		Collection<Seil2MBSBodyElement> seil2bodies = InstanceWrapperExtensions.allInstances(Seil2MBSBodyElement.class);

		for (Seil1MBSBodyElement seil1mbsBodyElement : seil1bodies) {

			InstanceSpecification verbindungsseil = seil1mbsBodyElement.getVerbindungsseil().umlInstance();

			for (Seil2MBSBodyElement seil2mbsBodyElement : seil2bodies) {
				if (seil2mbsBodyElement.getVerbindungsseil().umlInstance().equals(verbindungsseil)) {
					seil1mbsBodyElement.setSeil2MBSBodyElement(seil2mbsBodyElement);
					break;
				}
			}
		}

	}
}