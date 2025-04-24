package modul06;


import java.util.ArrayList;
import java.util.Collections;

public class LDemoArrayListApp {

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();
        
        System.out.println("Initial size of al: " +al.size() );

        //Add elements to the array list
        al.add("Lasse");
        al.add("Freja");
        al.add("Luciano");
        al.add("Maria");
        al.add("Steffan");
        al.add("Anna");

        System.out.println("Size of al after additions: " +al.size() );
        System.out.println("The elements of al are: " +al );

        //Remove two elements
        al.remove(5);
        al.remove("Luciano");

        System.out.println("Size of al after delections: " +al.size() );
        System.out.println("The elements of al are: " +al );

       Collections.sort(al);
       System.out.println("The elements after sorting al are: " +al );

    }
}
