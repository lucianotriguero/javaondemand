package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class Instudering315Quizz {

    boolean WhatDoIDo(int x) {
        if ( x%2 == 0 )  return true;
        else return false;
    }
}

class TestClass {

    public static void main(String[] args) {

        Instudering315Quizz t = new Instudering315Quizz();
        for (int x = 1; x<11; x++ ) {
            if ( t.WhatDoIDo(x) ) System.out.println("Talet " + x + " är: _______");
        }
    }
}
