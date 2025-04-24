package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class DriverSparkontoApp {

    public static void main(String[] args) {
        
        Person Lkowner = new Person("Luciano","Triguero",
                            19641208,0,0);

        Person Mkowner = new Person("Maria","Svensson",
                            19661103,0,0);                    
        
        Sparkonto Lkonto = new Sparkonto(Lkowner,50000.00,3);
        System.out.println();
        System.out.println(Lkonto.toString());
        System.out.println("Lkonto: Interest är: " +Lkonto.getInterest());
        System.out.printf("Lkonto: Avkastning är: %.2f \n", Lkonto.calcAvkastning());
        System.out.println();
        Sparkonto Mkonto = new Sparkonto(Mkowner,100000.00,2);
        System.out.println(Mkonto.toString());
        System.out.println("Mkonto: Interest är: " +Mkonto.getInterest());
        System.out.printf("Mkonto: Avkastning är: %.2f \n", Mkonto.calcAvkastning());
        System.out.println();



        //Nu ändrar vi initieringsvärde till klassvariabeln interest
        Sparkonto.interest = 3.2;
        System.out.println("Lkonto: New interest is: " +Lkonto.getInterest());
        System.out.printf("Lkonto: Avkastning är: %.2f \n", Lkonto.calcAvkastning());

        System.out.println("Mkonto: New interest is: " +Mkonto.getInterest());
        System.out.printf("Mkonto: Avkastning är: %.2f \n", Mkonto.calcAvkastning());        

        System.out.println();

    }
    
}
