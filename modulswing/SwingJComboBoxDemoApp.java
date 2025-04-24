package modulswing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingJComboBoxDemoApp {

    String[] smilefaces = {"ModelA", "ModelB", "ModelC", "ModelD"};

    SwingJComboBoxDemoApp() {

        //Set upp the JFrame
        //Create a new JFrame container 
        JFrame frame = new JFrame("A Swing JScrollPane Demo");
        //Specify FlowLayout for the layout manager
        frame.setLayout(new FlowLayout());
        //Give the frame a initial size
        frame.setSize(400, 250);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Instantiate a combo box ans add it to the content pane
        JComboBox<String> jcb = new JComboBox<String>(smilefaces);
        frame.add(jcb);

        //Create a label and add it to the content pane
        String smile1 = "\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modulswing\\facesmile1.jpg";
        JLabel jlab = new JLabel(new ImageIcon(smile1));
        frame.add(jlab);

        //Handle selctions
        jcb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String s = (String) jcb.getSelectedItem();
                System.out.println(s);
                if (s.equals(smilefaces[0])) {
                    jlab.setIcon(new ImageIcon(smile1));
                    frame.add(jlab);
                }
                if (s.equals(smilefaces[1])) {
                    String smile2 = "\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modulswing\\facesmile2.jpg";
                    jlab.setIcon(new ImageIcon(smile2));
                    frame.add(jlab);
                }
                if (s.equals(smilefaces[2])) {
                    String smile3 = "\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modulswing\\facesmile3.jpg";
                    jlab.setIcon(new ImageIcon(smile3));
                    frame.add(jlab);
                }
                if (s.equals(smilefaces[3])) {
                    String smile4 = "\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modulswing\\facesmile.png";
                    jlab.setIcon(new ImageIcon(smile4));
                    frame.add(jlab);
                }
            }
        });

        //Display the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    new SwingJComboBoxDemoApp();
                }            
            }
       );
    }
    
}
