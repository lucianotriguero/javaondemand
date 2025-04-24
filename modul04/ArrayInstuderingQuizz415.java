package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ArrayInstuderingQuizz415 {

    public static void main(String[] args) {
        
        String s1 = new String("Java är roligt");
        String s2 = new String("Java är roligt");

        //Fall a)
        if ( s2 == s1 ) {
              System.out.println("Fall a)");      
        } 

        //Fall b)
        if ( s2.equals(s1) ) {
            System.out.println("Fall b)");
        }
    }
}

