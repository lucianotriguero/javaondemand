package modul06;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LMailingListApp {

    public static String getName() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name? ");
        String askedname = scan.nextLine();
        scan.close();
        return askedname;
    }

    public static void main(String[] args) throws IOException {
        
        LinkedList<Person> mlist = new LinkedList<Person>();

        mlist.add(new Person("Luciano","Triguero","luciano.triguero@sti.se"));
        mlist.add(new Person("Elin","Wisbrant","elin.wisbrant@sti.se"));
        mlist.add(new Person("Fabian","Petren","fabian.petren@sti.se"));
        mlist.add(new Person("Anna-Karin","Härd","anna-karin.hard@sti.se"));
        mlist.add(new Person("Daniel","Svenberg","daniel.svenberg@sti.se"));
        
        mlist.add(new Person("Daniel","Svensson","daniel.svensson@sti.se"));

        Collections.sort(mlist);
        String searchname = getName(); 
        System.out.println("Sökning för: " + searchname +" ger: ");
        int index = Collections.binarySearch(mlist, new Person(searchname,null,null));
        if ( index >= 0 ) {
           System.out.print(mlist.get(index));
        }
        else {
           System.out.print("Personen finns inte i listan");
        }

    
        /* //Skriver databasen ut till konsolen
        System.out.println();
        for ( Person elementi : mlist ) {
            System.out.print(elementi);
        } */

        /* //Sorting with compareTo. Alfabetisk ordning (namn)
        Collections.sort(mlist);
        System.out.println();
        System.out.println("Alfabetisk ordning (namn)");
        for ( Person elementi : mlist ) {
            System.out.print(elementi);
        } */


        /* //Sorting with an extern comparator. Alfabetisk ordning (efternamn)
        Collections.sort(mlist,new ExtJfrPerson());
        System.out.println();
        System.out.println("Alfabetisk ordning (Efternamn)");
        for ( Person elementi : mlist ) {
            System.out.print(elementi);
        } */
    }
}
