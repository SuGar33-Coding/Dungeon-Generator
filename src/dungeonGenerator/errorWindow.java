package dungeonGenerator;

import javax.swing.*;
import java.awt.*;

/* IntelliJ suggested I make this class package-private... wonder why that's better/why it thought to do that */
class errorWindow extends JDialog {
    private JLabel message;
    private JButton contactButton;

    /*
    Generic error message
     */
    errorWindow() {
        setLayout(new FlowLayout());

        message = new JLabel("Something went wrong!", SwingConstants.CENTER);
        add(message);
        contactButton = new JButton("Send angry letter to devs");
        add(contactButton);
        setTitle("Ya Messed Up");
        setSize(225, 100);
        setVisible(true);
    }

    /*
    Error message with passed-in string
     */
    errorWindow(String msg) {
        setLayout(new FlowLayout());

        message = new JLabel(msg, SwingConstants.CENTER);
        add(message);
        contactButton = new JButton("Send angry letter to devs");
        add(contactButton);
        setTitle("Ya Messed Up");
        setSize(250 + msg.length(), 100);
        setVisible(true);
    }
}
