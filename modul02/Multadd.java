package modul02;

/**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Material till uppgifter
     * (c) Luciano Triguero, 2023 
     */

public class Multadd {
	
	public static double expSum(double x) {
		double a = 1.0;
		double b = x*Math.exp(-x);
		double c = Math.sqrt(1-Math.exp(-x));
		return multadd(a,b,c);
	}
	
	public static double multadd(double a, double b, double c) {
		return a*b+c;
	}
	
	
	public static void main(String[] args) {
		//Uppgift 3. Test method: multadd
		double uppgift_3 = multadd(1.0,2.0,3.0);
		System.out.printf("Method multadd gives = %.2f \n", uppgift_3);
		
		//Uppgift 4a
		double a = 1.0;
		double b = Math.sin(Math.PI/4);
		double c = Math.cos(Math.PI/4)/2;
		double uppgift_4a = multadd(a,b,c);
		System.out.printf("Method multadd gives = %.2f \n", uppgift_4a);
		
		//Uppgift 4b
		double uppgift_4b = multadd(1.0,Math.log(10),Math.log(20));
		System.out.printf("Method multadd gives = %.2f \n", uppgift_4b);
		
		//Uppgift 5
		double uppgift_5 = expSum(2.0);
		System.out.printf("Method multadd gives = %.2f \n", uppgift_5);

	}

}
