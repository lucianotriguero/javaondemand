package modul05;

/**
     * Course: Javaprogrammering
     * Modul 5
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public interface MyIwithDefaultM {
    //A normal interface methods: abstract; traditional
    int getNumber();

    //A default-mehtod: Efter JDK8
    default String showMessage() {
        return "Det är en default-metod";
    }   
}
