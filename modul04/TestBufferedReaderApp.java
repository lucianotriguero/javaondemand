package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReaderApp {

    public static double[] stringDecode(String s) {
        //Decode String s to get numerical values of type double
        double[] talpar = new double[2];
        s = s.trim();
        int indexlastp = s.indexOf(")");
        int indexkomma = s.indexOf(",");
        String sx = s.substring(1,indexkomma);
        String sy = s.substring(indexkomma+1,indexlastp);
        talpar[0] = Double.parseDouble(sx);
        talpar[1] = Double.parseDouble(sy);
        return talpar;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mata in tre punkter");
        System.out.println("OBS! Inmantingen bör anges med skrivningssättet: (x,y), t.ex. (3.14, 2.15)");
        System.out.println("x: punktens x-koordinat; y: punktens y-koordinat");
        System.out.print("Punkten => ");
        String s = input.readLine();
        System.out.println("Koordinaterna är: " + s );
        double[] xy = stringDecode(s);
        System.out.println("x = " + xy[0]);
        System.out.println("y = " + xy[1]);

        /* 
        for (int i=0; i<3; i++) {
            int j = i+1;
            System.out.print("Punkten " + j + " => ");
            String s = input.readLine();
            System.out.println("Koordinaterna är: " + s );
        }
        */
    }
    
}
