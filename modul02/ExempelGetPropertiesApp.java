package modul02;

/**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ExempelGetPropertiesApp {
    
    public static void main(String[] args) throws Exception {

        String uname = System.getProperty("user.name");
        String sys = System.getProperty("os.name");
        System.out.println("Hej " + uname);
        System.out.println("Du kör " + sys);
        System.out.println("Nanotime is = " + System.nanoTime());
        System.out.println("Time in ms is = " + System.currentTimeMillis());
    }
}
