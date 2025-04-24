package modul02;
import java.util.Scanner;

/**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class LSeconds2HMSWithMethods {
	
    public static int ReadTimeInSeconds() {
    	int TimeInSeconds;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		//prompt the user and get the temperature i oC
		System.out.print("Enter the total time i seconds: ");
		TimeInSeconds = in.nextInt();
    	return TimeInSeconds;
    }
	
	public static void PrintConvertion(int tIns, int h, int m, int s) {
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n",tIns,h,m,s);
	}
	

	public static void main(String[] args) {

		int TimeInSeconds;
		int hour, minutes, seconds;

		TimeInSeconds = ReadTimeInSeconds();

		// convert to hour:minutes:seconds
		hour = TimeInSeconds/3600;
		minutes = (TimeInSeconds%3600)/60;
		seconds = (TimeInSeconds%3600)%60;
		PrintConvertion(TimeInSeconds,hour,minutes,seconds);
		
	}
}
