import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JPanel;

import kran_v2.classes.Kran;
import de.iils.dc43.scriptrule.InstanceWrapperExtensions;

public class drawoverview extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		// super.paintComponent(g);

		NumberFormat numberFormatLoad = new DecimalFormat("#####0.0");
		NumberFormat numberFormatLength = new DecimalFormat("#####0");
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		BasicStroke standard = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1, new float[] { 1, 0 }, 0);
		BasicStroke doted1 = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1, new float[] { 1, 4 }, 0);
		BasicStroke doted2 = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1, new float[] { 1, 8 }, 0);

		Kran kran = InstanceWrapperExtensions.allInstances(Kran.class).iterator().next();

		int koordinatenursprung_x = (int) (70);
		int koordinatenursprung_z = (int) (900);

		int hauptausleger_laenge = (int) (kran.getHauptausleger().getLaenge().doubleValue());
		// System.out.println("arbeitsbereich x " + hauptausleger_laenge);

		double resizefaktor = 800 / hauptausleger_laenge;

		// int hauptausleger_x0 = (int) (0 * resizefaktor);
		int hauptausleger_x0 = (int) (kran.getHauptausleger().getAbsoluteposition().getDx().doubleValue() / 1000 * resizefaktor);
		// System.out.println(hauptausleger_x0);

		// int hauptausleger_z0 = (int) (0 * resizefaktor);
		int hauptausleger_z0 = (int) (kran.getHauptausleger().getAbsoluteposition().getDz().doubleValue() / 1000 * resizefaktor);

		// int hauptausleger_laenge = 80;

		// int hauptausleger_theta = 70;
		int hauptausleger_theta = (int) ((360 - kran.getHauptausleger().getAbsoluteposition().getTheta().doubleValue()));
		// System.out.println("theta " + hauptausleger_theta);
		double theta = hauptausleger_theta;

		// int kran_masse = 80000;
		int kran_gesamtmasse = (int) (kran.getMasse().doubleValue() + kran.getMaxlast());
		// System.out.println("Masse " + kran_gesamtmasse);

		// double kran_schwerpunkt_x = -10;
		double kran_schwerpunkt_x = (kran.getSchwerpunktx().doubleValue() / 1000);
		double kran_schwerpunkt_xsolo = 0;

		// double kran_last = 20000;
		double kran_last = (kran.getMaxlast().doubleValue());

		double kran_arbeitsbereich_x = (Math.cos(theta * Math.PI / 180) * hauptausleger_laenge);
		double kran_arbeitsbereich_xneu = 0;
		int draw_background_arcs_count = 10;

		int settings_deltadeg = 5;

		// Arbeitsbereich
		kran_schwerpunkt_xsolo = kran_schwerpunkt_x + (kran_last / (kran_gesamtmasse - kran_last)) * (kran_schwerpunkt_x - kran_arbeitsbereich_x);

		hauptausleger_laenge = (int) (hauptausleger_laenge * resizefaktor);

		// Draw Header
		g2.setFont(new Font("Verdana", Font.BOLD, 20));

		g2.drawString("Arbeitsbereich auf Basis reiner Schwerpunktberechnung (maximale Last)", 10, 20);
		g2.setFont(new Font("Verdana", Font.PLAIN, 12));
		// Draw Background
		g2.setColor(new Color(122, 122, 122));
		Shape arc = // x, y, w, h, start, extend, type
		new Arc2D.Double(koordinatenursprung_x + hauptausleger_x0 - hauptausleger_laenge, koordinatenursprung_z + hauptausleger_z0 - hauptausleger_laenge,
				hauptausleger_laenge * 2, hauptausleger_laenge * 2, 0, hauptausleger_theta, Arc2D.PIE);
		((Graphics2D) g2).draw(arc);
		g2.setStroke(doted2);
		for (int i = 0; i < draw_background_arcs_count; i++) {
			arc = new Arc2D.Double(koordinatenursprung_x + hauptausleger_x0 - hauptausleger_laenge / draw_background_arcs_count * i, koordinatenursprung_z
					+ hauptausleger_z0 - hauptausleger_laenge / draw_background_arcs_count * i, hauptausleger_laenge * 2 / draw_background_arcs_count * i,
					hauptausleger_laenge * 2 / draw_background_arcs_count * i, 0, hauptausleger_theta, Arc2D.OPEN);
			((Graphics2D) g2).draw(arc);
		}

		// Berechnung
		g2.setStroke(doted1);
		int prevx = 0;
		for (theta = 85; (theta > 0); theta = theta - settings_deltadeg) {

			int x = (int) (Math.cos(theta * Math.PI / 180) * hauptausleger_laenge + koordinatenursprung_x + hauptausleger_x0);
			int x2 = (int) (Math.cos(theta * Math.PI / 180) * hauptausleger_laenge * 1.1 + koordinatenursprung_x + hauptausleger_x0);
			int xlabel = (int) (Math.cos(theta * Math.PI / 180) * hauptausleger_laenge * 1.02 + koordinatenursprung_x + hauptausleger_x0) + 10;
			int z = (int) (-Math.sin(theta * Math.PI / 180) * hauptausleger_laenge + koordinatenursprung_z + hauptausleger_z0);
			int z2 = (int) (-Math.sin(theta * Math.PI / 180) * hauptausleger_laenge * 1.1 + koordinatenursprung_z + hauptausleger_z0);
			int zlabel = (int) ((int) (-Math.sin(theta * Math.PI / 180) * hauptausleger_laenge * 1.02 + koordinatenursprung_z + hauptausleger_z0) + (Math
					.cos(theta * Math.PI / 180) * 20));

			g2.drawLine(x, z, x, koordinatenursprung_z + hauptausleger_z0);
			kran_arbeitsbereich_xneu = (Math.cos(theta * Math.PI / 180) * hauptausleger_laenge / resizefaktor);
			double kran_lastneu = (kran_gesamtmasse - kran_last) * (kran_schwerpunkt_xsolo - kran_schwerpunkt_x)
					/ (kran_schwerpunkt_x - kran_arbeitsbereich_xneu);

			if (prevx == 0 || x - prevx > 50) {
				g2.drawString(numberFormatLength.format(kran_arbeitsbereich_xneu) + " m", x, koordinatenursprung_z + 20);
				prevx = x;
			}

			g2.drawString(numberFormatLoad.format(kran_lastneu / 1000) + " t", xlabel, zlabel);
			g2.drawLine(koordinatenursprung_x + hauptausleger_x0, koordinatenursprung_z + hauptausleger_z0, x2, z2);

			arc = new Arc2D.Double(koordinatenursprung_x + hauptausleger_x0 - Math.cos(theta * Math.PI / 180) * hauptausleger_laenge, koordinatenursprung_z
					+ hauptausleger_z0 - Math.cos(theta * Math.PI / 180) * hauptausleger_laenge, Math.cos(theta * Math.PI / 180) * hauptausleger_laenge * 2,
					Math.cos(theta * Math.PI / 180) * hauptausleger_laenge * 2, 0, hauptausleger_theta, Arc2D.OPEN);
			((Graphics2D) g2).draw(arc);

		}

	}
}