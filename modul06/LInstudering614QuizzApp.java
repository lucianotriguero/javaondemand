package modul06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class LInstudering614QuizzApp {

    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>(); 

        for(int i=0; i<200; i++) {
            Random rand = new Random();
            int x = 1 + rand.nextInt(20);
            v.add(x); al.add(x);
        }

        System.out.println(Collections.frequency(v, 10));
        System.out.println(Collections.frequency(al, 10)); 
    }
}
