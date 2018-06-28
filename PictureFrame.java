package Picture;

import javax.swing.*;

public class PictureFrame extends JFrame {

    public PictureFrame() {
        super("Get picture");

        JPanel picturePanel = new PicturePanel();
        add(picturePanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
