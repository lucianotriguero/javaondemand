package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class DriverPunkt2DApp {
    public static void main(String[] args) {

        //1. Deklarera en referensvariabel A som 
        //pekar på ett objekt av typen Punkt2D 
        Punkt2D A = null;
        
        //2. Skapas själva objektet genom att anropa
        //default konstruktorn. Notera nyckelordet new
        A = new Punkt2D();

        //3. Här slås ihop stegen 1 och 2. 
        //Notera nyckelordet new 
        Punkt2D B = new Punkt2D(5,5);

        //Anropas metoden Objekt.toString() för 
        //att undersöka objektens tillstånd. 
        System.out.print("Punkt A: ");
        System.out.println(A.toString());
        System.out.print("Punkt B: ");
        System.out.println(B.toString());
    
        //Programmeringsuppgift 3.1.1
        //a)
        double d = Punkt2D.distance(A,B);
        System.out.println("Avståndet mellan punkterna A och B är: " +d);
        //a) Alternativ 2
        double dalt2 = A.distanceAlt2(B);
        System.out.println("Avståndet mellan punkterna A och B är: " +dalt2);

        //b)
        Punkt2D M = Punkt2D.midpoint(A, B);
        System.out.print("Mittpunkten: ");
        System.out.println(M.toString());
        //b) Alternativ 2
        Punkt2D Malt2 = A.midpointAlt2(B);
        System.out.print("Mittpunkten: ");
        System.out.println(Malt2.toString());

        //Instuderingsuppgift M3-1.1
        double x = 5.0;
        Punkt2D blank = new Punkt2D(1,2);

        System.out.println("Instuderingsuppgift M3-1.1");
        System.out.println(Punkt2D.riddle(x,blank));
        System.out.println(blank.getX());
        System.out.println(blank.getY());
    }

}
