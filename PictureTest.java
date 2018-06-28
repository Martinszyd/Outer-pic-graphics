package Picture;

import java.awt.*;
import java.net.MalformedURLException;

public class PictureTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PictureFrame();
            }
        });

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new PictureFrameURL();
                } catch (MalformedURLException e) {
                    System.err.println("Address error");
                    e.printStackTrace();
                }
            }
        });

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ObrazFrame();
            }
        });
    }
}
