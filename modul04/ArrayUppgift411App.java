package modul04;

/*
    * Course: Javaprogrammering
    * Modul 4
    * Purpose: A simple program to illustrate the use of arrays
    * (c) Luciano Triguero, august 2023 
*/

public class ArrayUppgift411App {

     /**
         * Starts the Java application
         * @param args command lines paramters
    */

    public static void main(String[] args) {
        
        //Array d: En steg metoden
        double[] d = new double[4];
        
        //Array v: En steg metoden med "initial values"
        int[] v = {5,10,20,100,200,500};

        //Utskrivning: Indexering
        System.out.println("Array d:  " + "Index" +"\t" + "Värde");
        for (int i=0; i<4; i++) {
             System.out.println("          " +    i    + "\t" + d[i]);
        }
        System.out.println();
        System.out.println("Array v:  " + "Index" +"\t" + "Värde");
        for (int i=0; i<v.length; i++) {
             System.out.println("          " +    i    + "\t" + v[i]);
        }
    }
}
