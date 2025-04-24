package modulswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingRadioButtonDemoApp implements ActionListener {

    JLabel jlab;

    //Contructor
    SwingRadioButtonDemoApp() {

        //Create a new JFrame container 
        JFrame frame = new JFrame("A Swing JButton Application");
        //Specify FlowLayout for the layout manager
        frame.setLayout(new FlowLayout());
        //Give the frame a initial size
        frame.setSize(250, 100);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create JRadioButton objekts and add them to frame
        JRadioButton rb1 = new JRadioButton("A");
        rb1.addActionListener(this);
        frame.add(rb1);

        JRadioButton rb2 = new JRadioButton("B");
        rb2.addActionListener(this);
        frame.add(rb2);

        JRadioButton rb3 = new JRadioButton("C");
        rb3.addActionListener(this);
        frame.add(rb3);
        
        //Define a button group
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);  

       //Create a JLabel and add it to frame
       jlab = new JLabel("Select one");
       frame.add(jlab);

       //Display the frame
       frame.setVisible(true);

    }

    //Handle Button Selection/Event
    public void actionPerformed(ActionEvent ae) {
        jlab.setText("You selected " + ae.getActionCommand());
}
    public static void main(String[] args) {

         //Create the frame on the event dispatching thread
         SwingUtilities.invokeLater(
            new Runnable() {
            public void run() {
                new SwingRadioButtonDemoApp();
            }            
        });
    }
}
