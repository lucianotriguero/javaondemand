package modulswing;

import java.awt.*;
import javax.swing.*;

public class SwingJScrollPaneDemoApp {

    //Constructor
    SwingJScrollPaneDemoApp() {

        //Create a new JFrame container 
        JFrame frame = new JFrame("A Swing JScrollPane Demo");
        //Give the frame a initial size
        frame.setSize(400, 400);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a Panel and add 400 button to it
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20, 20));

        int b = 0;
        for(int i=0; i<20; i++) {
            for(int j=0; j<20; j++) {
                jp.add(new JButton("Button " +b));
                b++;
            }
        }

        //Create the scroll pane
        JScrollPane jsp = new JScrollPane(jp);

        //Add the scroll pane to the content pane
        //Because the default border layout is used, the scroll pane will
        //added to the center.
        frame.add(jsp,BorderLayout.CENTER);

         //Display the frame
       frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    new SwingJScrollPaneDemoApp();
                }            
            }
       );
    }
}
