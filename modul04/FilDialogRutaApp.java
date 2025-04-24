package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class FilDialogRutaApp {

    public static void main(String[] args) throws IOException {
        
        String aktuellMapp = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(aktuellMapp);
        int resultat = fc.showOpenDialog(null);
        if (resultat != JFileChooser.APPROVE_OPTION) {
            System.out.println("Ingen fil valdes");
            System.exit(0);
        } 

        String filnamn = fc.getSelectedFile().getAbsolutePath();
        System.out.println("Filnamnet is: " +filnamn);

        try (BufferedReader istream = new BufferedReader
                                 (new FileReader(filnamn))) {
            int radNr = 0;
            while ( true ) {
                String rad = istream.readLine();
                if (rad == null)   //är filen slut?
                break;
            radNr++;
            System.out.println(radNr + ": " + rad);
            }
        }
    }
}
