package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ArrayOverrunApp {

    public static void main(String[] args) {

        int[] sample = new int[10];

        for(int i=0; i<100; i++) {
            sample[i] = i*i;
        }
    }   
}
