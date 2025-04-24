package modul02;
import javax.swing.*;

/**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class UppgiftM213ReverseWordApp {

    public static String reverseString (String s) {
        String reverse = " ";
        for (int i=s.length()-1; i>=0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
    
    /**
         * Starts the Java application
         * @param args command lines paramters
    */
    public static void main(String[] args) throws Exception {
         
        String ord = JOptionPane.showInputDialog("Enter a word"); 
        String p = reverseString(ord);
        //JFrame frame = new JFrame("Show the use of JFrame");
        JOptionPane.showMessageDialog(null, "The reverse word is:" + p);
        //frame.setVisible(false);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.exit(0);
    }
}
