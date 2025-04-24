package modul04;

/*
    * Course: Javaprogrammering
    * Modul 4
    * Purpose: A simple program to illustrate the use of 2D-arrays
    * (c) Luciano Triguero, august 2023 
*/

public class ArrayUppgift422App {

    public static void main(String[] args) {
        
        //Skapar en tvådimentionell array av integer
        int rows = 10;
        int cols = 10;
        int[][] mtabell = new int[rows][cols];

        //Beräknar elementen till arrayen matbell 
        for (int m=0; m<rows; m++) {
            for (int n=0; n<cols; n++) {
                mtabell[m][n] = (m+1)*(n+1);
            }
        }

        //Skriver ut arrayen. (for loop)
        for (int m=0; m<rows; m++) {
            for (int n=0; n<cols; n++) {
                System.out.printf("%4d",mtabell[m][n]);
            }
            System.out.println();
        }

        //Skriver ut arrayen. (Enhanced for loop)
        System.out.println("Enhanced for Loop");
        for (int[] radm : mtabell ) {
            for (int koln : radm) {
                System.out.printf("%4d",koln);
            }
            System.out.println();
        }
    }
}
