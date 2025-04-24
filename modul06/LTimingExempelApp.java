package modul06;

/*
 *  Modul 6
 *  Material till lektioner
 *  Purpose: The program compares the efficiency between the algortihms selectionsort  
 *  and quicksort by timing algorithm execution
 *  (c) Adapted by Luciano Triguero, 2023 
 */

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class LTimingExempelApp {
    final static int ARRAY_SIZE = 500000; 

    //Source: Geeksforgeeks.org
    public static void selectionsort(int arr[])
    {
        int n = arr.length;
  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
  
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] data = new int[ARRAY_SIZE];
        Random rand = new Random();
        for (int i=0; i<data.length; i++) {
            data[i] = 1 + rand.nextInt(999999);
        }
        
        //Start timing: Quicksort
        //Algortihm: Dual-Pivot Quicksort: Performance O(n*log(n))
        int[] datatoquicksort = Arrays.copyOf(data, ARRAY_SIZE);
		Instant startquicksort = Instant.now();
        Arrays.sort(datatoquicksort);
		//End timing
		Instant finishquicksort = Instant.now();
        //Elapsed time = Execution time (Performance)
		long performancequicksort = Duration.between(startquicksort, 
                                    finishquicksort).toMillis();
		System.out.print("Execution time with quicksort is [ms]: ");
		System.out.println(performancequicksort);
 
        //Start timing: Selectionsort
        //Selection sort: Performance O(n^2/2)
        int[] datatoselectionsort = Arrays.copyOf(data, ARRAY_SIZE);
		Instant startselectionsort = Instant.now();
        selectionsort(datatoselectionsort);
		//End timing
		Instant finishselectionsort = Instant.now();
        //Elapsed time = Execution time (Performance)
		long performanceselectionsort = Duration.between(startselectionsort, 
                                        finishselectionsort).toMillis();
		System.out.print("Execution time with selectionsort is [ms]: ");
		System.out.println(performanceselectionsort);
	}
}
