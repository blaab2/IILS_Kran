import java.util.Collection;

import kran_mbs.classes.MastMBSBodyElement;
import multibody.profile.uml.classes.Marker;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class addMaesteMarker extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Collection<MastMBSBodyElement> maestebodies = InstanceWrapperExtensions.allInstances(MastMBSBodyElement.class);
		for (MastMBSBodyElement mastbody : maestebodies) {
			Marker endemarker = InstanceWrapperExtensions.createInstance(Marker.class, mastbody.getMast().umlInstance().getName() + "endemarker");
			Marker cogmarker = InstanceWrapperExtensions.createInstance(Marker.class, mastbody.getMast().umlInstance().getName() + "cogmarker");
			System.out.println("Added endemarker: " + mastbody.umlInstance().getName());
			mastbody.marker_add_(endemarker);
			mastbody.setEndemarker(endemarker);
			mastbody.marker_add_(cogmarker);

			endemarker.setPositionReference(mastbody);
			endemarker.setLocalX(mastbody.getMast().getLaenge() * 1000);

			cogmarker.setPositionReference(mastbody);
			cogmarker.setLocalX(mastbody.getMast().getGschwerpunktx() / mastbody.getMast().getVolumen());
			cogmarker.setLocalY(mastbody.getMast().getGschwerpunkty() / mastbody.getMast().getVolumen());
			cogmarker.setLocalZ(mastbody.getMast().getGschwerpunktz() / mastbody.getMast().getVolumen());

		}
	}

}