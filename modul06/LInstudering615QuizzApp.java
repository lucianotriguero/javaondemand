package modul06;

import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class LInstudering615QuizzApp {

    public static void main(String[] args) {
        

        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(7);
        s.push(2);
        s.push(9);
        s.push(10);

        System.out.println(s);
        s.pop();
        System.out.println(s);

        ArrayDeque<Integer> q1 = new ArrayDeque<>();
        q1.add(3);
        q1.add(7);
        q1.add(2);
        q1.add(9);
        q1.add(10);

        System.out.println();
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        
        ArrayList<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(7);
        l.add(2);
        l.add(9);
        l.add(10);

        System.out.println();
        System.out.println(l);
        l.add(3,8);
        System.out.println(l);

        
    }
    
}
