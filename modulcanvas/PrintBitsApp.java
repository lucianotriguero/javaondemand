package modulcanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * {@ Luciano Triguero, rev 2023}
 * Material: Tillämpad Matematik för Automation
 */

@SuppressWarnings("serial")
public class PrintBitsApp extends Canvas {

    PrintBitsApp() {

        //Create a JFrame Container
        JFrame frame = new JFrame("Digitalteknik för Automation");

        frame.setLayout(new FlowLayout());
        //Give the frame a initial size
        frame.setSize(400, 200);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create text-base label
        JLabel prompt = new JLabel("Enter an integer ");
        JTextField input = new JTextField(10);
        frame.add(prompt);
        frame.add(input);

        JLabel result = new JLabel( "The integer in bits is");
        JTextField output = new JTextField(32);    
        frame.add(result);
        frame.add(output);

        //Handle action event
        input.addActionListener(new ActionListener() 
            //Show text when user passes ENTER  
            { 
              public void actionPerformed(ActionEvent ae) {
                int val = Integer.parseInt(input.getText());
                output.setText(getBits(val));
            }
            });
        frame.setVisible(true);
    }

    public String getBits( int value ) {

        int displayMask = 1 << 31;
        StringBuffer buf = new StringBuffer(35);
        for ( int c = 1; c <= 32; c++ ) {
            buf.append((value & displayMask ) == 0 ? '0' : '1');
            value <<= 1;
            if ( c % 8 == 0) buf.append( ' ');
        }
        return buf.toString();
    }
 
    public static void main(String[] args) {

        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new PrintBitsApp();
                }            
        });
    }
}
