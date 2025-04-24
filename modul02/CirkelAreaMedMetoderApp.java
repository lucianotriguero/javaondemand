package modul02;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Incremental development med flera metoder.
     * (c) Luciano Triguero, june 2023 
     */

import java.util.Scanner;

public class CirkelAreaMedMetoderApp {

    /**
         * Get Circeln's radie from the stdin
    */
    public static double getRadie() {

        double radie;
        try (Scanner in = new Scanner(System.in)) {
            //Prompt the user for the radie of the circle i units meter
            System.out.print("Mata in cirkelns radie i enheten meter = ");
            radie = in.nextDouble();
            return radie;
        }
    }

    /**
         * Calculates the circle's area
         * @param double radie, circle's radie
    */

    public static double calculateArea(double radie) {
        return (Math.PI*Math.pow(radie,2));
    }

    /**
         * Write the result, circle's area, out to the stdout
         * @param double area
    */

    public static void toPrint(double out) {
        System.out.printf("Cirkelns area blir lika med: %.1f m^2\n", out);
    }

     /**
         * Starts the Java application
         * @param args command lines paramters
    */

    public static void main(String[] args) throws Exception {

        toPrint(calculateArea(getRadie()));
    }
}

