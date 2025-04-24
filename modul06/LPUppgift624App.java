package modul06;

import java.util.*;

public class LPUppgift624App {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        TreeSet<Integer> leven = new TreeSet<Integer>();
        TreeSet<Integer> lodds = new TreeSet<Integer>();

        int a = 1; 
        int b = 100;
        for(int i=0; i<40; i++) {
            int gtal = a + rand.nextInt(b);
            if ( gtal%2 == 0 ) 
                leven.add(gtal);
            else
                lodds.add(gtal);
        }
        System.out.println(leven);
        System.out.println(lodds);

    }
}
