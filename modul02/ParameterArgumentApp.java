package modul02;
/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Paramenter and arguments.
     * (c) Luciano Triguero, june 2023 
     */

public class ParameterArgumentApp {

    /**
         * Calculates g(x,y) = 2x+4y+3;
         * @param double x, double y
    */
    public static double favX (double x) {
        double y = 2*x+3;
        return y;
    }

    /**
         * Starts the Java application
         * @param args command lines paramters
    */
    public static void main(String[] args) throws Exception {

        double y = favX(3);
        System.out.println("Funktionsvärdet f(3) = " + y);
    }
}
