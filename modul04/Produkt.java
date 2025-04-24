package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class Produkt implements Comparable<Produkt> {
    
    int produktnr;
    String produktnamn;
    String hyllanskod;

    public int compareTo(Produkt that) {
        if (this.produktnr < that.produktnr) 
            return -1;
        else if (this.produktnr > that.produktnr)
            return 1;
        else
            return 0;         
    }

    //Defaultkonstruktor
    public Produkt() {} 

    //Kopieringskonstruktor
    public Produkt(Produkt p) {
        this.produktnr = p.produktnr;
        this.produktnamn = p.produktnamn;
        this.hyllanskod = p.hyllanskod;
    } 

    //En till kontruktor
    public Produkt(int pnr, String pnamn, String phylla) {
        this.produktnr = pnr;
        this.produktnamn = pnamn;
        this.hyllanskod = phylla;
    }

    public String toString() {
        return String.format("%04d %s %s", produktnr, produktnamn, hyllanskod);
    }
}


