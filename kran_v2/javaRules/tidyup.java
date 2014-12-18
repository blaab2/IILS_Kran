import geometry.Line;
import gittermastschuss.classes.Mastschuss;
import gittermastschuss.classes.TeilMastschuss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class tidyup extends JavaRule {

	private double rounddbl(double zahl, int stelle) {

		return (Math.round(zahl * stelle * 10) / (stelle * 10));

	}

	private int stelle = 4;
	private boolean msg = true;

	private void output(String Msg) {
		if (msg) {
			System.out.println(Msg);
		}

	}

	private int tidyup_connect() {

		Collection<Mastschuss> Mastschuesse = InstanceWrapperExtensions.allInstances(Mastschuss.class);

		int fixed = 0;

		for (Mastschuss mastschuss : Mastschuesse) {

			List<Line> lines = new ArrayList<Line>();
			List<Line> lines_deleted = new ArrayList<Line>();

			for (TeilMastschuss teilMastschuss : mastschuss.getMittelTeilMastschuss()) {

				lines.addAll(teilMastschuss.getLine());

			}

			// output("tidy up " + mastschuss.umlInstance().getName() +
			// " including " + lines.size() + " lines.");

			int i = 0;

			for (Line line : lines) {

				if (line != null && line.umlInstance() != null && !lines_deleted.contains(line)) {
					for (Line line2 : lines) {
						if (line2 != null && line2.umlInstance() != null && !lines_deleted.contains(line2)) {
							if (line != line2) {
								double x1, y1, z1, x2, y2, z2;

								x1 = rounddbl(line.getEndPoint().getX(), stelle);
								y1 = rounddbl(line.getEndPoint().getY(), stelle);
								z1 = rounddbl(line.getEndPoint().getZ(), stelle);

								x2 = rounddbl(line2.getStartPoint().getX(), stelle);
								y2 = rounddbl(line2.getStartPoint().getY(), stelle);
								z2 = rounddbl(line2.getStartPoint().getZ(), stelle);

								if (x1 == x2 && y1 == y2 && z1 == z2) {
									double dx1, dy1, dz1, dx2, dy2, dz2, zaehler, nenner;

									dx1 = rounddbl(line.getEndPoint().getX() - line.getStartPoint().getX(), stelle);
									dy1 = rounddbl(line.getEndPoint().getY() - line.getStartPoint().getY(), stelle);
									dz1 = rounddbl(line.getEndPoint().getZ() - line.getStartPoint().getZ(), stelle);

									dx2 = rounddbl(line2.getEndPoint().getX() - line2.getStartPoint().getX(), stelle);
									dy2 = rounddbl(line2.getEndPoint().getY() - line2.getStartPoint().getY(), stelle);
									dz2 = rounddbl(line2.getEndPoint().getZ() - line2.getStartPoint().getZ(), stelle);

									// Berechnen des Winkels zwischen dem Vektor
									// d1 und d2

									zaehler = dx1 * dx2 + dy1 * dy2 + dz1 * dz2;

									nenner = Math.pow(Math.pow(dx1, 2) + Math.pow(dy1, 2) + Math.pow(dz1, 2), 1. / 2.)
											* Math.pow(Math.pow(dx2, 2) + Math.pow(dy2, 2) + Math.pow(dz2, 2), 1. / 2.);

									// System.out.println("");
									// System.out.println("bruch: " + (zaehler /
									// nenner));
									// System.out.println("bruch gerundet: " +
									// (rounddbl((zaehler / nenner), 1)));
									// System.out.println("arc : " +
									// Math.acos(rounddbl(zaehler / nenner,
									// 1)));

									if (Math.acos(rounddbl(zaehler / nenner, 1)) <= 3 / 180 * Math.PI) {
										// System.out.println("found");
										i++;
										fixed++;
										// delete old EndPoint
										// InstanceWrapperExtensions.deleteInstanceAndLinks(line.getEndPoint().umlInstance());

										// set new EndPoint
										line.setEndPoint(line2.getEndPoint());

										// delete old Line

										// InstanceWrapperExtensions.delete(line2.getStartPoint().umlInstance());
										InstanceWrapperExtensions.delete(line2.umlInstance());
										lines_deleted.add(line2);

									}

								}

							}
						}

					}
				}

			}

			InstanceWrapperExtensions.deleteInstancesAndLinks(lines_deleted);

			// System.out.println(i + " Holme fixed");

		}
		return fixed;

	}

	public void execute(TransformationRunner trafoRunner) {
		int i = 0, del = 0;
		output("connect collinear lines:");
		while (i < 10) {
			del = tidyup_connect();
			i++;
			output("tidyup: run " + i + " deleted " + del + " lines");
			if (del == 0) {
				break;
			}

		}
		output("connect collinear lines finished");

	}
}
