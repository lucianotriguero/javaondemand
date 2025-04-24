package modul06;

import java.util.ArrayList;

public class LVectorerUppgifterApp {

    public static Double Norm(ArrayList<Double> v) {

        Double sum = 0.0;
        for (Double elementi : v) {
            sum = sum + elementi*elementi;
        }
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        
        ArrayList<Double> v = new ArrayList<Double>();
        v.add(1.0);
        v.add(1.0);
        v.add(1.0);

        System.out.println(Norm(v));

    }
    
}
