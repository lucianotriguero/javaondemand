package modulswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingEventDemoApp {

    JLabel jlab;

    //Constructor
   SwingEventDemoApp () {
       //Create a new JFrame container 
       JFrame frame = new JFrame("A Swing Event Application");
       
       //Specify FlowLayout for the layout manager
       frame.setLayout(new FlowLayout());
       //Give the frame a initial size
       frame.setSize(220, 90);
       //Terminate the program when the user close the application
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //Make two buttons
       JButton jbalfa = new JButton("Alpha");
       JButton jbbeta = new JButton("Beta");

       //Add action listener to Alpha
        jbalfa.addActionListener(new ActionListener() 
            { public void actionPerformed(ActionEvent ae) 
             {jlab.setText("Alpha was pressed");}
            });

        //Add action listener to Beta
       jbbeta.addActionListener(new ActionListener() 
            { public void actionPerformed(ActionEvent ae) 
              {jlab.setText("Beta was pressed");}
            });

       //Add the buttoms to the content pane
       frame.add(jbalfa);
       frame.add(jbbeta);

       //Create a text-base label
       jlab = new JLabel("Press a buttom.");
       //Add the label to the frame
       frame.add(jlab);
       //Display the frame
       frame.setVisible(true);
   }

    public static void main(String[] args) {

        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new SwingEventDemoApp();
                }            
        });
    }  
}
