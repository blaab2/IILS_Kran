import fem.FEMLine;
import fem.FEMPunkt;
import geometry.Point;
import gittermastschuss.classes.Mastschuss;
import gittermastschuss.classes.MittelTeilMastschuss;
import gittermastschuss.classes.Stahlrohr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import kran_v2.classes.Hauptausleger;
import Jama.Matrix;
import de.iils.dc43.geometry.API.GeometryAPI;
import de.iils.dc43.geometry.objectgraph.Graph;
import de.iils.dc43.math.TransformationMatrix;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class exportAbaqus extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) throws IOException {

		String outputfile_path = getProjectDir() + "fem/";

		String outputfile_name = "abaqus_export.txt";

		output(outputfile_path + outputfile_name);

		if (new File(outputfile_path).exists() == false) {
			boolean creationWasSuccessful = new File(outputfile_path).mkdirs();
			if (creationWasSuccessful == false) {
				output("Could not create Folder: " + outputfile_path);
			}
		}

		FileWriter fw = new FileWriter(outputfile_path + outputfile_name);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("***********************************");
		bw.newLine();
		bw.write("** ABAQUS FEM FILE KRAN V2");
		bw.newLine();
		bw.write("***********************************");
		bw.newLine();
		bw.write("*HEADING");
		bw.newLine();
		bw.write("3-D KRAN Mastschussse");
		bw.newLine();
		bw.write("SI units (kg, m, s, N)");
		bw.newLine();
		bw.write("1-axis horizontal, 2-axis vertical");
		bw.newLine();
		bw.write("*PREPRINT, ECHO=YES, MODEL=YES, HISTORY=YES");
		bw.newLine();
		bw.write("**");
		bw.newLine();
		bw.write("** Model definition");
		bw.newLine();
		bw.write("**");
		bw.newLine();
		bw.write("*NODE, NSET=NALL");
		bw.newLine();

		// Punkte sammeln

		int point_i = 1;
		int line_i = 1;

		Collection<Stahlrohr> stahlrohre = InstanceWrapperExtensions.allInstances(Stahlrohr.class);
		Hauptausleger hauptausleger = InstanceWrapperExtensions.allInstances(Hauptausleger.class).iterator().next();

		ArrayList<FEMLine> femlines = new ArrayList<FEMLine>();
		HashMap<double[], FEMPunkt> points = new HashMap<double[], FEMPunkt>();

		GeometryAPI api = new GeometryAPI(trafoRunner.getUmlFileURI());
		Graph<Object> emptyGraph = api.generateEmptyGeometryGraph();

		stahlrohre.clear();
		List<Mastschuss> mastschusse = hauptausleger.getMastschuss();
		for (Mastschuss mastschuss : mastschusse) {

			stahlrohre.addAll(mastschuss.getAnfangsTeilMastschuss().getStahlrohr());
			stahlrohre.addAll(mastschuss.getEndTeilMastschuss().getStahlrohr());
			for (MittelTeilMastschuss mittelteil : mastschuss.getMittelTeilMastschuss()) {
				stahlrohre.addAll(mittelteil.getStahlrohr());
			}

		}

		for (Stahlrohr stahlrohr : stahlrohre) {

			System.out.println("Abaqus Export: " + stahlrohre.size() + " Stahlrohre");

			Point startPoint = stahlrohr.getStartPoint();
			Point endPoint = stahlrohr.getEndPoint();
			if (startPoint == null || endPoint == null)
				continue;

			System.out.println(point_i);
			de.iils.dc43.geometry.datastructure.geometrics.Point startpointData = (de.iils.dc43.geometry.datastructure.geometrics.Point) emptyGraph.getNode(
					startPoint.umlInstance()).getData();
			de.iils.dc43.geometry.datastructure.geometrics.Point endpointData = (de.iils.dc43.geometry.datastructure.geometrics.Point) emptyGraph.getNode(
					endPoint.umlInstance()).getData();

			TransformationMatrix trafomatrix = api.getLoc2GlobTrans(emptyGraph, startPoint.umlInstance());
			double[] startPointMatrix = trafomatrix.times(new Matrix(startpointData.getHomogeneousCoordinates(), 4)).getRowPackedCopy();

			trafomatrix = api.getLoc2GlobTrans(emptyGraph, endPoint.umlInstance());
			double[] endPointMatrix = trafomatrix.times(new Matrix(endpointData.getHomogeneousCoordinates(), 4)).getRowPackedCopy();

			// startPointMatrix[0] = startPoint.getX();
			// startPointMatrix[1] = startPoint.getY();
			// startPointMatrix[2] = startPoint.getZ();
			// endPointMatrix[0] = endPoint.getX();
			// endPointMatrix[1] = endPoint.getY();
			// endPointMatrix[2] = endPoint.getZ();

			FEMPunkt p1 = findSame(startPointMatrix, points);
			if (p1 == null) {
				p1 = new FEMPunkt(startPointMatrix[0], startPointMatrix[1], startPointMatrix[2]);
				p1.setIndex(point_i);
				point_i++;
				points.put(startPointMatrix, p1);
			}

			FEMPunkt p2 = findSame(endPointMatrix, points);
			if (p2 == null) {
				p2 = new FEMPunkt(endPointMatrix[0], endPointMatrix[1], endPointMatrix[2]);
				p2.setIndex(point_i);
				point_i++;
				points.put(endPointMatrix, p2);
			}

			FEMLine line = new FEMLine(p1, p2, line_i);
			femlines.add(line);
			line_i++;
		}

		System.out.println("Abaqus: " + points.size() + "FEM Punkte extrahiert");

		// Punkteliste sortieren
		ArrayList<FEMPunkt> fempoints = new ArrayList<FEMPunkt>(points.values());
		Collections.sort(fempoints, new Comparator<FEMPunkt>() {

			@Override
			public int compare(FEMPunkt o1, FEMPunkt o2) {
				if (o1.getIndex() > o2.getIndex())
					return 1;
				if (o1.getIndex() < o2.getIndex())
					return -1;
				return 0;
			}
		});

		// Punkte Ausgeben
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
		DecimalFormat format1 = new DecimalFormat("0.00", otherSymbols);
		DecimalFormat format2 = new DecimalFormat("0", otherSymbols);

		for (FEMPunkt femPunkt : fempoints) {
			bw.write(format2.format(femPunkt.getIndex()) + ", " + format1.format(femPunkt.getX()) + ", " + format1.format(femPunkt.getY()) + ", "
					+ format1.format(femPunkt.getZ()));

			bw.newLine();

		}

		bw.write("*Element, type=B31");
		bw.newLine();

		for (FEMLine femline : femlines) {
			bw.write(format2.format(femline.getID()) + ", " + format2.format(femline.getP1().getIndex()) + ", " + format2.format(femline.getP2().getIndex()));

			bw.newLine();

		}

		bw.close();

	}

	private FEMPunkt findSame(double[] newPoint, HashMap<double[], FEMPunkt> points) {
		for (double[] p : points.keySet()) {
			if (checkKoordinates(p, newPoint)) {
				return points.get(p);
			}
		}
		return null;
	}

	private boolean checkKoordinates(double[] p1, double[] p2) {
		if (Math.abs(p1[0] - p2[0]) < 0.0001 && Math.abs(p1[1] - p2[1]) < 0.0001 && Math.abs(p1[2] - p2[2]) < 0.0001) {
			return true;
		}
		return false;
	}

	void exportpoint(int number, int x, int y, int z) {
	}

	void output(String msg) {
		System.out.println("exportAbaqus: " + msg);

	}

}