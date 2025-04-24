package modulswing;

import javax.swing.JComboBox;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class FlavorsPanel extends JPanel {

    //Constructor
    public FlavorsPanel() {
        JComboBox<String> jcb = new JComboBox<String>();
        jcb.addItem("Vanilla");
        jcb.addItem("Chocolate");
        jcb.addItem("Strawberry");
        jcb.addItem("Caramel");
        add(jcb);
    }  
}
