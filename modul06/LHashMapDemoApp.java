package modul06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LHashMapDemoApp {

    public static void main(String[] args) {
        
        //Skapa en HashMap
        //key har typen String och value har typen Double
        //HashMap<String,Double> bank = new HashMap<String,Double>();
        HashMap<String,Double> bank = new HashMap<String,Double>();

        //Lägg till element. Notera att här använder 
        //man metoden put()
        bank.put("Peter Svenssson",3456.45);
        bank.put("Elin Walhgren",2546.00);
        bank.put("Martin Olovsson",-19.00);
        bank.put("Lina Martinez",1556.45);
        bank.put("Daniel Egnar",119.55);

        //Läxa (Utmatning)
        //Copy HashMap bank elements to the new HashMap banktf
        HashMap<String,Double> banktf = new HashMap<String,Double>(bank);
        
        //Insättning på 1000.00 kr endast till Martin Olovssons konto.
        double balans = bank.get("Martin Olovsson");
        double insattningsbelopp = 1000.00;
        banktf.put("Martin Olovsson", balans + insattningsbelopp);

        Set<Map.Entry<String,Double>> setbank = bank.entrySet(); 
        Set<Map.Entry<String,Double>> setbanktf = banktf.entrySet(); 
        for ( Map.Entry<String,Double> elementf : setbanktf ) {
            System.out.format("%20s\t%10.2f\n",elementf.getKey(),elementf.getValue());
        }
        for ( Map.Entry<String,Double> elementi : setbank ) {
            System.out.format("%20s\t%10.2f\n",elementi.getKey(),elementi.getValue());
        }
    }
}

/* //Skriver ut tabellen med metoden toString
        System.out.println();
        System.out.print("Balanskonto i tabellen: ");
        System.out.println(banktf); */

 /* //Skriver ut tabellen med metoden toString, efter insättningen
        System.out.println();
        System.out.print("Balanskonto efter insättningen: ");
        System.out.println(bank);
        System.out.println(); */