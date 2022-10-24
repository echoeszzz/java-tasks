package task5;

import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.imageio.ImageIO;

public class AnimationGUI extends JPanel {

    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        ArrayList<String> picturePaths = new ArrayList<>();
        picturePaths.add("/Users/ivanruzin/mirea/java/java-tasks/src/task5/1853.jpg");
        picturePaths.add("/Users/ivanruzin/mirea/java/java-tasks/src/task5/alllalaahhhuhuuu.jpeg");
        picturePaths.add("/Users/ivanruzin/mirea/java/java-tasks/src/task5/inpectorGadget.jpg");
        int i = 0;
        JPanel pane1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    g.drawImage(ImageIO.read(new File(picturePaths.get(0))), 0, 0, null);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        JPanel pane2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    g.drawImage(ImageIO.read(new File(picturePaths.get(1))), 0, 0, null);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        JPanel pane3 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    g.drawImage(ImageIO.read(new File(picturePaths.get(2))), 0, 0, null);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        ArrayList<JPanel> panels = new ArrayList<>();
        panels.add(pane1);
        panels.add(pane2);
        panels.add(pane3);
        while (true) {
            var curr_pane = panels.get(i % 3);
            frame.add(curr_pane);
            frame.setVisible(true);
            ++i;
            TimeUnit.SECONDS.sleep(1);
            frame.remove(curr_pane);
            frame.setVisible(false);
        }

    }
}

