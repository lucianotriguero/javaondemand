package modul02;

/*
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Multiple method and Math class.
     * (c) Luciano Triguero, june 2023 
     */

public class KoordinatGeometriApp {

    public static void kartesiska2Polar(double x, double y) {
        
        double r = Math.hypot(x, y);
        double theta = Math.toDegrees(Math.atan2(y, x));
        System.out.printf("Polära koordinater är: (%.2f, %.2f) \n", r, theta);   
    }

    public static void polar2Kartesiska(double r, double theta) {
        
        double x = r*Math.cos(Math.toRadians(theta));
        double y = r*Math.sin(Math.toRadians(theta));
        System.out.printf("Kartesiska koordinater är: (%.2f, %.2f) \n", x, y);
    }

    public static void main(String[] args) throws Exception {

        //Prövning av metoder
        //Kartesiska till polära
        //En punkt i första kvadrant P(5,5);
        kartesiska2Polar(5, 5);
        //En punkt i andra kvadrant P(-5,5);
        kartesiska2Polar(-5, 5);
        //En punkt i tredje kvadrant P(-5,-5);
        kartesiska2Polar(-5, -5);
        //En punkt i fjärde kvadrant P(5,-5);
        kartesiska2Polar(5, -5);

        //Polära till kartesiska
        //En punkt i första kvadrant P(1,45);
        polar2Kartesiska(1, 45);
        //En punkt i andra kvadrant P(1,135);
        polar2Kartesiska(1, 135);
        //En punkt i tredje kvadrant P(1,225);
        polar2Kartesiska(1, 225);
        //En punkt i fjärde kvadrant P(1,-45);
        polar2Kartesiska(1, -45);


    }
    
}
