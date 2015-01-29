import geometry.Component;
import geometry.Line;
import geometry.impl.AddImpl;
import gittermastschuss.classes.Mastschuss;
import gittermastschuss.classes.SolidVerbindung;
import gittermastschuss.classes.TeilMastschuss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import kran_v2.classes.Mast;
import claus43.frametoolbox.classes.Circular;
import claus43.frametoolbox.classes.ConNode;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;
import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class createSolidNotes extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) {

		System.out.println("createSolidNotes: typ 1.0 = holm, typ 2.0 = pfosten, typ 3.0 = diagonale");

		Collection<Mast> maeste = InstanceWrapperExtensions.allInstances(Mast.class);

		// Generate Solid for Gitterschussmaeste

		for (Mast mast : maeste) {
			for (Mastschuss mastschuss : mast.getMastschuss()) {

				Component component = InstanceWrapperExtensions.createInstance(Component.class, mastschuss.umlInstance().getName() + "_solidcomponent");
				mast.sub_add_(component);

				AddImpl addshape = InstanceWrapperExtensions.createInstance(AddImpl.class, mastschuss.umlInstance().getName() + "_add");
				component.setShape(addshape);

				List<Line> lines = new ArrayList<Line>();
				List<TeilMastschuss> teilMastschusse = new ArrayList<TeilMastschuss>();

				// lines des AnfangsTeils
				// lines.addAll(mastschuss.getAnfangsTeilMastschuss().getLine());
				// lines.addAll(mastschuss.getEndTeilMastschuss().getLine());

				// ################### Holme ############################

				// teilMastschusse.add(mastschuss.getAnfangsTeilMastschuss());
				// teilMastschusse.add(mastschuss.getEndTeilMastschuss());
				teilMastschusse.addAll(mastschuss.getMittelTeilMastschuss());

				double radius = 0;

				for (TeilMastschuss teilMastschuss : teilMastschusse) {
					// lines.addAll(mittelteil.getLine());

					if (teilMastschuss.getHolm1() != null) {
						lines.add(teilMastschuss.getHolm1());
						radius = teilMastschuss.getHolm1().getDurchmesser() / 2;
					}
					if (teilMastschuss.getHolm2() != null) {
						lines.add(teilMastschuss.getHolm2());
						radius = teilMastschuss.getHolm2().getDurchmesser() / 2;
					}
					if (teilMastschuss.getHolm3() != null) {
						lines.add(teilMastschuss.getHolm3());
						radius = teilMastschuss.getHolm3().getDurchmesser() / 2;
					}
					if (teilMastschuss.getHolm4() != null) {
						lines.add(teilMastschuss.getHolm4());
						radius = teilMastschuss.getHolm4().getDurchmesser() / 2;
					}

				}

				buildsolid(lines, addshape, radius, 1);

				// ################### Pfosten ############################

				teilMastschusse.clear();
				lines.clear();

				teilMastschusse.add(mastschuss.getAnfangsTeilMastschuss());
				teilMastschusse.add(mastschuss.getEndTeilMastschuss());
				teilMastschusse.addAll(mastschuss.getMittelTeilMastschuss());

				for (TeilMastschuss teilMastschuss : teilMastschusse) {
					// lines.addAll(mittelteil.getLine());

					if (teilMastschuss.getPfosten12() != null) {
						lines.add(teilMastschuss.getPfosten12());
						radius = teilMastschuss.getPfosten12().getDurchmesser() / 2;
					}
					if (teilMastschuss.getPfosten23() != null) {
						lines.add(teilMastschuss.getPfosten23());
						radius = teilMastschuss.getPfosten23().getDurchmesser() / 2;
					}
					if (teilMastschuss.getPfosten34() != null) {
						lines.add(teilMastschuss.getPfosten34());
						radius = teilMastschuss.getPfosten34().getDurchmesser() / 2;
					}
					if (teilMastschuss.getPfosten45() != null) {
						lines.add(teilMastschuss.getPfosten45());
						radius = teilMastschuss.getPfosten45().getDurchmesser() / 2;
					}
					if (teilMastschuss.getPfosten31() != null) {
						lines.add(teilMastschuss.getPfosten31());
						radius = teilMastschuss.getPfosten31().getDurchmesser() / 2;
					}
					if (teilMastschuss.getPfosten41() != null) {
						lines.add(teilMastschuss.getPfosten51());
						radius = teilMastschuss.getPfosten51().getDurchmesser() / 2;
					}
					if (teilMastschuss.getPfosten51() != null) {
						lines.add(teilMastschuss.getPfosten51());
						radius = teilMastschuss.getPfosten51().getDurchmesser() / 2;
					}

				}

				buildsolid(lines, addshape, radius, 2);

				// ################### Diagonale ############################

				teilMastschusse.clear();
				lines.clear();

				teilMastschusse.add(mastschuss.getAnfangsTeilMastschuss());
				teilMastschusse.add(mastschuss.getEndTeilMastschuss());
				teilMastschusse.addAll(mastschuss.getMittelTeilMastschuss());

				for (TeilMastschuss teilMastschuss : teilMastschusse) {
					// lines.addAll(mittelteil.getLine());

					if (teilMastschuss.getDiagonale12() != null) {
						lines.add(teilMastschuss.getDiagonale12());
						radius = teilMastschuss.getDiagonale12().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale23() != null) {
						lines.add(teilMastschuss.getDiagonale23());
						radius = teilMastschuss.getDiagonale23().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale34() != null) {
						lines.add(teilMastschuss.getDiagonale34());
						radius = teilMastschuss.getDiagonale34().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale41() != null) {
						lines.add(teilMastschuss.getDiagonale41());
						radius = teilMastschuss.getDiagonale41().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale21() != null) {
						lines.add(teilMastschuss.getDiagonale21());
						radius = teilMastschuss.getDiagonale21().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale31() != null) {
						lines.add(teilMastschuss.getDiagonale31());
						radius = teilMastschuss.getDiagonale31().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale32() != null) {
						lines.add(teilMastschuss.getDiagonale32());
						radius = teilMastschuss.getDiagonale32().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale43() != null) {
						lines.add(teilMastschuss.getDiagonale43());
						radius = teilMastschuss.getDiagonale43().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale14() != null) {
						lines.add(teilMastschuss.getDiagonale14());
						radius = teilMastschuss.getDiagonale14().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale13() != null) {
						lines.add(teilMastschuss.getDiagonale13());
						radius = teilMastschuss.getDiagonale13().getDurchmesser() / 2;
					}

				}

				buildsolid(lines, addshape, radius, 3);

			}

		}

	}

	private void buildsolid(List<Line> lines, AddImpl add, double Radius, double type) {

		for (Line line : lines) {
			SolidVerbindung solidVerbindung = InstanceWrapperExtensions.createInstance(SolidVerbindung.class, line.umlInstance().getName() + "_solid");
			ConNode startnode = InstanceWrapperExtensions.createInstance(ConNode.class, line.umlInstance().getName() + "_startnode");
			ConNode endnode = InstanceWrapperExtensions.createInstance(ConNode.class, line.umlInstance().getName() + "_endnode");

			solidVerbindung.setStartNode(startnode);
			solidVerbindung.setEndNode(endnode);
			solidVerbindung.setLine(line);
			solidVerbindung.setTyp(type);

			Circular circular = InstanceWrapperExtensions.createInstance(Circular.class, line.umlInstance().getName() + "_circular");
			circular.setConnection(solidVerbindung);

			if (Radius != 0.) {
				circular.setRadius(Radius);
			}

			// Component component2 =
			// InstanceWrapperExtensions.createInstance(Component.class,
			// line.umlInstance().getName() + "_solidcomponent");
			// component2.setShape(solidVerbindung);

			// component.sub_add_(component2);

			add.live_add_(solidVerbindung);

		}

	}

}
