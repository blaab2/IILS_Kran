import gittermastschuss.classes.SolidVerbindung;

import java.util.Collection;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class calcSolidNodes extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		// TODO Insert Rule Code here

		Collection<SolidVerbindung> solidVerbindungen = InstanceWrapperExtensions.allInstances(SolidVerbindung.class);

		for (SolidVerbindung solidVerbindung : solidVerbindungen) {
			double x1, x2, y1, y2, z1, z2;
			x1 = solidVerbindung.getLine().getStartPoint().getX();
			y1 = solidVerbindung.getLine().getStartPoint().getY();
			z1 = solidVerbindung.getLine().getStartPoint().getZ();
			x2 = solidVerbindung.getLine().getEndPoint().getX();
			y2 = solidVerbindung.getLine().getEndPoint().getY();
			z2 = solidVerbindung.getLine().getEndPoint().getZ();

			solidVerbindung.getStartNode().setX(x1);
			solidVerbindung.getStartNode().setY(y1);
			solidVerbindung.getStartNode().setZ(z1);

			solidVerbindung.getEndNode().setX(x2);
			solidVerbindung.getEndNode().setY(y2);
			solidVerbindung.getEndNode().setZ(z2);

		}
	}
}
