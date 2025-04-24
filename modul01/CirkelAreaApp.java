package modul01;

/**
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: A simple program to calculate the area of a circle
     * (c) Luciano Triguero, june 2023 
     */

import java.util.*;

public class CirkelAreaApp {

    /**
         * Starts the Java application
         * @param args command lines paramters
    */

    public static void main(String[] args) throws Exception {

        double radie, area;
        //Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.GERMAN);

        try (Scanner in = new Scanner(System.in)) {
            //Prompt the user for the radie of the circle i units meter
            System.out.print("Mata in cirkelns radie i enheten meter = ");
            radie = in.nextDouble();
        }

        //Calculate the circle's area: A = pi*r^2
        area = Math.PI*Math.pow(radie,2);


        //Write the result, circle's area, out to the stdout
        System.out.printf("Cirkelns area blir lika med: %.1f m^2\n", area);
      
    }
}
