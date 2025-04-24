package modulcanvas;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class IncrementApp extends Canvas {

    public void paint(Graphics g) {
        
        int c = 5;
        g.drawString(Integer.toString(c), 25, 25);
        g.drawString(Integer.toString(c++), 25, 40);
        g.drawString(Integer.toString(c), 25, 55);

        c = 5;
        g.drawString(Integer.toString(c), 25, 85);
        g.drawString(Integer.toString(++c), 25, 100);
        g.drawString(Integer.toString(c), 25, 115);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Table");
        frame.setSize(200, 200);
        IncrementApp t = new IncrementApp();
        frame.add(t);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
