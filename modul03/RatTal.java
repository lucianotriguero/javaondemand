package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class RatTal {
    private int num;         //Täljare
    private int den;         //Nämnare

    //Default Contructor
    public RatTal() {
        setNum(0);
        setDen(1);
    }

    //Copy contructor
    public RatTal(RatTal btal) {
        setNum(btal.num);
        setDen(btal.den);
    }

    //Value constructor
    public RatTal(int num, int den) {
        setNum(num);
        setDen(den);
    }

    //Setters
    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        if ( den != 0 ) {
            this.den = den;
        } else {
            throw new IllegalArgumentException("Nämnare måste skilja sig från noll"); 
        }  
    }
    
    //Getters
    public int getDen() {return den;}
    public int getNum() {return num;}

    //Method: toString
    public String toString() {
        String strout = String.format("%d/%d",this.num,this.den);
        return strout;
    }
      
    public static int gcd(int a, int b) {
        if ( b==0 ) 
            return a;
        
            return gcd(b,a%b);
    }

    public RatTal reduce(RatTal t) {
        int gCd = gcd(t.num,t.den);
        setNum(t.num/gCd);
        setDen(t.den/gCd);
        return this; 
    }
}
