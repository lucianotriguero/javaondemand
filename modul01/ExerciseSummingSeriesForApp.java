package modul01;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Calculate the serie 1/x^2.
     * (c) Luciano Triguero, june 2023 
     */

public class ExerciseSummingSeriesForApp {

    /**
         * Starts the Java application
         * @param args command lines paramters
    */
    
    public static void main (String[] args) {
        int N = 50000;
        double sum = 0.0;
        for (int m = 1; m<=N; m++) {
            sum = sum + 1.0/(m*m);
        }
        System.out.println("Results");
        System.out.println("Sum = "+sum);
    } //End Method: Main   
} //End Class ExerciseSummingSeries

