package modul01;
/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Illustrate Run-time Error: Division by zero
     * (c) Luciano Triguero, june 2023 
     */

public class Uppgift14DivisionByZeroApp {
    
           /**
         * Starts the Java application
         * @param args command lines paramters
    */

    public static void main(String[] args) throws Exception {

        double sum = 0;
        int i = -2;
        while ( i < 5 ) {
            sum += 1.0/i;
            i += i;
        }
        
        System.out.printf("Summa är: %.1f \n", sum);
      
    }


}
