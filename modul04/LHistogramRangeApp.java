package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.util.Random;

public class LHistogramRangeApp {

    public static int[] randomArray(int size, int low, int high) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i=0; i<a.length; i++) {
            a[i] = low + random.nextInt(high-low + 1);
        }
        return a;
    }

    public static int inRange(int[] a, int lowklass, int highklass) {
        int count = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] >= lowklass && a[i] < highklass) {
                count++;
            }
        }
        return count;
    }

    public static int antalMax(int[] a, int max) {
        int count = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] == max) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] scores = randomArray(100,0,100);
        int klass060 = inRange(scores,0,60);
        int klass6070 = inRange(scores,60,70);
        int klass7080 = inRange(scores,70,80);
        int klass8090 = inRange(scores,80,90);
        int klass90100 = inRange(scores,90,100) + antalMax(scores,100);

        System.out.println("  [0 60): " +klass060);
        System.out.println(" [60 70): " +klass6070);
        System.out.println(" [70 80): " +klass7080);
        System.out.println(" [80 90): " +klass8090);
        System.out.println("[90 100]: " +klass90100);
        System.out.print("Antal 100: " +antalMax(scores,100));


    }  
}
