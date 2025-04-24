package modul02;
/*
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Rekursiva Metoder. Implement n-factorial.
     * (c) Luciano Triguero, june 2023 
    */

    import java.util.InputMismatchException;
import java.util.Scanner;

public class ExempelFactorialTryCatchApp {

       /**
         * Implement the n-factorial;
         * @param int n
    */
    public static long nfactorial(int n) {

        if ( n==0 ) 
            return 1;
        
            return n*nfactorial(n-1);
    }
    
    /**
         * Starts the Java application
         * @param args command lines paramters
    */
    public static void main(String[] args) throws Exception {

        boolean tryigen = true;
        Scanner in = new Scanner(System.in);
        //Prompt the user for a positiv integer 
        int n = 0;   //Default value
        while ( tryigen ) {
            try {
                System.out.print("Mata in ett positivt heltal = ");
                n = in.nextInt();
                if ( n > 0 ) {
                    System.out.println(+ n + "!" + "=" + nfactorial(n));
                    tryigen = false; //det gick bra
                } else {
                    System.out.println("Felaktig inmatning: n måste vara ett positivt heltal");
                    System.out.println("Försök igen!");
                }
            }
            catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Felaktig inmatning: n är inte ett heltal");
                System.out.println("Kör om igen!");
            }    
        }
        in.close();
    }   
}
