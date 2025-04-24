package modul01;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Material till lectures
     * (c) Luciano Triguero, 2023 
*/

import java.util.Scanner;

public class LCelsius2Fahrenheit {

	public static void main(String[] args) {
		
		double C, F;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		//prompt the user and get the temperature i oC
		System.out.print("Enter a temperature i Celsius: ");
		C = in.nextDouble();
		
		// convert C to F
        F = (double)(9.0*C/5.0) + 32.0;
		System.out.printf("%.1f oC = %.1f oF\n", C, F);

	}


}
