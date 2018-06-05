package dungeonGenerator;

import javax.swing.*;

/* IntelliJ suggested I make this class package-private... wonder why that's better/why it thought to do that */
class errorWindow extends JDialog {
    private JLabel message;

    /*
    Generic error message
     */
    errorWindow() {

        message = new JLabel("Something went wrong!", SwingConstants.CENTER);
        add(message);
        setTitle("Ya Messed Up");
        setSize(225, 100);
        setVisible(true);
    }

    /*
    Error message with passed-in string
     */
    errorWindow(String msg){

        message = new JLabel(msg, SwingConstants.CENTER);
        add(message);
        setTitle("Ya Messed Up");
        setSize(200 + msg.length(), 100);
        setVisible(true);
    }
}
