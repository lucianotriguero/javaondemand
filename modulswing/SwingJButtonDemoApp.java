package modulswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingJButtonDemoApp implements ActionListener {

    JLabel jlab;

    SwingJButtonDemoApp() {
        //Create a new JFrame container 
        JFrame frame = new JFrame("A Swing JButton Application");
       
        //Specify FlowLayout for the layout manager
        frame.setLayout(new FlowLayout());
        //Give the frame a initial size
        frame.setSize(500, 450);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //Create JButton objekts and add them to frame
       String smile1 = "\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modulswing\\facesmile2.jpg";
        ImageIcon facea = new ImageIcon(smile1);
        JButton jb = new JButton(facea);
        jb.setActionCommand("FaceA");
        jb.addActionListener(this);
        frame.add(jb);

        String smile2 = "\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modulswing\\facesmile2.jpg";
        ImageIcon faceb = new ImageIcon(smile2);
        jb = new JButton(faceb);
        jb.setActionCommand("FaceB");
        jb.addActionListener(this);
        frame.add(jb);

        String smile3 = "\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modulswing\\facesmile3.jpg";
        ImageIcon facec = new ImageIcon(smile3);
        jb = new JButton(facec);
        jb.setActionCommand("FaceC");
        jb.addActionListener(this);
        frame.add(jb);

        String smile4 = "\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modulswing\\facesmile.png";
        ImageIcon faced = new ImageIcon(smile4);
        jb = new JButton(faced);
        jb.setActionCommand("FaceD");
        jb.addActionListener(this);
        frame.add(jb);

       //Create a JLabel and add it to frame
       jlab = new JLabel("Choose a Facesmile");
       frame.add(jlab);

       //Display the frame
       frame.setVisible(true);

    }

    //Handle button event
    public void actionPerformed(ActionEvent ae) {
            jlab.setText("You selected " + ae.getActionCommand());
    }

    public static void main(String[] args) {

        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingJButtonDemoApp();
            }            
        });
    }
}
