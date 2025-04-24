package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */


public class ArrayUppgift424App {

    public static int[][] calcMtabell(int rows, int cols) {
        //Beräknar elementen till arrayen mtabell 
        int[][] array = new int[rows][cols];
        for (int m=0; m<rows; m++) {
            for (int n=0; n<cols; n++) {
                array[m][n] = (m+1)*(n+1);
            }
        }
        return array;
    }

    public static void print2Darray(int[][] array) {
        //Skriver ut arrayen. (for loop)
        for (int m=0; m<array.length; m++) {
            for (int n=0; n<array[m].length; n++) {
                System.out.printf("%4d",array[m][n]);
            }
            System.out.println();
        }
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

    public static void main(String[] args) {
        
        //Skapar en tvådimentionell array av integer
        int rows = 10;
        int cols = 10;
        int[][] mtabell = new int[rows][cols];
        mtabell = calcMtabell(rows,cols);
        print2Darray(mtabell);
        print2DarrayEforLoop(mtabell);
    } 
}
