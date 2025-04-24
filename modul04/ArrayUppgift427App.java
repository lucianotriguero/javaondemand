package modul04;
import java.util.*;
import java.io.*;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ArrayUppgift427App {

    public static int readProdukts(Produkt[] listaProdukts) throws IOException {
        //Read produktlistan från en text fil
        int n = 0;
        String inpath = "C:\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modul04\\produkter.txt";
        Scanner input = new Scanner(new File(inpath));
        input.useDelimiter("\\s");
        while (input.hasNext()) {
            listaProdukts[n] = new Produkt();
            listaProdukts[n].produktnr = input.nextInt();
            listaProdukts[n].produktnamn = input.next();
            listaProdukts[n].hyllanskod = input.nextLine();
            n++;
        }
        input.close();
        return n;
    }

    public static void dumpArraytoFile(Produkt[] array, int antal) throws IOException {
        //Skriv den sorterade arrayen till filen: sortprodukter.txt
        String outpath = "C:\\Users\\lucia\\Desktop\\ltprojects\\java2023\\src\\modul04\\sortprodukter.txt";
        PrintWriter output = new PrintWriter
                             (new BufferedWriter
                             (new FileWriter(outpath)));
        for (int i=0; i<antal; i++) {
            output.println(array[i].toString());
        } 
        output.close(); 
    }

    public static void main(String[] args) throws IOException {

        Produkt[] listaProdukts = new Produkt[100];
        int n = readProdukts(listaProdukts);
        Arrays.sort(listaProdukts,0,n);
        dumpArraytoFile(listaProdukts, n);
    } 
}
