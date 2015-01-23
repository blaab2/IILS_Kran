import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import de.iils.dc43.transformationengine.javarule.JavaRule;
import de.iils.dc43.transformationengine.popup.actions.TransformationRunner;

public class drawOverviewPanel extends JavaRule {

	@Override
	public void execute(TransformationRunner trafoRunner) throws IOException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd'_'HHmm_");
		Date currentTime = new Date();
		// String filename = getProjectDir() + formatter.format(currentTime) +
		// "Arbeitsbereich.png";
		String filename = getProjectDir() + "Arbeitsbereich.png";

		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(1200, 900);
		f.setTitle(filename);
		f.setBackground(new Color(255, 255, 255));
		f.add(new drawoverview());
		f.setAlwaysOnTop(true);
		f.setVisible(true);

		BufferedImage image = new BufferedImage(f.getWidth(), f.getHeight(), BufferedImage.TYPE_INT_RGB);
		// call the Component's paint method, using
		// the Graphics object of the image.
		f.paint(image.getGraphics()); // alternately use .printAll(..)
		if (ImageIO.write(image, "png", new File(filename))) {
			System.out.println("exported: " + filename);
		}
	}
}