package modulswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingPaintDemoApp {

    JLabel jlab;
    PaintPanel pp;

    SwingPaintDemoApp() {
        //Create a new JFrame container 
       JFrame frame = new JFrame("A simple Swing Application");
       //Give the frame a initial size
       frame.setSize(200, 150);
       //Terminate the program when the user close the application
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Create the panel that will be paintes with lines
       pp = new PaintPanel();
       
       //Add the panel to the frame
       frame.add(pp);

       /* //Create a text-base label
       JLabel jlab = new JLabel("Pain with Lines");
       frame.add(jlab); */
       
       //Display the frame
       frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new SwingPaintDemoApp();
                }            
        });
    }
}
