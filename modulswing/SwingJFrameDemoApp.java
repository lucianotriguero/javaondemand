package modulswing;

import javax.swing.*;

public class SwingJFrameDemoApp {

   //Constructor
   SwingJFrameDemoApp () {
       //Create a new JFrame container 
       JFrame frame = new JFrame("A simple Swing Application");
       //Give the frame a initial size
       frame.setSize(275, 100);
       //Terminate the program when the user close the application
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //Create a text-base label
       JLabel jlab = new JLabel("My first Swing application.");
       //Add the label to the frame
       frame.add(jlab);
       //Display the frame
       frame.setVisible(true);
   }

    public static void main(String[] args) {

        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new SwingJFrameDemoApp();
                }            
        });
    } 
}
