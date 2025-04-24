package modul02;

/*
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Rekursiva Metoder. Implement the Euclidian Algorithm.
     * (c) Luciano Triguero, june 2023 
     */

public class ExempelGCDApp {

    /**
         * Implement the Euclidean Algorithm;
         * @param double a, double b
    */
    public static int gcd(int a, int b) {
        if ( b==0 ) 
            return a;
        
            return gcd(b,a%b);
    }
    
    /**
         * Starts the Java application
         * @param args command lines paramters
    */
    public static void main(String[] args) throws Exception {

        //Exempel 1
        int a = 15;
        int b = 10;
        System.out.println("gcd("+ a + ", " + b + ") = " + gcd(a,b));
        
        //Exempel 2
        a = 135;
        b = 72;
        System.out.println("gcd("+ a + ", " + b + ") = " + gcd(a,b));

        //Exempel 3
        a = 24;
        b = 144;
        System.out.println("gcd("+ a + ", " + b + ") = " + gcd(a,b));



    }   

}
