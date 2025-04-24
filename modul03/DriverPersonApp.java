package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class DriverPersonApp {

    public static void main(String[] args) {
        
        //1. Deklarera en referensvariabel A som 
        //pekar på ett objekt av typen Punkt2D 
        Person A = null;

        //2. Skapas själva objektet genom att anropa
        //defaultkonstruktor. Notera nyckelordet new
        A = new Person();
       

        //3. Här slås ihop stegen 1 och 2. 
        //Notera nyckelordet new 
        Person B = new Person("Luciano","Triguero",
                            19641208,173,71);

        //Anropas metoden Objekt.toString() för 
        //att undersöka objektens tillstånd. 
        System.out.println("Person A: ");
        System.out.println(A.toString());
        System.out.println();
        System.out.println("Person B: ");
        System.out.println(B.toString());
        System.out.println();

        //Kopieringskonstruktor
        A = new Person(B);

        //A.setName("Freya");
        //A.setBirthDay(19630328);
        System.out.println("Person A efter kopieringskontruktor: ");
        System.out.println(A);
        
        //Dålig inkaspling
        System.out.println();
        //A.length = 173;
        //System.out.println("Dålig inkapsling: ");
        //System.out.println(A);
        //System.out.println();

        //Programmeringsuppgift 3.2.2 a)
        //Alternativ 1
        System.out.printf("Namn: %s har BMI = %.1f kg/m^2 \n", B.getName(),Person.CalcBMI(B));
        //Alternativ 2
        System.out.printf("Namn: %s har BMI = %.1f kg/m^2 \n", B.getName(),B.CalcBMI());

        //Förklaring begreppen: identisk och ekvivalent
        System.out.println("===================================================");
        System.out.println("Forklaring begreppen: Identisk och Ekvivalent");
        Person C = new Person("Medel","Svensson",
                            19641208,173,71);
        Person D = new Person();
        Person E = new Person("Medel","Svensson",
                            19641208,173,71);

        //Tilldelning: Gör att C och D blir identiska
        D = C;                    
        if ( D == C ) {
            System.out.println("References D and C are identical");
        } else {
            System.out.println("References D and C are not identical");
        }
        //System.out.println(D.toString());
        
        System.out.println();
        //Anropas metoden equals. Notera att C och E är ekvivalenta        
        if ( E.equals(C) == true ) {
            System.out.println("Okjekten är ekvivalenta");
        } else {
            System.out.println("Objekten är inte ekvivalenta");
        }

        System.out.println();
        //System.out.println("Läxa: Är A och B identiska eller ekvivalenta?");
        if ( A == B ) {
            System.out.println("References A and B are identical");
        } else {
            System.out.println("References A and B are not identical");
        }
        
        System.out.println();
        if ( A.equals(B) == true ) {
            System.out.println("Okjekten är ekvivalenta");
        } else {
            System.out.println("Objekten är inte ekvivalenta");
        }
        System.out.println();
   }
}

        