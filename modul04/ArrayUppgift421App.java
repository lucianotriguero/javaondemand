package modul04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ArrayUppgift421App {

    //Uppgift b)
    public static Punkt2D stringDecode(String s) {
        //Decode String s to get numerical values of type double
        s = s.trim();
        int indexlastp = s.indexOf(")");
        int indexkomma = s.indexOf(",");
        String sx = s.substring(1,indexkomma);
        String sy = s.substring(indexkomma+1,indexlastp);
        Punkt2D p = new Punkt2D();
        p.x = Double.parseDouble(sx);
        p.y = Double.parseDouble(sy);
        return p;
    }

    public static Punkt2D[] readPoints(int antal) throws IOException{
        Punkt2D[] vertices = new Punkt2D[antal];
        //Initialize all points to defaultvalues (0,0)
        for (int i=0; i<vertices.length; i++) {
            vertices[i] = new Punkt2D();    
        }
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mata in tre punkter");
        System.out.println("OBS! Inmantingen bör anges med skrivningssättet: (x, y), t.ex. (3.14, 2.45)");
        for (int i=0; i<antal; i++) {
            int j = i+1;
            System.out.print("Punkten " + j + " => ");
            String s = input.readLine();
            vertices[i] = stringDecode(s);
        }
        return vertices;
    }

    //Uppgift c)
    public static boolean isAtriangel(Punkt2D[] v) {
        double dAB = Punkt2D.distance(v[0],v[1]);
        double dAC = Punkt2D.distance(v[0],v[2]);
        double dBC = Punkt2D.distance(v[1],v[2]);
        double z = Math.max(Math.max(dAB,dAC),dBC);
        boolean b = false;
        if ( z == dAB) { b = dAB < (dAC + dBC);}
        if ( z == dAC) { b = dAC < (dAB + dBC);}
        if ( z == dBC) { b = dBC < (dAB + dAC);}
        return b;
    }

    //Uppgift d)
    public static String typOfTriangel(Punkt2D[] v) {
        double dAB = Punkt2D.distance(v[0],v[1]);
        double dAC = Punkt2D.distance(v[0],v[2]);
        double dBC = Punkt2D.distance(v[1],v[2]);
        String s = "Godtycklig";
        if (dAB == dAC && dAB == dBC && dAC == dBC) s = "Liksidig";
        if ( (dAB == dAC) || (dAB == dBC) || (dBC == dAC) ) s = "Likbent";
        //Rätvinklig: Pythagoras sats
        double c = Math.max(Math.max(dAB,dAC),dBC);
        double diff=1.0;; double tol = 1.0e-4;
        if ( c == dAB) diff = dAB*dAB - (dAC*dAC + dBC*dBC);
        if ( c == dAC) diff = dAC*dAC - (dAB*dAB + dBC*dBC);
        if ( c == dBC) diff = dBC*dBC - (dAB*dAB + dAC*dAC);
        if ( Math.abs(diff) <= tol ) s = "Rätvinklig";
        return s;
    }

    //Uppgift e)
    public static double calcPerimeter(Punkt2D[] v) {
        double dAB = Punkt2D.distance(v[0],v[1]);
        double dAC = Punkt2D.distance(v[0],v[2]);
        double dBC = Punkt2D.distance(v[1],v[2]);
        return (dAB+dAC+dBC);
    }

    //Uppgift f)
    public static double calcArea(Punkt2D[] v) {
        double dAB = Punkt2D.distance(v[0],v[1]);
        double dAC = Punkt2D.distance(v[0],v[2]);
        double dBC = Punkt2D.distance(v[1],v[2]);
        double s = (dAB+dAC+dBC)/2;
        double area = Math.sqrt(s*(s-dAB)*(s-dAC)*(s-dBC)); 
        return area;
    }

    //Uppgift g)
    public static void skriverUt(Punkt2D[] v) {
        System.out.println("====== Sammanställning ===== ");
        System.out.println("Point A: " + v[0].toString());
        System.out.println("Point B: " + v[1].toString());
        System.out.println("Point C: " + v[2].toString());
        boolean b = isAtriangel(v);
        if (b == true) 
           System.out.println("The points form a triangle");
        else
           System.out.println("The point does not form a triangle");
        String typ = typOfTriangel(v);
        System.out.println("Trianglen är: " + typ);   
        double perimeter = calcPerimeter(v); 
        System.out.println("Perimeter is: " +perimeter + " l.e.");
        double area = calcArea(v);
        System.out.println("Area is: " +area + " a.e.");
        System.out.println("================================== ");
    }

    public static void main(String[] args) {
        
        //Uppgift a)-b)
        Punkt2D[] p = new Punkt2D[3];
        try {
            p = readPoints(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Uppgift g)
        skriverUt(p);
    }
}
