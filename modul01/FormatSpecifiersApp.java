package modul01;
/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Show the use of format specifiers
     * (c) Luciano Triguero, june 2023 
     */

public class FormatSpecifiersApp {
    
    /**
    * Starts the Java application
    * @param args command lines paramters
    */

    public static void main(String[] args) throws Exception {

        //Heltal i decimaltal system
        int x = 12345;
        System.out.printf("Format specifier (%%d) x = %d \n", x);
        System.out.printf("Format specifier (%%,d) x = %,d \n", x);
        System.out.printf("Format specifier (%%08d) x = %08d \n", x);

        //Decimaltal (Floating-point number)
        double y = Math.PI;
        System.out.printf("Format Specifier (%%f) y = %f \n", y);
        System.out.printf("Format Specifier (%%.2f) y = %.2f \n", y);

        //Decimaltal i grundpotensform
        double stortal = Math.pow(Math.PI,10); 
        System.out.printf("Format Specifier (%%e) y = %e \n", stortal);

        //Character
        System.out.printf("Format Specifier (%%c) c = %c \n", 'J');
        
        //String
        System.out.printf("Format Specifier (%%s) s = %s \n","Hello");

        //Heltal i hexadecimaltalt system
        int z = 63;
        System.out.printf("Format Specifier (%%s) z = %x \n", z);

        //Heltal i oktalt system
        int w = 476;
        System.out.printf("Format Specifier (%%w) z = %o \n", w);

    }

}
