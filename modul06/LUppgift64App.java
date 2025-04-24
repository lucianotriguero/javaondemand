package modul06;

/**
     * Course: Javaprogrammering
     * Modul 6
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JFileChooser;

public class LUppgift64App {

    public static String ReadFile() {
        String aktuellMapp = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(aktuellMapp);
        int resultat = fc.showOpenDialog(null);
        if (resultat != JFileChooser.APPROVE_OPTION) {
            System.out.println("Ingen fil valdes");
            System.exit(0);
        } 
        String filnamn = fc.getSelectedFile().getAbsolutePath();
        return filnamn;
    }

    public static String reverse(String s) {
        String rev = "";
        for ( int i = s.length()-1; i>=0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) throws IOException {
        
        String filnamn = ReadFile();
        System.out.println("Filnamnet is: " +filnamn);
        LinkedList<String> lnames = new LinkedList<String>();

        try (BufferedReader istream = new BufferedReader
                                 (new FileReader(filnamn))) {

            while ( true ) {
                String rad = istream.readLine();
                if (rad == null)   //är filen slut?
                break;
                lnames.add(rad);
            }
        }

        Collections.sort(lnames);
        for ( String iter : lnames ) {
            System.out.println(iter);
        }

        int antalpeter = Collections.frequency(lnames, "Peter");
        System.out.println("Peter upprepas: " + antalpeter + " gånger");


        //Uökad uppgifter
        //Creating another linked list and copy
        LinkedList<String> semanl = new LinkedList<String>();
        for ( String iter : lnames ) {
            semanl.add(iter);
        }

        System.out.println();
        for ( String iter : semanl ) {
            System.out.println(iter + "  " + reverse(iter));
        }
    }
}
