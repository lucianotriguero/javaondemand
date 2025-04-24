package modul01;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Uppgift 1.1.8 
     * (c) Luciano Triguero, june 2023 
*/

import java.io.*;

public class Excercise118App {

    /**
         * Starts the Java application
         * @param args command lines paramters
    */

    public static void main(String[] args) throws IOException {
        
         //Create a BufferReader using System.in
         BufferedReader strin = new BufferedReader(new 
                                    InputStreamReader(System.in, System.console().charset()));

         System.out.print("Mata in produktsnummer: ");
         int pnr = Integer.parseInt(strin.readLine()); 
         System.out.print("Mata in produktspris: ");
         double ppris = Double.parseDouble(strin.readLine());
         System.out.print("Mata in inköpsdatum [YYYY/MM/DD] ");
         String pdatum = strin.readLine();

        System.out.println("Itemsnr. \t Itemspris \t Itemsinköpsdatum");
        System.out.println("================================================"); 
        System.out.format("%8d \t %8.2f \t %s \n", pnr, ppris, pdatum);

    }
    
}
