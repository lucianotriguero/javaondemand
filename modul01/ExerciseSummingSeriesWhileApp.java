package modul01;

/**
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Calculate the serie 1/x^2 with a while-loop
     * (c) Luciano Triguero, june 2023 
 */

public class ExerciseSummingSeriesWhileApp {
    
    public static void main (String[] args) {

        double epsilon = 1.0E-8;
        double sum = 0.0;
        double addterm = 0.0;
        int m = 0;
        do {
            m = m +1;
            addterm = 1.0/(m*m);
            sum = sum + addterm;
        } while ( addterm > epsilon ); 
        
        System.out.println("Results");
        System.out.println("m = "+m);
        System.out.println("Epsilon = "+epsilon);
        System.out.println("Addterm = "+addterm);
        System.out.println("Sum = "+sum);

    } //End Method: Main   
} //End Class ExerciseSummingSeries 
