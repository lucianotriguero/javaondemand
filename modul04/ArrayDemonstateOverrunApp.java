package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ArrayDemonstateOverrunApp {

    public static void main(String[] args) {
        
        int sample[] = new int[10];
        
        //Generate an array overrun
        for (int i=0; i<100; i++) {
            sample[i] = i;
        }
    }
    
}
