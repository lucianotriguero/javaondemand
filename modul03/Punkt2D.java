package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class Punkt2D {
    public double x;  //x-koordinat
    public double y;  //y-koordinat

    //Defaultkonstruktor
    public Punkt2D() {} 

    //Kopieringskonstruktor
    public Punkt2D(Punkt2D p) {
        this.x = p.x;
        this.y = p.y;
    } 

    //En till kontruktor
    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Metod: toString
    public String toString() {
        String strout = "Kartesiska koordinater är ( " +this.x+ "," +this.y+ ")";
        return strout;
    }

    //Programmeringsuppgift 3.1.1 a)
    //Alternativ 1
    public static double distance(Punkt2D a, Punkt2D b) {
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        return (Math.sqrt(dx*dx+dy*dy));
    }

    //Alternativ 2
    public double distanceAlt2(Punkt2D b) {
        double dx = b.x - this.x;
        double dy = b.y - this.y;
        return (Math.sqrt(dx*dx+dy*dy));
    }

    //Programmeringsuppgift 3.1.1 b)
    public static Punkt2D midpoint(Punkt2D a, Punkt2D b) {
        double xm = (a.x+b.x)/2;
        double ym = (a.y+b.y)/2;
        Punkt2D M = new Punkt2D(xm,ym);
        return M;
    }

    //Alternativ 2
    public Punkt2D midpointAlt2(Punkt2D b) {
        double xm = (this.x+b.x)/2;
        double ym = (this.y+b.y)/2;
        Punkt2D M = new Punkt2D(xm,ym);
        return M;
    }

    public static double riddle(double x, Punkt2D p) {
        x = x + 7;
        return x + p.x + p.y;
    }
}
