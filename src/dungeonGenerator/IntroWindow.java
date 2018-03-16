package dungeonGenerator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class IntroWindow extends JPanel{  //First window of the application that requests dungeon information.

    private JPanel panel;
    private JRadioButton small, medium, large;
    private JLabel partySizeL, mapSizeL;
    private JTextField partySize, mapSize;
    private int roomNumber;
    private JButton nextButton;

    IntroWindow() {
        panel = new JPanel(); //Set Layout to Box?

        partySizeL = new JLabel("Party Size: "); // Elements that receive input from the user on the size of the party.
        partySize = new JTextField(5);


        mapSizeL = new JLabel("Dungeon Size: ");  // Radio buttons to receive the desired size of the dungeon
        mapSize = new JTextField(5);

        nextButton = new JButton("Next");
        nextButton.addActionListener(new NextListener());

        partySizeL.setVisible(true);
        panel.setBackground(Color.MAGENTA);
        panel.add(partySizeL);
        panel.add(partySize);
        panel.add(mapSizeL);
        panel.add(mapSize);
        panel.add(nextButton);
        panel.setVisible(true);
    }

    public JPanel get_IntroPanel() {
        return panel;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    private class NextListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String size = mapSize.getText();
            if (size.equals("")) {
                roomNumber = 0; // Display error message or throw exception
            } else {
                roomNumber = Integer.parseInt(size);
            }
            mapSizeL.setText("Dungeon Size: " + roomNumber);
        }
    }
}
