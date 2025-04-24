package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class DriverRatTalApp {
   public static void main(String[] args) {
      RatTal t1 = new RatTal();
      System.out.println(t1.toString());
      RatTal t2 = new RatTal(15, 10);
      System.out.println(t2.toString());
      t2.reduce(t2);
      System.out.println(t2.toString());
   } 
}
