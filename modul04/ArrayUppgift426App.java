package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.util.Arrays;
import java.util.Random;

public class ArrayUppgift426App {

    public static void printArray(int[] a) {
        
        System.out.print("a = {" + a[0]);
        for (int i = 1; i<a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.print("}");
    }

    public static int[] randomArray(int size, int low, int high) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i=0; i<a.length; i++) {
            a[i] = low + random.nextInt(high-low);
        }
        return a;
    }

    /**
         * Starts the Java application
         * @param args command lines paramters
    */
    public static void main(String[] args) {

        int[] a = randomArray(20,0,99);
        
        System.out.println();
        System.out.println("Arrayen innan sortering");
        printArray(a);
        
        //Sortering
        Arrays.sort(a);
        System.out.println();
        System.out.println("Arrayen efter sortering");
        printArray(a);   
    }
}
