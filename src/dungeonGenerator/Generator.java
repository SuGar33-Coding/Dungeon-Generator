package dungeonGenerator;
import javax.swing.*;
import java.awt.*;

public class Generator {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Dungeon Generator");
        mainFrame.setPreferredSize(new Dimension(500,500));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel IntroPanel = new IntroWindow().get_IntroPanel();

        mainFrame.add(IntroPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
