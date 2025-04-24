package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */


public class QuadraticPolynomial implements Function {
    double a,b,c;

    public QuadraticPolynomial(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double evaluate (double x) {
        return a*x*x + b*x + c;
    }
}
