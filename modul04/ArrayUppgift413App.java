package modul04;
import java.util.Arrays;
import java.util.Random;
/*
    * Course: Javaprogrammering
    * Modul 4
    * Purpose: A simple program to illustrate the use of arrays
    * (c) Luciano Triguero, august 2023 
*/
public class ArrayUppgift413App {
    /**
         * Starts the Java application
         * @param args command lines paramters
    */
    public static void main(String[] args) {

        int[] a = new int[100];
        Random random = new Random();
        for (int i=0; i<a.length; i++) {
            a[i] = 1 + random.nextInt(98);
        }
        
        System.out.println();
        System.out.println("Uppgift a)");
        System.out.print("a = {" + a[0]);
        for (int i = 1; i<a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.print("}");

        int[] b = new int[20];
        for (int i = 10; i<15; i++) {
            b[i] = a[i+40];
        }

        System.out.println();
        System.out.print("b = {" + b[0]);
        for (int i = 1; i<b.length; i++) {
            System.out.print(", " + b[i]);
        }
        System.out.print("}");

        System.out.println();
        if (Arrays.equals(a,50,54,b,10,14) == true) 
            System.out.println("The copy was done correctly");
        else
            System.out.println("The copy failed");   

        //b) Standardmetoden arraycopy()
        System.arraycopy(a,95, b, 5, 5);

        System.out.println();
        System.out.println("Uppgift b)");
        System.out.print("b = {" + b[0]);
        for (int i = 1; i<b.length; i++) {
            System.out.print(", " + b[i]);
        }
        System.out.print("}");

        System.out.println();
        if (Arrays.equals(a,95,99,b,5,9) == true) 
            System.out.println("The copy was done correctly");
        else
            System.out.println("The copy failed");   
    } 

}
