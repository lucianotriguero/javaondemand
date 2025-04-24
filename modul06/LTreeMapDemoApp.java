package modul06;

import java.util.TreeMap;

public class LTreeMapDemoApp {

    public static void main(String[] args) {
        
        //Skapa en TreeMap
        //key har typen String och value har typen Double
        TreeMap<String,Double> bank = new TreeMap<String,Double>();

        //Lägg till element. Notera att här använder 
        //man metoden put()
        bank.put("Peter Svenssson",3456.45);
        bank.put("Elin Walhgren",2546.00);
        bank.put("Martin Olovsson",-19.00);
        bank.put("Lina Martinez",1556.45);
        bank.put("Daniel Egnar",119.55);

        //Skriver ut tabellen med metoden toString
        System.out.println();
        System.out.print("Balanskonto i tabellen: ");
        System.out.println(bank); 

        //Insättning på 1000.00 kr endast till Martin Olovssons konto.
        double balans = bank.get("Martin Olovsson");
        double insattningsbelopp = 1000.00;
        bank.put("Martin Olovsson", balans + insattningsbelopp);

        //Skriver ut tabellen med metoden toString, efter insättningen
        System.out.println();
        System.out.print("Balanskonto efter insättningen: ");
        System.out.println(bank);
        System.out.println();
        
    }
}

  /* Collator c = Collator.getInstance();
        c.setStrength(Collator.PRIMARY); */