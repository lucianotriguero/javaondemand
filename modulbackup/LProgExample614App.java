package modulbackup;

import java.util.*;
import java.util.Map.Entry;
import java.awt.Point;

public class LProgExample614App {

    public static void main(String[] args) {
        
        ArrayList<Point> pk1 = new ArrayList<Point>();
        ArrayList<Point> pk2 = new ArrayList<Point>();
        ArrayList<Point> pk3 = new ArrayList<Point>();
        ArrayList<Point> pk4 = new ArrayList<Point>();
        
        //Add points to the lists
        pk1.add(new Point(2,3));
        pk1.add(new Point(7,6));
        
        pk2.add(new Point(-7,6));
        pk2.add(new Point(-3,5));

        pk3.add(new Point(-5,-5));
        pk3.add(new Point(-4,-6));

        pk4.add(new Point(4,-5));
        pk4.add(new Point(2,-7));

        TreeMap<String,ArrayList<Point>> table = new TreeMap<String,ArrayList<Point>>();
        table.put("I",pk1);
        table.put("II",pk2);
        table.put("III",pk3);
        table.put("IV",pk4);

        Set<Entry<String, ArrayList<Point>>> s = table.entrySet();  
        for ( Entry<String, ArrayList<Point>> elementf : s ) {
            System.out.println(elementf.getKey() + "  " + elementf.getValue());
            //System.out.format("%20s\t%10.2f\n",elementf.getKey(),elementf.getValue());
        }

        //System.out.println(table);






    }
    
}
