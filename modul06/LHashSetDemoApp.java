package modul06;


import java.util.*;

public class LHashSetDemoApp {

    public static void main(String[] args) {

        Random rand = new Random();

           HashSet<Integer> h = new HashSet<Integer>();
           TreeSet<Integer> t = new TreeSet<Integer>();
        LinkedList<Integer> l = new LinkedList<Integer>();

        for(int i=0; i<20; i++) {
            Integer slump = 1 + rand.nextInt(99);
            h.add(slump);
            t.add(slump);
            l.add(slump);
        }
        
        System.out.println();
        System.out.print("HashSet: ");
        System.out.println(h);
        System.out.print("TreeSet: ");
        System.out.println(t);
        System.out.print("LinkedList: ");  
        Collections.sort(l);
        System.out.println(l); 
        System.out.println();       
    }
}
