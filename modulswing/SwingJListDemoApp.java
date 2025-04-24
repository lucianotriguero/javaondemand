package modulswing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SwingJListDemoApp {

    String[] cities = {"New York", "Madrid", "Stockholm", "Berlin", "Tokyo", 
                    "Havana", "Alicante","Barcelona","Malmö"};

    SwingJListDemoApp() {

        //Create a new JFrame container 
        JFrame frame = new JFrame("A Swing JScrollPane Demo");
        //Specify FlowLayout for the layout manager
        frame.setLayout(new FlowLayout());
        //Give the frame a initial size
        frame.setSize(400, 400);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a JList
        JList<String> jlist = new JList<String>(cities);

        //Set the list selection mode to single-selection
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Add the jlist to the scroll pane
        JScrollPane jsp = new JScrollPane(jlist);

        //Set the preferred size of the Scroll pane
        jsp.setPreferredSize(new Dimension(120, 90));

        //Make a label that display the selection
        JLabel jlab = new JLabel("Choose a city");

        //Add selection listener for the list
        jlist.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent le) {
                //Get the index of the changed item
                int idx = jlist.getSelectedIndex();
                //Display selection, it item was selected
                if(idx != -1) {
                    jlab.setText("Current selection: " + cities[idx]);
                } else {
                    jlab.setText("Choose a city");
                }
            }
        });

        //Add the jsp (Scroll pane, which contains the jlist) and jlab to the frame
        frame.add(jsp);
        frame.add(jlab);

        //Display the frame
       frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    new SwingJListDemoApp();
                }            
            }
       );
    }
    
}
