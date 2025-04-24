package modulswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingMenuWithMnemonicsAcceleratorApp implements ActionListener {

    JLabel jlab;

    SwingMenuWithMnemonicsAcceleratorApp() {

        //Create a new JFrame container 
         JFrame frame = new JFrame("A simple Menu Demo");
         //Specify FlowLayout for the layout manager
         FlowLayout layout = new FlowLayout();
         layout.setAlignment(FlowLayout.LEFT);
         frame.setLayout(layout);

         //Give the frame a initial size
         frame.setSize(200, 250);
         //Terminate the program when the user close the application
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a label that will display the menu selection
        jlab = new JLabel();

        //Create the menu bar
        JMenuBar jmb = new JMenuBar();

        //Create the File menu
        JMenu jmFile = new JMenu("File");
        jmFile.setMnemonic(KeyEvent.VK_F);
        JMenuItem jmiOpen = new JMenuItem("Open",KeyEvent.VK_O);
        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiClose = new JMenuItem("Close",KeyEvent.VK_C);
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiSave = new JMenuItem("Save",KeyEvent.VK_S);
        jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiExit = new JMenuItem("Exit",KeyEvent.VK_E);
        jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_DOWN_MASK));
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);

        //Filnally, add the entire File menu to the menu bar
        jmb.add(jmFile);

        //Create the Options menu
        JMenu jmOptions = new JMenu("Options");
        JMenu jmColors = new JMenu("Colors");  //Submenu of Options
        JMenuItem jmiRed = new JMenuItem("Red");
        JMenuItem jmiGreen = new JMenuItem("Green");
        JMenuItem jmiBlue = new JMenuItem("Blue");
        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        //Create the priority submenu
        JMenu jmPriority = new JMenu("Priority");
        JMenuItem jmiHigh = new JMenuItem("High");
        JMenuItem jmiLow = new JMenuItem("Low");
        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);

        //Create the reset menu item
        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        //Finally, add the entire options menu to the menu bar
        jmb.add(jmOptions);

        //Create the Help menu
        JMenu jmHelp = new JMenu("Help");
        JMenuItem jmiAbout = new JMenuItem("About");
        jmiAbout.setToolTipText("This is an example of setToolTipText");
        jmHelp.add(jmiAbout);

        //Finally, add the entirehelp menu to the menu bar
        jmb.add(jmHelp);

        //Add actions listeners for the menu items
        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
        jmiAbout.addActionListener(this);

        //Add the Label to the content pane (frame)
        frame.add(jlab);

        //Add the menubar to the content pane (frame)
        frame.add(jmb);

        //Display the frame
        frame.setVisible(true);
    }

    //Handle button event
    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        
        //If user choose Exit, then exit the program
        if(comStr.equals("Exit")) System.exit(0);

        //Otherwise, display the selection
        jlab.setText("You selected " + comStr); 
    } 
    
    public static void main(String[] args) {
        
         //Create the frame on the event dispatching thread
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingMenuWithMnemonicsAcceleratorApp();
            }            
        });
    }
    
}
