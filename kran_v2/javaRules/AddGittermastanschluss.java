import geometry.Component;
import geometry.Line;
import gittermastschuss.classes.Mastschuss;
import gittermastschuss.classes.Stahlrohr;
import gittermastschuss.classes.TeilMastschuss;
import gittermastschuss.classes.impl.AnfangsTeilMastschussImpl;
import gittermastschuss.classes.impl.HolmImpl;
import gittermastschussanschluss.classes.Verbindungsstueck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import kran_v2.classes.Mast;

import org.eclipse.uml2.uml.Stereotype;

import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class AddGittermastanschluss extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		Collection<Mast> maeste = InstanceWrapperExtensions.allInstances(Mast.class);

		// Generate Solid for Gittermastschuss Anschluesse

		for (Mast mast : maeste) {
			for (Mastschuss mastschuss : mast.getMastschuss()) {

				// Erstelle neue Componente für SolidVerbindungsStuecke
				Component component = InstanceWrapperExtensions.createInstance(Component.class, mastschuss.umlInstance().getName() + "_solidcomponentVS");
				mast.sub_add_(component);

				// Baue SolidVerbindungsStuecke für AnfangsTeilMastschuesse
				builtVSforMastschuss(component, mastschuss.getAnfangsTeilMastschuss());

				// Baue SolidVerbindungsStuecke für EndTeilmastschuesse
				builtVSforMastschuss(component, mastschuss.getEndTeilMastschuss());
			}

		}

	}

	/**
	 * builtVSforMastschuss fügt einem Mastschuss SolidVerbindungsstuecke hinzu.
	 *
	 * @param component
	 *            die Geometry Component welcher die SolidComponents geadded
	 *            werden sollen
	 * @param teilMastschuss
	 *            teilMastschuss für welchen die SolidVerbindungsstuecke erzeugt
	 *            werden sollen
	 *
	 *
	 */
	private void builtVSforMastschuss(Component component, TeilMastschuss teilMastschuss) {
		double radius = 10, x, y, z, psi, theta = 0, phi = 0, x1, y1, z1, x2, y2, z2, dx1, dy1, dz1, dx2, dy2, dz2, kx, ky, kz, sx, sy, sz, swap;
		List<Line> lines = new ArrayList<Line>();

		// handelt es sich bei dem teilMastschuss um ein AnfangsTeil muessen
		// alle Anbindungen um 180° gedreht werden --> swap = 1
		if (teilMastschuss.getClass().equals(AnfangsTeilMastschussImpl.class)) {
			swap = 1;
			// System.out.println("swap 1");
		} else {
			swap = 0;
		}

		radius = addLine(radius, lines, teilMastschuss.getHolm1());
		radius = addLine(radius, lines, teilMastschuss.getHolm2());
		radius = addLine(radius, lines, teilMastschuss.getHolm3());
		radius = addLine(radius, lines, teilMastschuss.getHolm4());
		radius = addLine(radius, lines, teilMastschuss.getHolm5());

		for (Line line : lines) {
			double laenge, breite, hoehe, lochdurchmesser, anschlussdurchmesser, verrundungpro, typ, uberstand;
			Line correspondingline = null;

			// bereche geometrische Laenge
			laenge = Math.pow((line.getEndPoint().getX() - line.getStartPoint().getX()), 2)
					+ Math.pow((line.getEndPoint().getY() - line.getStartPoint().getY()), 2)
					+ Math.pow((line.getEndPoint().getZ() - line.getStartPoint().getZ()), 2);
			laenge = Math.sqrt(laenge) / 1000;

			// Anschlusseigenschaften hardcoded
			anschlussdurchmesser = radius * 2;
			breite = 0.1;
			hoehe = 0.1;
			lochdurchmesser = 50;
			verrundungpro = 0.9;
			uberstand = 1.1;

			// Positionieren de Anschlusssteucke
			x1 = line.getStartPoint().getX();
			y1 = line.getStartPoint().getY();
			z1 = line.getStartPoint().getZ();
			x2 = line.getEndPoint().getX();
			y2 = line.getEndPoint().getY();
			z2 = line.getEndPoint().getZ();
			dx1 = x2 - x1;
			dy1 = y2 - y1;
			dz1 = z2 - z1;

			Collection<Stahlrohr> stahlrohre = InstanceWrapperExtensions.allInstances(Stahlrohr.class);
			for (Stahlrohr stahlrohr : stahlrohre) {
				if (stahlrohr.getClass().equals(HolmImpl.class)) {
					if (swap == 0) {
						if (Math.abs(stahlrohr.getStartPoint().getX().doubleValue() - line.getEndPoint().getX().doubleValue()) < 0.01
								&& Math.abs(stahlrohr.getStartPoint().getY().doubleValue() - line.getEndPoint().getY().doubleValue()) < 0.01
								&& Math.abs(stahlrohr.getStartPoint().getZ().doubleValue() - line.getEndPoint().getZ().doubleValue()) < 0.01) {
							correspondingline = stahlrohr;
							// System.out.println("found corresponding line");
							break;
						}
					} else {
						if (Math.abs(stahlrohr.getEndPoint().getX().doubleValue() - line.getStartPoint().getX().doubleValue()) < 0.01
								&& Math.abs(stahlrohr.getEndPoint().getY().doubleValue() - line.getStartPoint().getY().doubleValue()) < 0.01
								&& Math.abs(stahlrohr.getEndPoint().getZ().doubleValue() - line.getStartPoint().getZ().doubleValue()) < 0.01) {
							correspondingline = stahlrohr;
							// System.out.println("found corresponding line swap = 1");
							break;
						}
					}

				}
			}

			psi = Math.atan2(dy1, dx1) * 180 / Math.PI;
			theta = -Math.atan2(dz1, dx1) * 180 / Math.PI;

			if (correspondingline != null) {
				// Berechnen des Richtungsvektors des correspondierenden
				// Anschlusstücks
				// System.out.println("line");
				// System.out.println(dx1 + " " + dy1 + " " + dz1);

				dx2 = correspondingline.getEndPoint().getX() - correspondingline.getStartPoint().getX();
				dy2 = correspondingline.getEndPoint().getY() - correspondingline.getStartPoint().getY();
				dz2 = correspondingline.getEndPoint().getZ() - correspondingline.getStartPoint().getZ();
				// System.out.println("corresponding line:");
				// System.out.println(dx2 + " " + dy2 + " " + dz2);
				// Berechnen des normalen Vektors der Verbindungsebene
				kx = (dy1 * dz2) - (dz1 * dy2);
				ky = (dz1 * dx2) - (dx1 * dz2);
				kz = (dx1 * dy2) - (dy1 * dx2);
				// System.out.println("Normalenvektor:");
				// System.out.println(kx + " " + ky + " " + kz);
				// Berechnen des senkrechten Vektors nach transformation um
				// theta und psi
				sx = Math.sin(-Math.atan2(dz1, dx1)) * Math.cos(Math.atan2(dy1, dx1));
				sy = Math.cos(-Math.atan2(dz1, dx1));

				sz = Math.sin(-Math.atan2(dz1, dx1)) * Math.sin(Math.atan2(dy1, dx1));
				// System.out.println("Körpervektor:");
				// System.out.println(sx + " " + sy + " " + sz);
				// berechen von phi
				phi = Math.acos((kx * sx + ky * sy + kz * sz)
						/ (Math.sqrt(Math.pow(kx, 2) + Math.pow(ky, 2) + Math.pow(kz, 2)) + Math.sqrt(Math.pow(sx, 2) + Math.pow(sy, 2) + Math.pow(sz, 2))));
				phi = phi * 180 / Math.PI;
				// System.out.println("Phi");
				// System.out.println(phi);
				if (Math.abs(kx) < 0.01 && Math.abs(ky) < 0.01 && Math.abs(kz) < 0.01) {
					phi = 0;
				}
				if (Double.isNaN(phi)) {
					phi = 0;
				}
				// if (phi != 0) {
				// phi = phi - 90;
				// }
				if (phi < 0) {

				}
				if (swap == 1) {
					phi = -phi;
				}
				// System.out.println(phi);
			}

			if (Math.abs(Math.abs(phi) - 90) <= 0.001) {
				phi = 0;
			}
			if (psi > 0) {
				phi = -phi;
			}

			// System.out.println(theta + " " + psi + " " + phi);
			if (swap == 0) {
				typ = 1.;
				x = x1;
				y = y1;
				z = z1;
				phi = phi;
				psi = psi;
				theta = theta;

			} else {
				if (psi < 0 && theta < 0) {
					phi = -phi;
				}
				typ = 2.;
				x = x2;
				y = y2;
				z = z2;
				phi = -phi;
				psi = psi;
				theta = theta + 180;
			}

			// Anschlussstueck generieren
			Verbindungsstueck stueck = generateanschluss(line, laenge, breite, hoehe, lochdurchmesser, anschlussdurchmesser, verrundungpro, typ, uberstand, x,
					y, z, phi, theta, psi, swap);

			// Anschlusssteuck hinzufügen
			component.sub_add_(stueck);

		}
	}

	private double addLine(Double prevradius, List<Line> lines, Stahlrohr rohr) {
		Double radius = prevradius;
		if (rohr != null) {
			if (rohr.getLaenge() > 0.1) {
				lines.add(rohr);
				return rohr.getDurchmesser() / 2;
			}
		}

		return radius;
	}

	/**
	 * generateanschluss erstellt eine uml Verbindungsstueck Instance mit den
	 * übergebenen Eigenschaften
	 *
	 * @return erstelltes Verbindungsstueck
	 *
	 */
	private Verbindungsstueck generateanschluss(Line line, double laenge, double breite, double hoehe, double lochdurchmesser, double anschlussdurchmesser,
			double verrundungpro, double typ, double uberstand, double x, double y, double z, double phi, double theta, double psi, double swap) {

		Stereotype spgconstStereo = getProfile(get43Profiles().getSpg()).getOwnedStereotype("spgconst");

		Verbindungsstueck verbindungsstueck = InstanceWrapperExtensions.createInstance(Verbindungsstueck.class, line.umlInstance().getName()
				+ "Verbindungsstueck");

		verbindungsstueck.setLaenge(laenge);
		verbindungsstueck.setBreite(breite);
		verbindungsstueck.setHoehe(hoehe);
		verbindungsstueck.setLochdurchmesser(lochdurchmesser);
		verbindungsstueck.setAnschlussdurchmesser(anschlussdurchmesser);
		verbindungsstueck.setVerrundungpro(verrundungpro);
		verbindungsstueck.setTyp(typ);
		verbindungsstueck.setUberstand(uberstand);
		verbindungsstueck.setDx(x);
		verbindungsstueck.setDy(y);
		verbindungsstueck.setDz(z);
		verbindungsstueck.setPhi(phi);
		verbindungsstueck.setPsi(psi);
		verbindungsstueck.setTheta(theta);
		verbindungsstueck.setSwap(swap);
		verbindungsstueck.setLine(line);

		verbindungsstueck.umlSlotLaenge().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotBreite().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotHoehe().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotLochdurchmesser().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotAnschlussdurchmesser().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotVerrundungpro().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotTyp().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotUberstand().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotSwap().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotDx().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotDy().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotDz().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotPhi().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotPsi().applyStereotype(spgconstStereo);
		verbindungsstueck.umlSlotTheta().applyStereotype(spgconstStereo);

		return verbindungsstueck;

	}
}