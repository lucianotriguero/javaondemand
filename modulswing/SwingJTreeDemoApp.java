package modulswing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;

public class SwingJTreeDemoApp {

    //Constructor
    SwingJTreeDemoApp() {

        //Set upp the JFrame
        //Create a new JFrame container 
        JFrame frame = new JFrame("A Swing JScrollPane Demo");
        //Give the frame a initial size
        frame.setSize(400, 250);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create top node of tree
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
        
        //Create subtree of "A"
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        top.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        top.add(a2);

        //Create subtree of B
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        top.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        top.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        top.add(b3);

        //Create the Tree
        JTree tree = new JTree(top);

        //Add the tree to the scroll pane
        JScrollPane jsp = new JScrollPane(tree);

        //Add the scroll pane to the content pane
        frame.add(jsp);

        //Add the label to the content pane
        JLabel jlab = new JLabel();
        frame.add(jlab,BorderLayout.SOUTH);

        //Handle tree selection events
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent tse) {
                jlab.setText("Selection is " + tse.getPath());
            }            
        });

        //Display the frame
       frame.setVisible(true);
    }

    public static void main(String[] args) {
        
        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingJTreeDemoApp();
            }            
        });

    }
    
}
