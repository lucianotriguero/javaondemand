package modulswing;

import javax.swing.*;

//@SuppressWarnings("serial")
public class SwingSimpleJlistDemoApp extends JFrame {
     private static JFrame frame;
     private static JList<String> mylist;

     public static void main(String[] args) {
            //Create a new JFrame
            frame = new JFrame("Frame");
            //Create an Object type MyJlistApp
            //Create a JPanel
            JPanel panel = new JPanel();
            //Array of String to store weekdays
            String week[] = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

            //Fill the List mylist with week
            mylist = new JList<String>(week);
            mylist.setSelectedIndex(2);
            panel.add(mylist);
            frame.add(mylist);
            //Object[] selectedColumns = mylist.getSelectedValuesList();
            frame.setSize(400,400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
}
