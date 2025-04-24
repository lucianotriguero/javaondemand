package modulswing;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ColorsPanel extends JPanel {

    //Constructor
    public ColorsPanel() {
        JCheckBox b1 = new JCheckBox("White");
        add(b1);
        JCheckBox b2 = new JCheckBox("Yellow");
        add(b2);
        JCheckBox b3 = new JCheckBox("Green");
        add(b3);
        JCheckBox b4 = new JCheckBox("Red");
        add(b4);
    }  
    
}
