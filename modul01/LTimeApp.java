package modul01;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Material till uppgifter
     * (c) Luciano Triguero, 2023 
*/

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class LTimeApp {

	public static void main(String[] args) {

		Instant pstart = Instant.now();
		LocalTime tstart = LocalTime.now();
		
		
		int hour = tstart.getHour();
		int minutes = tstart.getMinute();
		int seconds = tstart.getSecond();
		
		System.out.println("Start time");
		System.out.println(tstart);
		System.out.print("Hour: " + hour);
		System.out.print(", Minutes: " + minutes);
		System.out.println(", Seconds: " + seconds);
		
		long SecondsFromMidnight = hour*3600 + minutes*60 + seconds;
		System.out.println("Seconds from midnight = " + SecondsFromMidnight);
		
		long TotalSecondsDay = 24*3600;
		System.out.println("Remaining seconds are = " + (TotalSecondsDay-SecondsFromMidnight));
		
		double ProcentPassed = ((1.0*SecondsFromMidnight)/(1.0*TotalSecondsDay))*100.0;
        System.out.println("  Procent passed = " + Math.round(ProcentPassed) );
        System.out.println("Procent remaining = " + Math.round(100.0-ProcentPassed));
        
		//Final
        System.out.println("Final execution's time");
        LocalTime tfinal = LocalTime.now();
		//LocalTime ElapsedTime = tfinal-tstart; 
		System.out.println(tfinal);

		//Elapsed time
		Instant pfinish = Instant.now();
		long timeElapsed = Duration.between(pstart, pfinish).toMillis();
		System.out.print("Execution time is [ms]: ");
		System.out.println(timeElapsed);
		
	}
}
