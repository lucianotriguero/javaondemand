package modul01;
/*
 * Course: Javaprogrammering
 * Modul 1
 * Purpose: Solution to the exercise with ISBN 
 * (c) Luciano Triguero, june 2023 
 */

import java.util.Scanner;

public class Solution210IsbnApp {

    /**
         * Starts the Java application
         * @param args command lines paramters
    */

    public static void main(String[] args) throws Exception {

       String IsbnString;

       try (Scanner in = new Scanner(System.in)) {
           //Prompt the user for the radie the ISBN
           System.out.print("Mata in ISBN: ");
           IsbnString = in.nextLine();
        }  
        System.out.println(IsbnString);
        //Decode the ISBN 
        //int language; publisher; int booknr; int checknumber;

        char hyphen = '-';
        int firsthyphen = IsbnString.indexOf(hyphen);
        int secondhyphen = IsbnString.indexOf(hyphen,firsthyphen+1);
        int thirdhyphen = IsbnString.indexOf(hyphen,secondhyphen+1);
        int fourthhyphen = IsbnString.indexOf(hyphen,thirdhyphen+1);

        System.out.println(IsbnString.substring(0,firsthyphen));
        System.out.println(IsbnString.substring(firsthyphen+1,secondhyphen));
        System.out.println(IsbnString.substring(secondhyphen+1,thirdhyphen));
        System.out.println(IsbnString.substring(thirdhyphen+1,fourthhyphen));
        System.out.println(IsbnString.substring(fourthhyphen+1,IsbnString.length()));

    }
}
