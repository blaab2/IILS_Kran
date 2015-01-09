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
				lines.addAll(mastschuss.getAnfangsTeilMastschuss().getLine());
				lines.addAll(mastschuss.getEndTeilMastschuss().getLine());

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

					if (teilMastschuss.getPfosten1() != null) {
						lines.add(teilMastschuss.getPfosten1());
						radius = teilMastschuss.getPfosten1().getDurchmesser() / 2;
					}
					if (teilMastschuss.getPfosten2() != null) {
						lines.add(teilMastschuss.getPfosten2());
						radius = teilMastschuss.getPfosten2().getDurchmesser() / 2;
					}
					if (teilMastschuss.getPfosten3() != null) {
						lines.add(teilMastschuss.getPfosten3());
						radius = teilMastschuss.getPfosten3().getDurchmesser() / 2;
					}
					if (teilMastschuss.getPfosten4() != null) {
						lines.add(teilMastschuss.getPfosten4());
						radius = teilMastschuss.getPfosten4().getDurchmesser() / 2;
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

					if (teilMastschuss.getDiagonale1() != null) {
						lines.add(teilMastschuss.getDiagonale1());
						radius = teilMastschuss.getDiagonale1().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale2() != null) {
						lines.add(teilMastschuss.getDiagonale2());
						radius = teilMastschuss.getDiagonale2().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale3() != null) {
						lines.add(teilMastschuss.getDiagonale3());
						radius = teilMastschuss.getDiagonale3().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale4() != null) {
						lines.add(teilMastschuss.getDiagonale4());
						radius = teilMastschuss.getDiagonale4().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale5() != null) {
						lines.add(teilMastschuss.getDiagonale5());
						radius = teilMastschuss.getDiagonale5().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale6() != null) {
						lines.add(teilMastschuss.getDiagonale6());
						radius = teilMastschuss.getDiagonale6().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale7() != null) {
						lines.add(teilMastschuss.getDiagonale7());
						radius = teilMastschuss.getDiagonale7().getDurchmesser() / 2;
					}
					if (teilMastschuss.getDiagonale8() != null) {
						lines.add(teilMastschuss.getDiagonale8());
						radius = teilMastschuss.getDiagonale8().getDurchmesser() / 2;
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
