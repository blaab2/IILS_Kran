import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class startCalculix extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {
		String calculixBinPath = "C:\\Program Files (x86)\\bConverged\\CalculiX\\bin\\";
		String outputfile_path = getProjectDir() + "fem/";
		String outputfile_name = "abaqus_export.inp";

		// String inFilePath = Allgemein.getWorkingDirectory(getTrafoRunner()) +
		// Allgemein.fileName + ".msh";

		// File file = new File(inFilePath);
		// if (file.exists()) {
		long initialTime = System.currentTimeMillis();
		printCS("Export to Calculix Viewer...");

		ProcessBuilder exportProcessBuilder;

		exportProcessBuilder = // new
								// ProcessBuilder(Allgemein.findParentsPath+"findparents.exe"
								// );
		new ProcessBuilder(calculixBinPath + "cgx.bat", // elmergrid
														// program
				"-c", // gmsh input
				"\"" + outputfile_name + "\"" // elmergrid output

		);
		exportProcessBuilder.directory(new File(outputfile_path));
		exportProcessBuilder.redirectErrorStream(true);
		//
		Process exportProcess;
		try {
			exportProcess = exportProcessBuilder.start();
			// Scanner Delimiter: \\Z ^= end of input; \\r\\n ^= end of
			// line;
			Scanner s = new Scanner(exportProcess.getInputStream()).useDelimiter("\\r\\n");
			String line;
			while (s.hasNext()) {
				line = s.next();
				// printCS(line);
				if (line.matches("WARNING:.*")) {
					printCS(line);
				}
				if (line.matches("ERROR:.*")) {
					printCS(line);
				}
			}
			try {
				exportProcess.waitFor();
				long totalTimeInSec = (System.currentTimeMillis() - initialTime) / 1000;

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		printCS("starting Calculix Solver...");
		printCS("Solving...");
		initialTime = System.currentTimeMillis();
		// Start Solver
		exportProcessBuilder = // new
								// ProcessBuilder(Allgemein.findParentsPath+"findparents.exe"
								// );
		new ProcessBuilder(calculixBinPath + "ccx.bat", // elmergrid
														// program
				"abaqus_export" // gmsh input

		);
		exportProcessBuilder.directory(new File(outputfile_path));
		exportProcessBuilder.redirectErrorStream(true);
		//
		try {
			exportProcess = exportProcessBuilder.start();
			// Scanner Delimiter: \\Z ^= end of input; \\r\\n ^= end of
			// line;
			Scanner s = new Scanner(exportProcess.getInputStream()).useDelimiter("\\r\\n");
			String line;
			while (s.hasNext()) {
				line = s.next();
				// printCS(line);

				if (line.matches("WARNING:.*")) {
					printCS(line);
				}
				if (line.matches("INFO:.*")) {
					printCS(line);
				}
				if (line.matches("ERROR:.*")) {
					printCS(line);
				}
			}
			try {
				exportProcess.waitFor();
				long totalTimeInSec = (System.currentTimeMillis() - initialTime) / 1000;
				printCS("Solver finished after " + totalTimeInSec + " seconds.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		printCS("starting Calculix Post Processor...");

		// Start Solver
		exportProcessBuilder = // new
								// ProcessBuilder(Allgemein.findParentsPath+"findparents.exe"
								// );
		new ProcessBuilder(calculixBinPath + "cgx.bat", // elmergrid
														// program
				"-v", // gmsh input
				"abaqus_export.frd" // elmergrid output

		);
		exportProcessBuilder.directory(new File(outputfile_path));
		exportProcessBuilder.redirectErrorStream(true);
		//
		try {
			exportProcess = exportProcessBuilder.start();
			// Scanner Delimiter: \\Z ^= end of input; \\r\\n ^= end of
			// line;
			Scanner s = new Scanner(exportProcess.getInputStream()).useDelimiter("\\r\\n");
			String line;
			// while (s.hasNext()) {
			// line = s.next();
			// // printCS(line);
			//
			// if (line.matches("WARNING:.*")) {
			// printCS(line);
			// }
			// if (line.matches("INFO:.*")) {
			// printCS(line);
			// }
			// if (line.matches("ERROR:.*")) {
			// printCS(line);
			// }
			// }
			// try {
			// exportProcess.waitFor();
			// long totalTimeInSec = (System.currentTimeMillis() - initialTime)
			// / 1000;
			// printCS("Converting finished in " + totalTimeInSec +
			// " seconds.");
			// } catch (InterruptedException e) {
			// e.printStackTrace();
			// }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}