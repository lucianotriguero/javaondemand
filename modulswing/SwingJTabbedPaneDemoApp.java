package modulswing;

import java.awt.*;
import javax.swing.*;

public class SwingJTabbedPaneDemoApp {

    SwingJTabbedPaneDemoApp() {

        //Create a new JFrame container 
        JFrame frame = new JFrame("A Swing JTabbedPane Application");
        //Specify FlowLayout for the layout manager
        frame.setLayout(new FlowLayout());
        //Give the frame a initial size
        frame.setSize(400, 200);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Created the tabbed pane and it to frame
        JTabbedPane jtp = new JTabbedPane(1);
        jtp.addTab("Cities", new CitiesPanel());
        jtp.addTab("Colors", new ColorsPanel());
        jtp.addTab("Flavors", new FlavorsPanel());
        frame.add(jtp);

        //Display the frame
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {

        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    new SwingJTabbedPaneDemoApp();
                }            
            }
       );
    }
}
