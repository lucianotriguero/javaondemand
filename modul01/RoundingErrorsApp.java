package modul01;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
*/

public class RoundingErrorsApp {

	public static void main(String[] args) {
		
		double x = 0.1*10;
		System.out.println(x);
		double y = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println(y);
		double error = Math.abs(y-x);
		System.out.println(error);
		
	}
}
