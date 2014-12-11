import java.util.Collection;

import kran_mbs.classes.MastMBSBodyElement;
import kran_v2.classes.Hauptausleger;
import kran_v2.classes.Mast;
import kran_v2.classes.Spitzenausleger;
import kran_v2.classes.Spitzenauslegeradapter;
import multibody.profile.uml.classes.GeneralJoint;
import multibody.profile.uml.classes.MBSModel;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class AddSpitzenauslegerJoints extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		// MBS
		MBSModel mbsmodel = InstanceWrapperExtensions.allInstances(MBSModel.class).iterator().next();
		Collection<MastMBSBodyElement> mastMBSBodies = InstanceWrapperExtensions.allInstances(MastMBSBodyElement.class);

		// verbinde Hauptausleger und Spitzenausleger inkl Adapter
		Hauptausleger hauptausleger = InstanceWrapperExtensions.allInstances(Hauptausleger.class).iterator().next();
		Spitzenausleger spitzenausleger = hauptausleger.getSpitzenausleger();

		if (hauptausleger == null || spitzenausleger == null) {
			return;
		}

		Spitzenauslegeradapter spitzenauslegeradapter1 = spitzenausleger.getSpitzenauslegeradapter1();
		Spitzenauslegeradapter spitzenauslegeradapter2 = spitzenausleger.getSpitzenauslegeradapter2();

		builtjoint(hauptausleger, spitzenausleger, mbsmodel, mastMBSBodies);
		builtjoint(spitzenausleger, spitzenauslegeradapter1, mbsmodel, mastMBSBodies);
		builtjoint(spitzenausleger, spitzenauslegeradapter2, mbsmodel, mastMBSBodies);

		int i = 0;

		while (!(spitzenausleger.getNextspitzenausleger() == null) && i < 6) {
			i++;

			builtjoint(spitzenausleger, spitzenausleger.getNextspitzenausleger(), mbsmodel, mastMBSBodies);
			builtjoint(spitzenausleger.getNextspitzenausleger(), spitzenausleger.getNextspitzenausleger().getSpitzenauslegeradapter1(), mbsmodel, mastMBSBodies);
			builtjoint(spitzenausleger.getNextspitzenausleger(), spitzenausleger.getNextspitzenausleger().getSpitzenauslegeradapter2(), mbsmodel, mastMBSBodies);

			spitzenausleger = spitzenausleger.getNextspitzenausleger();

		}

	}

	private void builtjoint(Mast ausleger0, Mast ausleger1, MBSModel mbsmodel, Collection<MastMBSBodyElement> mastMBSBodies) {

		if (!(ausleger0 == null) && !(ausleger1 == null)) {
			MastMBSBodyElement ausleger0mbs = null;
			MastMBSBodyElement ausleger1mbs = null;
			for (MastMBSBodyElement mastMBSBodyElement : mastMBSBodies) {
				if (mastMBSBodyElement.getMast().equals(ausleger0)) {
					ausleger0mbs = mastMBSBodyElement;
				}
				if (mastMBSBodyElement.getMast().equals(ausleger1)) {
					ausleger1mbs = mastMBSBodyElement;
				}
			}
			if (!ausleger1mbs.equals(null) && !ausleger0mbs.equals(null)) {
				GeneralJoint generaljoint = InstanceWrapperExtensions.createInstance(GeneralJoint.class, ausleger1.umlInstance().getName() + "Joint0");

				//System.out.println("joint heisst: " + ausleger1.umlInstance().getName() + "Joint0");

				mbsmodel.joint_add_(generaljoint);
				generaljoint.setBody1(ausleger1mbs);
				generaljoint.setBody2(ausleger0mbs);
				generaljoint.setAppliedLocation(ausleger1mbs);
				setjointvalues(generaljoint);
			}
		}
	}

	private void setjointvalues(GeneralJoint generaljoint) {
		generaljoint.setConstrainRotX(true);
		generaljoint.setConstrainRotY(false);
		generaljoint.setConstrainRotZ(true);
		generaljoint.setConstrainX(true);
		generaljoint.setConstrainY(true);
		generaljoint.setConstrainZ(true);
	}
}