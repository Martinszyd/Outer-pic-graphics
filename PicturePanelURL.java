package Picture;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class PicturePanelURL extends JPanel {

    private BufferedImage image;

    public PicturePanelURL() throws MalformedURLException {

        super();

        URL imageURL = new URL("https://javastart.pl/img/wp-content/uploads/2011/04/program-obrazkowy.png");
        try {
            image = ImageIO.read(imageURL);
        } catch (IOException e) {
            System.err.println("No file found");
            e.printStackTrace();
        }

        Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
        setPreferredSize(dimension);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, 10, 10, this);
    }

}
