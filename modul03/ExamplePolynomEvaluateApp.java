package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ExamplePolynomEvaluateApp {

    public static void main(String[] args) {
        Function f = new QuadraticPolynomial(1,0,2);
        for (int x=0; x < 10; x++ ) {
            System.out.println("x = " + x + "  f(x) = " + f.evaluate(x));
        }
    }
    
}
