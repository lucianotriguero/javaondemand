package modul04;

import java.util.Arrays;
import java.util.Random;
/*
    * Course: Javaprogrammering
    * Modul 4
    * Purpose: A simple program to illustrate the use of arrays
    * (c) Luciano Triguero, august 2023 
*/
public class ArrayUppgift414App {

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

        //int[] a = new int[100];
        int[] a = randomArray(100,1,99);
        
        System.out.println();
        System.out.println("Uppgift a)");
        printArray(a);
     
        int[] b = new int[20];
        for (int i = 10; i<15; i++) {
            b[i] = a[i+40];
        }

        System.out.println();
        printArray(b);
        
        System.out.println();
        if (Arrays.equals(a,50,54,b,10,14) == true) 
            System.out.println("The copy was done correctly");
        else
            System.out.println("The copy failed");   

        //b) Standardmetoden arraycopy()
        System.arraycopy(a,95, b, 5, 5);

        System.out.println();
        System.out.println("Uppgift b)");
        printArray(b);

        System.out.println();
        if (Arrays.equals(a,95,99,b,5,9) == true) 
            System.out.println("The copy was done correctly");
        else
            System.out.println("The copy failed");   
    } 
}
