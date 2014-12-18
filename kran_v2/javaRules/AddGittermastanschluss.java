import geometry.Component;
import geometry.Line;
import gittermastschuss.classes.Mastschuss;
import gittermastschuss.classes.Stahlrohr;
import gittermastschuss.classes.TeilMastschuss;
import gittermastschuss.classes.impl.AnfangsTeilMastschussImpl;
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
		double radius = 10, x, y, z, psi, theta, phi, x1, y1, z1, x2, y2, z2, dx, dy, dz, swap;
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

		for (Line line : lines) {
			double laenge, breite, hoehe, lochdurchmesser, anschlussdurchmesser, verrundungpro, typ, uberstand;

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
			dx = x2 - x1;
			dy = y2 - y1;
			dz = z2 - z1;

			if (swap == 0) {
				typ = 1.;
				x = x1;
				y = y1;
				z = z1;
				phi = 0;
				psi = Math.atan2(dy, dx) * 180 / Math.PI;
				theta = -Math.atan2(dz, dx) * 180 / Math.PI;

			} else {
				typ = 2.;
				x = x2;
				y = y2;
				z = z2;
				phi = 0;
				psi = Math.atan2(dy, dx) * 180 / Math.PI;
				theta = -Math.atan2(dz, dx) * 180 / Math.PI + 180;
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