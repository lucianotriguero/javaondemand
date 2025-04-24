package modul01;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Material till uppgifter
     * (c) Luciano Triguero, 2023 
*/

import java.util.Scanner;
import java.util.Random;

public class LGuessMyNumber {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		//
		System.out.print("I' am thinking of an integer number between 1 and 100");
		int luckyNumber = random.nextInt(101) + 1; 
		System.out.println("(including both). Can you guess what it is?");
		System.out.print("Type the number: ");
		int guessNumber = in.nextInt();
		System.out.printf("Your guess is: %d \n",guessNumber);
		System.out.printf("The number I was thinking of is: %d \n", luckyNumber);
		System.out.printf("You were off by: %d \n", Math.abs(guessNumber-luckyNumber) );
		
	}
}
