package modul02;
import java.util.Scanner;

/**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class LCelsius2FahrenheitWithMethods {
	
	public static void PrintConvertion(double C, double F) {
		System.out.printf("%.1f oC = %.1f oF\n", C, F);
	}

	public static void main(String[] args) {
		
		double C, F;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		//prompt the user and get the temperature i oC
		System.out.print("Enter a temperature i Celsius: ");
		C = in.nextDouble();
		
		// convert C to F
        F = (double)(9.0*C/5.0) + 32.0;
		PrintConvertion(C,F);

	}


}
