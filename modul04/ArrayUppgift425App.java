package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.util.Random;

public class ArrayUppgift425App {

    public static int[][] genArray(int rows, int cols, int low, int high) {
        Random random = new Random();
        int[][] array = new int[rows][cols];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                array[i][j] = low + random.nextInt(high-low);
            }
        }
        return array;
    }

    public static void print2DarrayEforLoop(int[][] array) {
        //Skriver ut arrayen. (Enhanced for loop)
        System.out.println("Enhanced for Loop");
        for (int[] radm : array ) {
            for (int koln : radm) {
                System.out.printf("%4d",koln);
            }
            System.out.println();
        }
    }

    // getting the maximum value of an 1D-array
    public static int getMaxValue(int[] array) {
    int maxValue = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > maxValue) {
            maxValue = array[i];
        }
    }
    return maxValue;
    }

    public static int maxSumKol(int[][] array) {
        int[] sum = new int[array.length];
        for (int j=0; j<array.length; j++) {
            sum[j] = 0;
            for (int i=0; i<array.length; i++) {
                sum[j] = sum[j] + array[i][j]; 
            }
        }
        return(getMaxValue(sum));
    }

    public static void main(String[] args) {
        //Skapar en tvådimentionell array av integer
        int rows = 3;
        int cols = 3;
        int[][] a = genArray(rows,cols,0,9);
        //Skriver ut arrayen
        print2DarrayEforLoop(a);
        System.out.println("Maximum value is: " +maxSumKol(a));
    }
}
