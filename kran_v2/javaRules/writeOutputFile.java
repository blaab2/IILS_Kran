import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import kran_v2.classes.Kran;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class writeOutputFile extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) throws IOException {

		// Öffne Kran
		Kran kran = InstanceWrapperExtensions.allInstances(Kran.class).iterator().next();
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
		DecimalFormat format1 = new DecimalFormat("0.00000", otherSymbols);
		DecimalFormat format2 = new DecimalFormat("0", otherSymbols);

		double runtime = kran.getOutput().getRuntime().doubleValue();
		double masse_gesamt = kran.getMasse().doubleValue();
		double masse_gegengewichte1 = (kran.getUnterbau().getGewichte().getAnzahl().doubleValue() * kran.getUnterbau().getGewichte().getTeilmasse()
				.doubleValue());
		double masse_gegengewichte2 = 0;
		if (kran.getGewichtewagen().getGewichte() != null)
			masse_gegengewichte2 = kran.getGewichtewagen().getGewichte().getAnzahl() * kran.getGewichtewagen().getGewichte().getTeilmasse().doubleValue();
		double maxlast = kran.getMaxlast().doubleValue();
		double ideallast = kran.getLast().doubleValue();
		double nebenausleger = 0;
		if (kran.getNebenausleger() != null)
			nebenausleger = 1;
		double arbeitsbereichx = kran.getArbeitsbereichx().doubleValue();
		double arbeitsbereichz = kran.getArbeitsbereichz().doubleValue();
		double hauptausleger_theta = kran.getHauptausleger().getAbsoluteposition().getTheta().doubleValue();
		double hauptausleger_laenge = kran.getHauptausleger().getLaenge().doubleValue();

		// Datei Settings
		String outputfile_path = getProjectDir() + "results\\";
		String outputfile_name = "resultfile.csv";
		String csvseparator = ";";

		// Erstelle neuen Ordner, wenn Ordner noch nicht existiert
		if (new File(outputfile_path).exists() == false) {
			boolean creationWasSuccessful = new File(outputfile_path).mkdirs();
			if (creationWasSuccessful == false) {
				output("Could not create Folder: " + outputfile_path);
			}
		}

		// Überprüfe ob Datei bereits existiert
		boolean fileExists = new File(outputfile_path + outputfile_name).exists();

		try {
			// Neuer Filewriter, true für append
			FileWriter fw = new FileWriter(outputfile_path + outputfile_name, true);
			BufferedWriter bw = new BufferedWriter(fw);

			// Schreibe Kopfzeile wenn Datei neu angelegt
			if (!fileExists) {
				bw.write("Runtime [ms];" + "Masse gesamt [kg];" + "Oberwagen-Gegengewichte [kg];" + "Schwebegewichte [kg];" + "Nebenausleger;"
						+ "Last max [kg];" + "Last ideal [kg];" + "Arbeitsbereich (x) [m];" + "Arbeitsbereich (z) [m];" + "Hauptausleger Theta [grad];"
						+ "Hauptausleger Laenge [m]" + "\n");

			}

			// Schreibe neue Zeile
			bw.write(format1.format(runtime) + csvseparator);
			bw.write(format1.format(masse_gesamt) + csvseparator);
			bw.write(format1.format(masse_gegengewichte1) + csvseparator);
			bw.write(format1.format(masse_gegengewichte2) + csvseparator);
			bw.write(format1.format(nebenausleger) + csvseparator);
			bw.write(format1.format(maxlast) + csvseparator);
			bw.write(format1.format(ideallast) + csvseparator);
			bw.write(format1.format(arbeitsbereichx) + csvseparator);
			bw.write(format1.format(arbeitsbereichz) + csvseparator);
			bw.write(format1.format(hauptausleger_theta) + csvseparator);
			bw.write(format1.format(hauptausleger_laenge) + csvseparator);
			bw.write("\n");
			bw.close();

		} catch (Exception e) {
			output("Exception occurred: " + e.getMessage());
			e.printStackTrace();
		}

	}

	void output(String msg) {
		System.out.println("ResultFileWriter: " + msg);

	}

}