package modul06;

/*
 * Modul 6
 * Purpose: Java application to the class: AnimalsCode 
 * The application shows the use of Collections.binarysearch with
 * Comparator 
 */

import java.util.*;

public class LAnimalsCodeApp {

    public static void main(String[] args) {
        
        //Creates a List: Datastrukture: ArrayList
        List<AnimalsCode> l = new ArrayList<AnimalsCode>();

        //Fill the List l
        l.add(new AnimalsCode(1,"Hund"));
        l.add(new AnimalsCode(5,"Cat"));
        l.add(new AnimalsCode(7,"Mouse"));;
        l.add(new AnimalsCode(15,"Horse"));;
        l.add(new AnimalsCode(8,"Rooster"));

        Comparator<AnimalsCode> c = new Comparator<AnimalsCode>() {
            public int compare(AnimalsCode a, AnimalsCode b) {
                return a.getKod().compareTo(b.getKod());
            }
        };

        //Searching AnimalsCode with the kod value 15. To search 
        //we create an object of AnimalsCode with kod = 15; djur = null
        int index = Collections.binarySearch(l, new AnimalsCode(15,null), c);
        System.out.println("Found at index: " + index);
    }
    
}
