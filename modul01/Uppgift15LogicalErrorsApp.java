
package modul01;
/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Illustrate "Logical Errors"
     * (c) Luciano Triguero, june 2023 
     */

public class Uppgift15LogicalErrorsApp {

         /**
         * Starts the Java application
         * @param args command lines paramters
    */

    public static void main(String[] args) throws Exception {

        String msg = "Logical Error";
        while ( true ) {
                System.out.println("You typed: " +  msg);
        }  
    }  
}

