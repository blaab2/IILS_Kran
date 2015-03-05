import geometry.Line;
import geometry.Point;
import geometry.PolyLine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import auslegerende.classes.AuslegerEnde;
import auslegerende.classes.SolidGeometrie;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class prepareSolid extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Collection<AuslegerEnde> auslegerenden = InstanceWrapperExtensions.allInstances(AuslegerEnde.class);

		for (AuslegerEnde auslegerEnde : auslegerenden) {

			SolidGeometrie solidGeo = InstanceWrapperExtensions.createInstance(SolidGeometrie.class, auslegerEnde.umlInstance().getName() + "_solidGeo");
			auslegerEnde.setSolidGeometrie(solidGeo);

			List<PolyLine> polyLines = new ArrayList<PolyLine>();

			polyLines.add(auslegerEnde.getProfillinks());
			polyLines.add(auslegerEnde.getProfilrechts());

			for (PolyLine polyLine : polyLines) {

				Point firstpoint, startpoint, nextpoint;
				firstpoint = polyLine.getStart();
				startpoint = firstpoint;

				while (startpoint.getNextPoint().iterator().next() != null && startpoint.getNextPoint().iterator().next() != firstpoint) {
					nextpoint = startpoint.getNextPoint().iterator().next();

					Line line = InstanceWrapperExtensions.createInstance(Line.class, polyLine.umlInstance().getName() + startpoint.umlInstance().getName()
							+ "line");

					line.setStartPoint(startpoint);
					line.setEndPoint(nextpoint);
					solidGeo.line_add_(line);

					startpoint = nextpoint;
				}

			}
		}

	}
}