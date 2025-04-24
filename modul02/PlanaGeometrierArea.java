package modul02;
/*
     * Course: Javaprogrammering
     * Modul 2: Lektion 1: Programmeringsuppgift 2.1.1
     * Purpose: Metoder med flera paramenter.
     * (c) Luciano Triguero, june 2023 
     */

public class PlanaGeometrierArea {

    /**
         * Calculate area of some plane geometries
         * @param String s, double x, double y
    */
    public static double calculateArea(String s, double x, double y) {

        double area = 0;   //Default value
        switch (s) {   
            case "Triangel":
                 area = x*y/2.0;
                 break;
            case "Parallellogram":
                 area = x*y;
                 break;             
            case "Cirkelsektor":
                 double b = x*2*Math.PI*y/360;
                 area = b*y/2;
                 break;
            default: throw new IllegalArgumentException("Wrong geometry, Check spellning"); 
        }
        return area;
    }

    /**
         * Starts the Java application
         * @param args command lines paramters
    */
    public static void main(String[] args) throws Exception {

        //Test: Triangel
        double tbase = 5.0; 
        double theight = 2.0;
        System.out.println("Triangelns area blir lika med: " + calculateArea("Triangel",tbase,theight));

        //Test: Parallellogram
        double pbase = 5.0; 
        double pheight = 2.0;
        System.out.println("Triangelns area blir lika med: " + calculateArea("Parallellogram",pbase,pheight));

        //Test: Cirkelsektor
        double v = 360.0;    //Grader 
        double r = 1.0;
        System.out.println("Triangelns area blir lika med: " + calculateArea("Cirkelsektor",v,r));
    }   
    
}
