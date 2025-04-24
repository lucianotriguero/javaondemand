package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class Sparkonto {
    Person kontohavare;   
    double saldo;
    int time;
    static double interest = 3.0;  //OBS! Klassvariabel 

    //Defaultkonstruktor
    public Sparkonto() {};

    //Kopieringskonstruktor
    public Sparkonto(Sparkonto k) {
        this.kontohavare = k.kontohavare;
        this.saldo = k.saldo;
        this.time = k.time;
    } 

    //En till konstruktor
    public Sparkonto(Person p, double saldo, int time) {
        this.kontohavare = p;
        this.saldo = saldo;
        this.time = time;
    }

    //Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public static void setInterest(double ranta) {
        interest = ranta;
    }

    //Getter
    public double getSaldo() {
        return saldo;
    }

    public double getTime() {
        return saldo;
    }

    public double getInterest() {
        return interest;
    }

    //Metod: toString
    public String toString() {
        String strout = "Kontohavarens namn: " +this.kontohavare.getName() + "\n" 
        + "Kontohavarens surname: " +this.kontohavare.getSurname() + "\n" 
        + "Kontohavarens birthday: " +this.kontohavare.getBirthday() + "\n" 
        + "Saldo: " +this.saldo + " SEK" +"\n"
        + "Bindingstid: " +this.time;
        return strout;
    }

    public double calcAvkastning() {
        double newsaldo = (double) this.saldo*Math.pow((1+interest/100.0),this.time);
        double avkastning = newsaldo - this.saldo;
        return avkastning;
    }
}
