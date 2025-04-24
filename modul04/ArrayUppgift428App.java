package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUppgift428App {

    public static int guessNumber(Scanner in, int low, int high) {

        System.out.println();
        System.out.println("Guess a number between " + low + " and " + high +" including both.");
        System.out.print("What is you guess?  => ");
        int guess = Integer.parseInt(in.nextLine());
        return guess;
    }


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        int a[] = {31, 56, 11, 57, 26, 82, 41, 83, 59, 96, 
                   67, 64, 54, 37, 52, 36, 48, 62, 45, 56};
                
        Arrays.sort(a);
        int low = 1;
        int high = 99;
        while ( true ) {
            int key = guessNumber(in,low,high);
            int k = Arrays.binarySearch(a, key);
            if ( k >= 0 ) {
                System.out.println("Talet finns i arrayen");
                break;
            }      
            else {
                System.out.println();
                System.out.print("Talet fanns inte i arrayen, försök med ett nytt tal");
            }
        }           
    }
}
