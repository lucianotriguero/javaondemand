package modulswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingCheckBoxesDemoApp implements ItemListener {

    JLabel jlab;

    SwingCheckBoxesDemoApp() {

        //Create a new JFrame container 
        JFrame frame = new JFrame("A Swing JButton Application");
       
        //Specify FlowLayout for the layout manager
        frame.setLayout(new FlowLayout());
        //Give the frame a initial size
        frame.setSize(250, 100);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add boxes
        JCheckBox cb = new JCheckBox("C");
        cb.addItemListener(this);
        frame.add(cb);

        cb = new JCheckBox("C++");
        cb.addItemListener(this);
        frame.add(cb);

        cb = new JCheckBox("Java");
        cb.addItemListener(this);
        frame.add(cb);

        cb = new JCheckBox("Perl");
        cb.addItemListener(this);
        frame.add(cb);

        //Create a JLabel and add it to frame
       jlab = new JLabel("Selecte a language");
       frame.add(jlab);

       //Display the frame
       frame.setVisible(true);

    }

    //Handle iten events for the check boxes
    @Override
    public void itemStateChanged(ItemEvent ie) {
       JCheckBox cb = (JCheckBox) ie.getItem();

       if (cb.isSelected()) 
           jlab.setText(cb.getText() + " is selected");
       else
           jlab.setText(cb.getText() + " is cleared");
    }
    
    public static void main(String[] args) {
         //Create the frame on the event dispatching thread
         SwingUtilities.invokeLater(
            new Runnable() {
            public void run() {
                new SwingCheckBoxesDemoApp();
            }            
        });
    }
}
