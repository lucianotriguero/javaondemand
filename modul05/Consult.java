package modul05;

/**
     * Course: Javaprogrammering
     * Modul 5
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

//A subclass of Employee
public class Consult extends Employee {
    
    private double antaltimmar;
    private double timpris;
    
    //Default constructor
    Consult() {
        super();
        antaltimmar = 0.0;
        timpris = 750.00;
    }

    //Parametrized constructor
    Consult(String n, String sn, String pnr, double timmar, double tpris ) {
        super(n,sn,pnr);
        this.antaltimmar = timmar;
        this.timpris = tpris;
    }  

    //Clone constructor
    Consult(Consult ob) {
        super(ob);
        this.antaltimmar = ob.antaltimmar;
        this.timpris = ob.timpris;
    }

    double calcNetSalary() {
        return this.antaltimmar*this.timpris;
    }
}
