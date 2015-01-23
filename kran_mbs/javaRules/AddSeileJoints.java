import java.util.Collection;

import kran_mbs.classes.MastMBSBodyElement;
import kran_mbs.classes.Seil1MBSBodyElement;
import kran_mbs.classes.Seil2MBSBodyElement;
import kran_v2.classes.Mast;
import multibody.profile.uml.classes.GeneralJoint;
import multibody.profile.uml.classes.InternalDynamicMeasure;
import multibody.profile.uml.classes.MBSModel;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class AddSeileJoints extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Collection<Seil1MBSBodyElement> seil1MBSBodies = InstanceWrapperExtensions.allInstances(Seil1MBSBodyElement.class);
		Seil2MBSBodyElement seil2MBSBody = null;
		Collection<MastMBSBodyElement> mastMBSBodies = InstanceWrapperExtensions.allInstances(MastMBSBodyElement.class);
		Collection<MBSModel> MBSModells = InstanceWrapperExtensions.allInstances(MBSModel.class);
		MBSModel mbsModel = MBSModells.iterator().next();

		if (MBSModells.size() > 1) {
			System.out.println("AddSeileJoints: ERROR more than 1 MBSModell found");
			return;
		}

		for (Seil1MBSBodyElement seil1MBSBody : seil1MBSBodies) {
			Mast mast1 = seil1MBSBody.getVerbindungsseil().getMast1();
			Mast mast2 = seil1MBSBody.getVerbindungsseil().getMast2();

			seil2MBSBody = seil1MBSBody.getSeil2MBSBodyElement();

			MastMBSBodyElement mast1MBSBody = null;
			MastMBSBodyElement mast2MBSBody = null;

			for (MastMBSBodyElement mastMBSBody : mastMBSBodies) {
				if (mastMBSBody.getMast() == mast1) {
					mast1MBSBody = mastMBSBody;
				} else if (mastMBSBody.getMast() == mast2) {
					mast2MBSBody = mastMBSBody;
				}
			}

			if (mast1MBSBody == null || mast2MBSBody == null) {
				System.out.println("AddSeileJoints: ERROR GetMaesteBodies - Body not found");
				continue;
			}

			System.out.println("Bodies Found");
			// erzeuge neue Joints
			// <> joint1 -- joint2 -- joint3 <>
			System.out.println("seil1_" + seil1MBSBody.umlInstance().getName());
			System.out.println("seil2_" + seil2MBSBody.umlInstance().getName());
			GeneralJoint joint1 = InstanceWrapperExtensions.createInstance(GeneralJoint.class, seil1MBSBody.umlInstance().getName() + "_Joint1");
			GeneralJoint joint2 = InstanceWrapperExtensions.createInstance(GeneralJoint.class, seil1MBSBody.umlInstance().getName()
					+ mast1.umlInstance().getName() + mast2.umlInstance().getName() + "_Joint2");
			GeneralJoint joint3 = InstanceWrapperExtensions.createInstance(GeneralJoint.class, seil2MBSBody.umlInstance().getName() + "_Joint3");

			mbsModel.joint_add_(joint1);
			mbsModel.joint_add_(joint2);
			mbsModel.joint_add_(joint3);
			// GeneralJoint[] joints = { joint1, joint2, joint3 };
			// mbsModel.joint_(joints);

			System.out.println("added joints for " + seil1MBSBody.umlInstance().getName());

			joint1.setConstrainRotX(true);
			joint1.setConstrainRotY(false);
			joint1.setConstrainRotZ(true);
			joint1.setConstrainX(true);
			joint1.setConstrainY(true);
			joint1.setConstrainZ(true);
			joint1.setAppliedLocation(seil1MBSBody);
			joint1.setBody1(mast1MBSBody);
			joint1.setBody2(seil1MBSBody);

			// joint2
			joint2.setConstrainRotX(true);
			joint2.setConstrainRotY(true);
			joint2.setConstrainRotZ(true);
			joint2.setConstrainX(true);
			joint2.setConstrainY(true);
			joint2.setConstrainZ(true);
			joint2.setAppliedLocation(seil1MBSBody);
			joint2.setBody1(seil1MBSBody);
			joint2.setBody2(seil2MBSBody);

			// joint3
			joint3.setConstrainRotX(true);
			joint3.setConstrainRotY(false);
			joint3.setConstrainRotZ(true);
			joint3.setConstrainX(true);
			joint3.setConstrainY(true);
			joint3.setConstrainZ(true);
			joint3.setAppliedLocation(seil2MBSBody);
			joint3.setBody1(mast2MBSBody);
			joint3.setBody2(seil2MBSBody);

			// Add Measures
			InternalDynamicMeasure measure1 = InstanceWrapperExtensions.createInstance(InternalDynamicMeasure.class, mast1.umlInstance().getName()
					+ mast2.umlInstance().getName());
			measure1.setMeasuredElement(joint2);
			measure1.setCoordinateSystem(seil1MBSBody);
			measure1.setFx(true);
			measure1.setExportToFile(false);
			mbsModel.measure_add_(measure1);
		}

	}
}