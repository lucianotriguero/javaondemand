package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.util.Arrays;
import java.util.Random;

public class ArrayUniqueRandomApp {

    public static int[] uniqueRandomList(int size, int low, int high) {
        Random random = new Random();
        int[] a = new int[size];
        int i = 0;
        while ( true ) {
            if (i == a.length) break;
            int b = low + random.nextInt(high-low);
            if (g(a,b) < 0) {
                a[i] = b;
                i++;
            } 
        }
        return a;
    }

    public static int g(int[] A, int sokTal) {
        int[] B = Arrays.copyOf(A,A.length);
        Arrays.sort(B);
        int k = Arrays.binarySearch(B,sokTal);
        return k;
    }

    public static int[] uniqueRandomArray(int n){
        int[] A = new int[n];
        for(int i = 0; i< A.length; ){
            if(i == A.length){
                break;
            }
            int b = (int)(Math.random() *n) + 1;
            if(f(A,b) == false){
                A[i++] = b;
            } 
        }
        return A;
    }

    public static boolean f(int[] A, int n){
        for(int i=0; i<A.length; i++){
            if(A[i] == n){
                return true;
            }
        }
        return false;
    }

    

    public static void main(String[] args) {
            
        int n = 20;
        int A[] = uniqueRandomList(n,1,99);
        for(int i = 0; i<A.length; i++){
            System.out.print("  " +A[i]);
        }
        System.out.println();
    }
}
