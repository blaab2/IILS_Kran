import java.util.Collection;

import org.eclipse.uml2.uml.Stereotype;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;
import dossig_normverbindungen.classes.ThreadTrack;
import dossig_normverbindungen.classes.ThreadTrackPoint;

public class expandThreadTrack extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		Collection<ThreadTrack> allThreadTracks = InstanceWrapperExtensions.allInstances(ThreadTrack.class);
		Stereotype spgconstStereo = getProfile(get43Profiles().getSpg()).getOwnedStereotype("spgconst");

		for (ThreadTrack threadTrack : allThreadTracks) {

			if (threadTrack.getExpanded() == (null))
				threadTrack.setExpanded(0.0);
			if (threadTrack.getExpanded().doubleValue() == 0) {
				ThreadTrackPoint prevpoint = null;

				for (int i = 0; i < threadTrack.getPoints(); i++) {
					ThreadTrackPoint point = InstanceWrapperExtensions
							.createInstance(ThreadTrackPoint.class, threadTrack.umlInstance().getName() + "Point" + i);
					threadTrack.element_add_(point);
					threadTrack.threadTrackPoint_add_(point);
					point.setThreadtrack(threadTrack);
					if (i == 0) {
						threadTrack.setStart(point);
						point.setPointnumber(1.0);
						point.umlSlotPointnumber().applyStereotype(spgconstStereo);
					}
					if (i != 0) {
						prevpoint.nextThreadTrackPoint_(point);
						prevpoint.nextControlPoint_add_(point);
					}
					prevpoint = point;
				}

			}
		}
	}
}