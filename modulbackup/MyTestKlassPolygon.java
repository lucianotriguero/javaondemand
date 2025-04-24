package modulbackup;

import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import java.util.Random;

//@SuppressWarnings("serial")
public class MyTestKlassPolygon extends Polygon {
    int N;
    double yta;

    MyTestKlassPolygon() {
        this.N = 100;
        this.yta = 0.0;
    }
    
    MyTestKlassPolygon(int[] xi, int[] yi, int antal) {
        super(xi,yi,xi.length);
        this.N = antal;
        this.yta = 0.0;
    }
 
    public void calcYta() {
        Random rand = new Random();
        Rectangle2D rect = this.getBounds2D();
        double YtaRect = (rect.getMaxX()-rect.getMinX())*(rect.getMaxY()-rect.getMinY());
        int ns = 0;
        for (int n=0; n<N; n++) {
            double xi = rect.getMinX() + (rect.getMaxX()-rect.getMinX())*rand.nextDouble();
            double yi = rect.getMinY() + (rect.getMaxY()-rect.getMinY())*rand.nextDouble();
            if (this.contains(xi,yi) == true ) {ns = ns + 1;}
        }
        this.yta = YtaRect*ns/this.N;
    }

    @Override
    public String toString() {
        String strout = String.format("Med N = %4d fås Yta = %.2f a.e. \n",this.N, this.yta);
        return strout;
    }

    public static double calcAreaboundRect(Polygon p) {
        Rectangle2D rect = p.getBounds2D();
        return ((rect.getMaxX()-rect.getMinX())*(rect.getMaxY()-rect.getMinY()));
    }

    public int countns(int N) {
        Random rand = new Random();
        Rectangle2D rect = this.getBounds2D();
        int ns = 0;
        for (int n=0; n<N; n++) {
            double xi = rect.getMinX() + (rect.getMaxX()-rect.getMinX())*rand.nextDouble();
            double yi = rect.getMinY() + (rect.getMaxY()-rect.getMinY())*rand.nextDouble();
            if (this.contains(xi,yi) == true ) {ns = ns + 1;}
        }
        return ns;
    }  
}
