package modul02;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Metoder med flera parametrar.
     * (c) Luciano Triguero, june 2023 
     */

public class FunctionGxyApp {

    /**
         * Calculates g(x,y) = 2x+4y+3;
         * @param double x, double y
    */
    public static double gXY(double x, double y) {
        return (2*x + 4*y + 3);
    }

    /**
         * Starts the Java application
         * @param args command lines paramters
    */
    public static void main(String[] args) throws Exception {

        double z = gXY(3,4);
        System.out.println("Funktionsvärdet g(3,4) = " + z);
    }   
}

