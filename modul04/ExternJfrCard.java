package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.util.*;

public class ExternJfrCard implements Comparator<Card> {
     
    public int compare(Card a, Card b) {

        if (a.getRank() < b.getRank())
            return -1;
        else if (a.getRank() > b.getRank()) 
            return 1;
        else            
            return 0;
    }
}
