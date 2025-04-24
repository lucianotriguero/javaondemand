package modul05;

/**
     * Course: Javaprogrammering
     * Modul 5
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

//Subklass: Dinamic Method Dispatch
public class B extends A {
    @Override
    void callme() {
        System.out.println("Inside subklassen B's callme() metoden");
    }
}
