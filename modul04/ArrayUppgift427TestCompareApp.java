package modul04;

import java.util.Arrays;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ArrayUppgift427TestCompareApp {

    public static void main(String[] args) {
        
        Produkt[] listaProdukts = new Produkt[8];
        //Inititiering
        listaProdukts[0] = new Produkt(3457,"TRONES","H1F4");
        listaProdukts[1] = new Produkt(1234,"EKRAR","H2F1");
        listaProdukts[2] = new Produkt(1053,"GREJIG","H3F6");
        listaProdukts[3] = new Produkt(6789,"NISSEDAL","H1F5");
        listaProdukts[4] = new Produkt(4090,"BAGGMUGG","H2F7");
        listaProdukts[5] = new Produkt(5790,"LACK","H5F1");
        listaProdukts[6] = new Produkt(3892,"SPIKSMED","H10F2");
        listaProdukts[7] = new Produkt(1721,"BESTÅ","H25F15");


        System.out.println(listaProdukts[0].compareTo(listaProdukts[1]));
        System.out.println(listaProdukts[1].compareTo(listaProdukts[0]));

        System.out.println("Produktens lista innan sortering");
        for (int i=0; i<listaProdukts.length; i++) {
            System.out.println(listaProdukts[i].toString());
        }

        System.out.println();
        Arrays.sort(listaProdukts);
        System.out.println("Produktens lista efter sortering");
        for (int i=0; i<listaProdukts.length; i++) {
            System.out.println(listaProdukts[i].toString());
        }  
    } 
}
