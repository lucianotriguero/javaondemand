package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ArrayExempelOlikaLangaRaderApp {

    public static void main(String[] args) {
        
        int[][] a = {{0},{2,0},{4,7,0},{8,9,1,0}};
        System.out.println("rad 0: " + a[0].length);
        System.out.println("rad 1: " + a[1].length);
        System.out.println("rad 2: " + a[2].length);
        System.out.println("rad 3: " + a[3].length);

        System.out.println();

        String[][] modell = {{"blå","gul"},
                             {"röd","vit","blå"},
                             {"röd","gul"},
                             {"grön","svart","vit"}};
        System.out.println("rad 0: " + modell[0].length);
        System.out.println("rad 1: " + modell[1].length);
        System.out.println("rad 2: " + modell[2].length);
        System.out.println("rad 3: " + modell[3].length);
    }
}
