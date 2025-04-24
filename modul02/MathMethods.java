package modul02;
public class MathMethods {

    /**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

    public static void main(String[] args) {
    	@SuppressWarnings("unused")
        double root = Math.sqrt(17.0);
        double angle = 1.5;
        @SuppressWarnings("unused")
        double height = Math.sin(angle);

        double degrees = 90;
        @SuppressWarnings("unused")
        double angle2 = degrees / 180.0 * Math.PI;

        @SuppressWarnings("unused")
        double radians = Math.toRadians(180.0);
        @SuppressWarnings("unused")
        double degrees2 = Math.toDegrees(Math.PI);

        @SuppressWarnings("unused")
        long x = Math.round(Math.PI * 20.0);

        // examples of composition
        @SuppressWarnings("unused")
        double x2 = Math.cos(angle + Math.PI / 2.0);
        @SuppressWarnings("unused")
        double x3 = Math.exp(Math.log(10.0));
        @SuppressWarnings("unused")
        double x4 = Math.pow(2.0, 10.0);
    }

}
