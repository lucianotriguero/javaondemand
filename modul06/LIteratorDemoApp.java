package modul06;

import java.util.*;

public class LIteratorDemoApp {  

    public static void main(String[] args) {
        
        //Collection: ArrayList
        ArrayList<String> l = new ArrayList<String>();

        //Add elements to the collection
        l.add("C");
        l.add("A");
        l.add("E");
        l.add("B");
        l.add("D");
        l.add("F");

        //Use iteratior to display contents of l
        System.out.print("Original contents of l: ");
        //Steg 1)
        ListIterator<String> itr = l.listIterator();

        //Steg 2 (while-loop)
        while ( itr.hasNext() ) {
            //Steg 3
            String elementi = itr.next();
            System.out.print(elementi + " ");
        }
        System.out.println();

        //Modify object with listiterator
        itr = l.listIterator();
        while ( itr.hasNext() ) {
            //Steg 3
            String elementi = itr.next();
            itr.set(elementi + "*");
        }

        //Display the modified elements
        System.out.print("Modified contents of l: ");
        itr = l.listIterator();
        while ( itr.hasNext() ) {
            //Steg 3
            String elementi = itr.next();
            System.out.print(elementi + " ");
        }
        System.out.println();

        //Display the modified elements backwards
        System.out.print("Modified contents of l backwards: ");
        while ( itr.hasPrevious() ) {
            //Steg 3
            String elementi = itr.previous();
            System.out.print(elementi + " ");
        }
        System.out.println();        
    }
}
