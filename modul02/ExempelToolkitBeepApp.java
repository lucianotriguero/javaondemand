package modul02;

import java.awt.Toolkit;
import java.lang.Thread;

/**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class ExempelToolkitBeepApp {
    
    public static void plinga( int n ) throws InterruptedException {
        for ( int i=1; i<= n; i++ ) {
            Toolkit.getDefaultToolkit().beep(); 
            Thread.sleep(500);
        }
    }

    public static void main(String[] args) throws Exception {

        plinga(10);
    }

}
