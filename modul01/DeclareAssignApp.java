package modul01;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, june 2023 
*/

public class DeclareAssignApp {

    /**
         * Starts the Java application
         * @param args command lines paramters
    */

    public static void main(String[] args) {
        String message;
        //int x;

        //String firstName;
        //String lastName;
        //int hour, minute;

        message = "Hello!";  // give message the value "Hello!"
        //hour = 11;           // assign the value 11 to hour
        //minute = 59;         // set minute to 59

        message = "123";     // legal
        // message = 123;    // not legal

        String message2 = "Hello!";
        //int hour2 = 11;
        //int minute2 = 59;
        
        System.out.println(message);
        System.out.println(message2);
    }
}
