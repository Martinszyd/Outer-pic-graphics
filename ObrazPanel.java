package Picture;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ObrazPanel extends JPanel {

    private BufferedImage diskImage;
    private BufferedImage netImage;

    private int panelWidth;
    private int panelHeight;

    public ObrazPanel() {
        super();

        try {
            //utworzenie obiektu URL ze ścieżką do obrazu
            URL imageURL = new URL("https://javastart.pl/assets/images/javastart-logo.png");
            //odczytanie obrazu z adresu URL
            netImage = ImageIO.read(imageURL);

            //Utworzenie nowego pliku na dysku
            File imageFile = new File("java.jpg");
            //zapisanie obrazu do pliku
            ImageIO.write(netImage, "png", imageFile);
            //wczytanie obrazu z pliku
            diskImage = ImageIO.read(imageFile);

        } catch (IOException e) {
            System.err.println("File read error");
            e.printStackTrace();
        }

        panelWidth = diskImage.getWidth()*2; //*2 aby zmieścić ten sam obraz dwukrotnie
        panelHeight = diskImage.getHeight(); //wysokość panelu == wysokość obrazu
        Dimension dimension = new Dimension(panelWidth, panelHeight);
        setPreferredSize(dimension);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //narysowanie obrazu z dysku
        g2d.drawImage(diskImage, 0, 0, this);
        //narysowanie obrazu z sieci
        g2d.drawImage(netImage, diskImage.getWidth(), 0, null);
    }
}
