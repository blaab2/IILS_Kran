import java.util.Collection;

import kran_mbs.classes.MBSBody;
import kran_mbs.classes.OberwagenMBSBody;
import kran_v2.classes.Oberwagen;
import multibody.profile.uml.classes.GeometryFrom43;
import multibody.profile.uml.classes.Marker;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class AddUnterbauMarker extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		Collection<Oberwagen> oberwagens = InstanceWrapperExtensions.allInstances(Oberwagen.class);
		Collection<MBSBody> mbsbodies = InstanceWrapperExtensions.allInstances(MBSBody.class);

		for (Oberwagen oberwagen : oberwagens) {
			Marker marker = InstanceWrapperExtensions.createInstance(Marker.class, oberwagen.umlInstance().getName() + "Drehkranz");
			for (MBSBody mbsBody : mbsbodies) {
				if (mbsBody.getGeometry() != null) {
					if (mbsBody.getGeometry() instanceof GeometryFrom43) {
						GeometryFrom43 geom43 = (GeometryFrom43) mbsBody.getGeometry();
						if (geom43.getComponent() != null) {
							if (geom43.getComponent().equals(oberwagen.getUnterbauModel())) {
								OberwagenMBSBody oberwagenmbsbody = (OberwagenMBSBody) mbsBody;
								oberwagenmbsbody.setLagerungmarker(marker);

								mbsBody.marker_add_(marker);
								marker.setLocalX(oberwagen.getXDrehkranz());
								marker.setLocalY(oberwagen.getYDrehkranz());
								marker.setPositionReference(mbsBody);

								System.out.println("Unterwagenmarker gesetzt");
								continue;
							}

						}

					}
				}
			}

		}

	}
}