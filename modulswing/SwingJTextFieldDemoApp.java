package modulswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingJTextFieldDemoApp {

    //Constructor
   SwingJTextFieldDemoApp () {
       //Create a new JFrame container 
       JFrame frame = new JFrame("A Swing JTextField Application");
       
       //Specify FlowLayout for the layout manager
       frame.setLayout(new FlowLayout());
       //Give the frame a initial size
       frame.setSize(260, 120);
       //Terminate the program when the user close the application
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //Create a JTextFiled and add it to frame
       JTextField jtf = new JTextField(15);
       frame.add(jtf);

       //Create a JLabel and add it to frame
       JLabel jlab = new JLabel();
       frame.add(jlab);

       //Handle action event
        jtf.addActionListener(new ActionListener() 
            { public void actionPerformed(ActionEvent ae) 
             //Show text when user passes ENTER   
             {jlab.setText(jtf.getText());}
            });

       //Display the frame
       frame.setVisible(true);
   }

    public static void main(String[] args) {

        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new SwingJTextFieldDemoApp();
                }            
        });
    }  
}
