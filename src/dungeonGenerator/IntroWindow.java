package dungeonGenerator;
import javax.swing.*;
import java.awt.*;

public class IntroWindow extends JFrame{  //First window of the application that requests dungeon information.

    JPanel panel;
    JFrame frame;

    IntroWindow() {
        frame = new JFrame();
        panel = new JPanel(); //Set Layout to Box?
        frame.setPreferredSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel partySizeL = new JLabel("Party Size: ");
        JTextField partySize = new JTextField(30);


        partySizeL.setVisible(true);
        panel.add(partySizeL);
        panel.add(partySize);
        panel.setVisible(true);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
