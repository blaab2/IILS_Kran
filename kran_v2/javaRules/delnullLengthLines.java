import static de.iils.dc43.math.util.Converter.roundToDecimals;
import geometry.Line;
import gittermastschuss.classes.Mastschuss;
import gittermastschuss.classes.MittelTeilMastschuss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class delnullLengthLines extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		System.out.print("deleting unnecessary lines (l=0): ");

		Collection<Mastschuss> Mastschuesse = InstanceWrapperExtensions.allInstances(Mastschuss.class);

		List<Line> lines = new ArrayList<Line>();
		List<Line> lines_deleted = new ArrayList<Line>();

		for (Mastschuss mastschuss : Mastschuesse) {

			lines.addAll(mastschuss.getAnfangsTeilMastschuss().getLine());
			lines.addAll(mastschuss.getEndTeilMastschuss().getLine());
			for (MittelTeilMastschuss mittelTeilMastschuss : mastschuss.getMittelTeilMastschuss()) {
				lines.addAll(mittelTeilMastschuss.getLine());
			}
		}

		double dx, dy, dz;

		for (Line line : lines) {
			dx = line.getEndPoint().getX() - line.getStartPoint().getX();
			dy = line.getEndPoint().getY() - line.getStartPoint().getY();
			dz = line.getEndPoint().getZ() - line.getStartPoint().getZ();

			if (roundToDecimals(dx, 2) == 0 && roundToDecimals(dy, 2) == 0 && roundToDecimals(dz, 2) == 0) {
				lines_deleted.add(line);
			}

		}

		int i = 0;

		int i1 = Math.round(lines_deleted.size() / 3);
		int i2 = Math.round(2 * lines_deleted.size() / 3);
		for (Line line : lines_deleted) {
			i++;
			if (i == i1) {
				System.out.print("33%...");
			}
			if (i == i2) {
				System.out.print("66%...");
			}
			InstanceWrapperExtensions.deleteInstanceAndLinks(line.getEndPoint().umlInstance());
			InstanceWrapperExtensions.deleteInstanceAndLinks(line.getStartPoint().umlInstance());
			InstanceWrapperExtensions.deleteInstanceAndLinks(line.umlInstance());
		}

		// InstanceWrapperExtensions.deleteInstancesAndLinks(lines_deleted);
		System.out.println("100% - " + lines_deleted.size() + " lines deleted");
	}
}