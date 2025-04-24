package modulcanvas;

import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Canvas;


public class RandomIntApp extends Canvas {

    public void paint(Graphics g) {
        int xPosition = 25;
        int yPosition = 25;
        int value;

        for ( int i = 1; i<=20; i++ ) {
            value = 1 + (int) (Math.random() * 6);
            g.drawString(Integer.toString(value), xPosition, yPosition);
            if ( i % 5 != 0 ) 
                xPosition += 40;
            else {
                xPosition = 25;
                yPosition += 15;
            }    
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Table");
        frame.setSize(200, 200);
        RandomIntApp t = new RandomIntApp();
        frame.add(t);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
