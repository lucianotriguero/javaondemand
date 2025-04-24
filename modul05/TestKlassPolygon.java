package modul05;

/**
     * Course: Javaprogrammering
     * Modul 5
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class TestKlassPolygon {


    public static int countns(Polygon p, int N) {
        Random rand = new Random();
        Rectangle2D rect = p.getBounds2D();
        int ns = 0;
        for (int n=0; n<N; n++) {
            double xi = rect.getMinX() + (rect.getMaxX()-rect.getMinX())*rand.nextDouble();
            double yi = rect.getMinY() + (rect.getMaxY()-rect.getMinY())*rand.nextDouble();
            if (p.contains(xi,yi) == true ) {ns = ns + 1;}
        }
        return ns;
    }

    public static double calcAreaboundRect(Polygon p) {
        Rectangle2D rect = p.getBounds2D();
        return ((rect.getMaxX()-rect.getMinX())*(rect.getMaxY()-rect.getMinY()));
    }

    public static void main(String[] args) {
    
        //Exempel 1
        int[] x = {0,5,10};
        int[] y = {0,5,0};

        //Exempel 2
        //int[] x = {2,-3,-4};
        //int[] y = {3,2,-3};
        Polygon p1 =new Polygon(x, y, 3);

        int N = 1000000;
        System.out.format("Area of the bounding rectangle is %.2f \n", calcAreaboundRect(p1));
        System.out.format("Area of the polygon is %.2f \n", calcAreaboundRect(p1)*countns(p1,N)/N);


    }
}
