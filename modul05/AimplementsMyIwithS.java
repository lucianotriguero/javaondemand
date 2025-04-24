package modul05;

/**
     * Course: Javaprogrammering
     * Modul 5
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.util.Random;

public class AimplementsMyIwithS implements MyIwithStaticM {

    //OBS! Endast metoden getNumber kräver en implementering
    @Override
    public int getNumber() {
        Random rand = new Random();
        int luckynr = 1+rand.nextInt(36);
        return luckynr;
    } 
}
