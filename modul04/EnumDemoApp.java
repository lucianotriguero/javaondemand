package modul04;

/**
     * Course: Javaprogrammering
     * Modul 4
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class EnumDemoApp {

    enum Transport {CAR, TRUCK, AIRPLANE, TRAIN, BOAT };
    public static Transport tp;

    public static void main(String[] args) {
    
        System.out.println("Here ara all Transport values");
        Transport allTransport[] = Transport.values();
        for ( Transport t : allTransport)
           System.out.println(t);
        System.out.println();
        
        tp = Transport.valueOf("CAR");
        System.out.println("The value if tp is: " + tp);
    }
    
}
