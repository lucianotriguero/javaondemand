package modul02;

/**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class UppgiftM224Char2IntApp {

    public static int kryteraTwoHeltal(String s) {

          int code = 0;
          for ( int i=0; i<s.length(); i++) {
             System.out.println((int) s.charAt(i));
             code += (int) s.charAt(i);
          }
          return code;
    }


    public static void main(String[] args) {

        int code = kryteraTwoHeltal("Banan");
        System.out.println(code);
    }
    
}
