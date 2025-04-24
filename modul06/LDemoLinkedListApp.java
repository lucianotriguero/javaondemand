package modul06;

import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class LDemoLinkedListApp {

    public static void main(String[] args) {
        
         LinkedList<Integer> ll = new LinkedList<Integer>();
        Random rand = new Random();

        for(int i=0; i<20; i++) {
            int slump = 1 + rand.nextInt(99);
            ll.add(slump);
        }

        System.out.println("Länkade listan innan sortering");
        System.out.println(ll);       

        Collections.sort(ll);
        System.out.println("Länkade listan efter sortering");
        System.out.println(ll);  
        
        //Removing the first and the las elements
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Länkade listan efter removing the fisrt and last elements");
        System.out.println(ll);  

        //Using get and set methods
        Integer value = ll.get(2);
        ll.set(2,value + (1+rand.nextInt(9)));

        System.out.println("Länkade listan changing the element with index 2");
        System.out.println(ll);  
    } 
}
