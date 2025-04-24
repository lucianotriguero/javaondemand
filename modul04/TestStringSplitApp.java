package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class TestStringSplitApp {

    public static void main(String[] args) {
        
        //String rad = "2012 1 1 0.0 -0.7 -0.7 1";
        //String rad = "2012 1 5 -0.3 -1.0 -1.0 1";
        //String rad = "2012  2  9    -7.6    -8.4    -8.4 1";
        String rad = "2012  3  4    -1.5    -2.4    -2.4 1";
        String[] parts = rad.split("\s+",7);
        System.out.println("Parts 0: " + parts[0]);
        System.out.println("Parts 1: " + parts[1]);
        System.out.println("Parts 2: " + parts[2]);
        System.out.println("Parts 3: " + parts[3]);
        System.out.println("Parts 4: " + parts[4]);
        System.out.println("Parts 5: " + parts[5]);
        System.out.println("Parts 6: " + parts[6]);
    }
    
}
