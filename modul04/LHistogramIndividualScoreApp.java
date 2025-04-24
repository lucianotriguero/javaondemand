package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.util.Random;

public class LHistogramIndividualScoreApp {

    public static int[] randomArray(int size, int low, int high) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i=0; i<a.length; i++) {
            a[i] = low + random.nextInt(high-low + 1);
        }
        return a;
    }


    public static int[] HistogramByElements(int[] a) {
        int[] counts = new int[a.length];
        for (int elementi : a) {
            counts[elementi]++;
        }
        return counts;
    }

    public static void main(String[] args) {

        int low = 1;
        int high = 52;
        int simsize = 10000;
        int[] scores = randomArray(simsize,low,high);
        int[] counts = HistogramByElements(scores);
        
        for(int i = 0; i<counts.length; i++) {
            if (counts[i] != 0) 
               System.out.println("i = " +i + "  counts[i] = " + counts[i] + " probabily = " +(1.0*counts[i])/counts.length);
        }
    }  
}
