package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ArrayUppgift423App {

    public static void main(String[] args) {

        //Skapar en tvådimentionell array av integer med olika långa rader
        int rows = 10;
        int[][] mtabell = new int[rows][];

        //Beräknar elementen till arrayen matbell 
        for (int m=0; m<mtabell.length; m++) {
            mtabell[m] = new int[m+1];
            for (int n=0; n<mtabell[m].length; n++) {
                mtabell[m][n] = (m+1)*(n+1);
            }
        }

        //Skriver ut arrayen. (Enhanced for loop)
        for (int[] radm : mtabell ) {
            for (int koln : radm) {
                System.out.printf("%4d",koln);
            }
            System.out.println();
        }
    }
}
