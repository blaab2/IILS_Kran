import java.text.DecimalFormat;
import java.text.NumberFormat;

import kran_v2.classes.Abspannbock;
import kran_v2.classes.Kran;
import kran_v2.classes.Nebenausleger;
import kran_v2.classes.Spitzenausleger;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class throwOutput extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		NumberFormat formatter = new DecimalFormat("#0.00");

		Kran kran = InstanceWrapperExtensions.allInstances(Kran.class).iterator().next();
		System.out.println("##########################################################");
		System.out.println("#                    Kran generated                      #");
		System.out.println("##########################################################");
		System.out.println(InstanceWrapperExtensions.allInstances(Spitzenausleger.class).size() + " Spitzenausleger, "
				+ (InstanceWrapperExtensions.allInstances(Nebenausleger.class).size() - InstanceWrapperExtensions.allInstances(Abspannbock.class).size())
				+ " Nebenausleger");
		System.out.println("- Arbeitsbereich X: " + formatter.format(kran.getArbeitsbereichx().doubleValue()) + "m");
		System.out.println("- Arbeitsbereich Z: " + formatter.format(kran.getArbeitsbereichz().doubleValue()) + "m");
		System.out.println("- ideale Last: " + formatter.format(kran.getLast().doubleValue()) + "kg");
		System.out.println("- maximale Last: " + formatter.format(kran.getMaxlast().doubleValue()) + "kg");
		System.out.println("- maximale Last seitlich: " + formatter.format(kran.getMaxlastseitlich().doubleValue()) + "kg");
		if (kran.getMinlast().doubleValue() > 0)
			System.out.println("- minimale Last*: " + formatter.format(kran.getMinlast().doubleValue()) + "kg");
		if (kran.getMinlastseitlich().doubleValue() > 0)
			System.out.println("- minimale Last seitlich*: " + formatter.format(kran.getMinlastseitlich().doubleValue()) + "kg");
		System.out.println("- Masse gesamt: " + formatter.format(kran.getMasse().doubleValue()) + "kg");
		System.out.println("- Masse Oberwagen-Gewichte: "
				+ formatter.format(kran.getUnterbau().getGewichte().getAnzahl() * kran.getUnterbau().getGewichte().getTeilmasse()) + "kg");
		System.out.println("- Masse Zusatz-Gewichte: "
				+ formatter.format(kran.getGewichtewagen().getGewichte().getAnzahl() * kran.getGewichtewagen().getGewichte().getTeilmasse()) + "kg");
		if (kran.getMinlast().doubleValue() > 0 || kran.getMinlastseitlich().doubleValue() > 0)

			System.out.println("*Minimale Last, sodass der Kran nicht nach hinten umkippt");
		System.out.println();
		System.out.println("##########################################################");
	}
}