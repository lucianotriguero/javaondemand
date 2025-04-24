package modul06;

import java.util.ArrayList;
import java.util.Collections;

public class LMetodStatistikApp {
    
    static double means(ArrayList<Double> ld) {
        
        double sum = 0.0;
        for ( Double elementi : ld ) {
            sum = sum + elementi;
        }
        return (sum/ld.size());
    }

    static Double mode(ArrayList<Double> ld) {

        ArrayList<Integer> f = new ArrayList<Integer>();
        for ( Double elementi : ld ) {
            f.add(Collections.frequency(ld,elementi));
        }
        return ld.get(f.indexOf(Collections.max(f)));
    }

    static Double median(ArrayList<Double> ld) {

        ArrayList<Double> ldsort = new ArrayList<Double>();
        for ( Double elementi : ld ) {
            ldsort.add(elementi);
        }
        Collections.sort(ldsort);
        if ( ldsort.size()%2 == 0 ) {
            int mid = (int) ldsort.size()/2; 
            return ((ldsort.get(mid-1)+ldsort.get(mid))/2);
        }
        else {
            int mid = (int) ldsort.size()/2 + 1; 
            return (ldsort.get(mid));
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Double> data = new ArrayList<Double>();
        data.add(7.0);
        data.add(9.0);
        data.add(12.0);
        data.add(5.0);
        data.add(4.0);
        data.add(23.0);
        data.add(15.0);
        data.add(8.0);
        data.add(6.0);
        data.add(7.0);
        System.out.println("The means is: " +means(data));
        System.out.println("Median Working: " +median(data));
        System.out.println("The mode is: " +mode(data));
        Collections.sort(data);
        System.out.println(data.size());
        System.out.println(data);
    }
}
