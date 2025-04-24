package modulswing;

import java.awt.*;   //Insets
import java.util.*;  //Random
import javax.swing.*;


@SuppressWarnings("serial")
public class PaintPanel extends JPanel {

    //instansvariabels
    Insets ins;        //Holds the panel's insets
    Random rand;
    
    //Contructor
    PaintPanel() {
        //Put a border around the panel
        setBorder(BorderFactory.createLineBorder(Color.RED, 5,true));
        rand = new Random();
    }

    //Override the paintComponent() method in JPanel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x1, y1, x2, y2;
        //Get the height and width of the component
        int height = getHeight();
        int width = getWidth();
        //Get the insets
        ins = getInsets();
        //Draw ten lines whose endpoints are randomly generated
        for ( int i=0; i<10; i++) {
            x1 = rand.nextInt(width-ins.left);
            y1 = rand.nextInt(height-ins.bottom);
            x2 = rand.nextInt(width-ins.left);
            y2 = rand.nextInt(height-ins.bottom);

            //Draw the line
            g.drawLine(x1, y1, x2, y2);
        } 
    }
}
