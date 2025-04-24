package modul01;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Material till lectures
     * (c) Luciano Triguero, 2023 
*/

import java.util.Random;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }

}
