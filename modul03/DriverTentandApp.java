package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class DriverTentandApp {

    public static void main(String[] args) {
        Tentand A = new Tentand("Luciano", "Triguero", "JAVA23", "Programmering 1", "G");
        Tentand B = new Tentand();

        System.out.println(A.toString());
        System.out.println(B.toString());

        B = new Tentand(A);
        B.setTentamensAnmne("Programmering 2");
        B.setBetyg("IG");

        System.out.println(B.toString());

        //Test getters
        System.out.println(B.getEfternamn()+","+B.getNamn() + ": Examineras i: " + B.getTentamensamne());
    }
}
