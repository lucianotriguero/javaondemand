package modulswing;

import javax.swing.*;

@SuppressWarnings("serial")
public class CitiesPanel extends JPanel {

    //Constructor
    public CitiesPanel() {
        JButton b1 = new JButton("New York");
        add(b1);
        JButton b2 = new JButton("London");
        add(b2);
        JButton b3 = new JButton("Stockholm");
        add(b3);
        JButton b4 = new JButton("Tokyo");
        add(b4);
        

    }  
}
