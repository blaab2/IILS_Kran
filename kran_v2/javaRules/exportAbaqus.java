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

		stahlrohre.clear();
		List<Mastschuss> mastschusse = hauptausleger.getMastschuss();
		for (Mastschuss mastschuss : mastschusse) {
			stahlrohre.addAll(mastschuss.getAnfangsTeilMastschuss().getStahlrohr());
			stahlrohre.addAll(mastschuss.getEndTeilMastschuss().getStahlrohr());
			for (MittelTeilMastschuss mittelteil : mastschuss.getMittelTeilMastschuss()) {
				stahlrohre.addAll(mittelteil.getStahlrohr());
			}
		}

		ArrayList<FEMLine> femlines = new ArrayList<FEMLine>();
		HashMap<Point, FEMPunkt> points = new HashMap<Point, FEMPunkt>();

		GeometryAPI api = new GeometryAPI(trafoRunner.getUmlFileURI());
		Graph<Object> emptyGraph = api.generateEmptyGeometryGraph();

		for (Stahlrohr stahlrohr : stahlrohre) {
			Point startPoint = stahlrohr.getStartPoint();
			Point endPoint = stahlrohr.getEndPoint();
			if (startPoint == null || endPoint == null)
				continue;
			de.iils.dc43.geometry.datastructure.geometrics.Point startpointData = (de.iils.dc43.geometry.datastructure.geometrics.Point) emptyGraph.getNode(
					startPoint.umlInstance()).getData();
			de.iils.dc43.geometry.datastructure.geometrics.Point endpointData = (de.iils.dc43.geometry.datastructure.geometrics.Point) emptyGraph.getNode(
					endPoint.umlInstance()).getData();

			TransformationMatrix trafomatrix = api.getLoc2GlobTrans(emptyGraph, startPoint.umlInstance());
			double[] startPointMatrix = trafomatrix.times(new Matrix(startpointData.getHomogeneousCoordinates(), 4)).getRowPackedCopy();

			trafomatrix = api.getLoc2GlobTrans(emptyGraph, endPoint.umlInstance());
			double[] endPointMatrix = trafomatrix.times(new Matrix(endpointData.getHomogeneousCoordinates(), 4)).getRowPackedCopy();

			FEMPunkt p1 = findSame(startPoint, points);
			if (p1 == null) {
				p1 = new FEMPunkt(startPointMatrix[0], startPointMatrix[1], startPointMatrix[2]);
				p1.setIndex(point_i);
				point_i++;
				points.put(startPoint, p1);
			}

			FEMPunkt p2 = points.get(endPoint);
			if (p2 == null) {
				p2 = new FEMPunkt(endPointMatrix[0], endPointMatrix[1], endPointMatrix[2]);
				p2.setIndex(point_i);
				point_i++;
				points.put(endPoint, p2);
			}

			FEMLine line = new FEMLine(p1, p2, line_i);
			femlines.add(line);
			line_i++;
		}

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

	private FEMPunkt findSame(Point np, HashMap<Point, FEMPunkt> points) {
		for (Point p : points.keySet()) {
			if (checkKoordinates(p, np)) {
				return points.get(p);
			}
		}
		return null;
	}

	private boolean checkKoordinates(Point p, Point np) {
		if (p.getX() - np.getX() < 0.0001 && p.getY() - np.getY() < 0.0001 && p.getZ() - np.getZ() < 0.0001) {
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