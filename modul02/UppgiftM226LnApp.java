package modul02;

/**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Material till uppgifter
     * (c) Luciano Triguero, 2023 
     */

public class UppgiftM226LnApp {
    
    public static double lnMaclaurin(double x, int n) {
        
        double f = 0.0;
        for (int i=1; i<=n; i++) {
            f += Math.pow(-1,i+1)*Math.pow(x,i)/i;
        }
        return f;
    }

    public static void main(String[] args) {
        
        double x = 0.5;
        double y = Math.log(1+x);
        System.out.printf("x = %.2f \t Math.log(1+x) = %.3f \t Approximation = %.3f \n", x, y, lnMaclaurin(x,6));
        
    }
}
