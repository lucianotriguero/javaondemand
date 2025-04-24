package modulbackup;

import java.awt.Color;
import javax.swing.JFrame;

public class ListDrawablePolygonApp {

    public static void main(String[] args) {
        
        DrawablePolygon p = new DrawablePolygon();
        //BlinkingPolygon p = new BlinkingPolygon();
        p.addPoint(57,110);
        p.addPoint(100,35);
        p.addPoint(143, 110);
        p.color =Color.GREEN;
        p.translate(250,125);

        
        Drawing drawing = new Drawing(500, 250);
        drawing.add(p);

        //Set up the windows frame
        JFrame frame = new JFrame("Polygon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
        
        //Animation block
        while(true) {
            drawing.step();
            try {
                Thread.sleep(1000/40);
            } catch (InterruptedException e) {
                // do nothing
            }
        }

        
        
        
    }
}
