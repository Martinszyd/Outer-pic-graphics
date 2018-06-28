package Picture;

import javax.swing.*;
import java.net.MalformedURLException;

public class PictureFrameURL extends JFrame {

    public PictureFrameURL() throws MalformedURLException {
        super("Get picture");

        JPanel picturePanelURL = new PicturePanelURL();
        add(picturePanelURL);

        setLocation(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
