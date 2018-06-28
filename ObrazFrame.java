package Picture;

import javax.swing.*;

public class ObrazFrame extends JFrame {

        public ObrazFrame() {
            super("another way to read picture file double");

            JPanel obrazPanel = new ObrazPanel();
            add(obrazPanel);

            setLocation(550, 150);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pack();
            setVisible(true);
        }
}
