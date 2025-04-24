package modul04;

import java.util.Arrays;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ArrayTilldelningApp {

    public static void main(String[] args) {
        
        double[] a = new double[3];
        double[] b = new double[3];

        //Utskrivning: Initiering
        System.out.println("Array a:  " + "Index" +"\t" + "Värde");
        //The enhanced for Loop
        int i;
        i = 0;
        for (double elementia : a ) {
            System.out.println("          " +    i    + "\t" + elementia);
            i++;
        }
            
        System.out.println();
        System.out.println("Array b:  " + "Index" +"\t" + "Värde");
        i = 0;
        for (double elementib : b) {
            System.out.println("          " +    i    + "\t" + elementib);
            i++;
        }

         //Tilldelning
        a[0]=1.5; a[1]=3.2; a[2]=4.2;
        b = a;
        //Utskrivning: Efter tilldelningen b = a
        System.out.println("Array a:  " + "Index" +"\t" + "Värde");
        //The enhanced for Loop
        i = 0;
        for (double elementia : a ) {
            System.out.println("          " +    i    + "\t" + elementia);
            i++;
        }
            
        System.out.println();
        System.out.println("Array b:  " + "Index" +"\t" + "Värde");
        i = 0;
        for (double elementib : b) {
            System.out.println("          " +    i    + "\t" + elementib);
            i++;
        }

        b = Arrays.copyOf(a,3);
    }
    
}
