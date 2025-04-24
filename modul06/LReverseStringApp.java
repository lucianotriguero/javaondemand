package modul06;

public class LReverseStringApp {

    public static String reverse(String s) {
        String rev = "";
        for ( int i = s.length()-1; i>=0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }



    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = "";
        
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);  
        System.out.println("Reversed string: "+ reverse("Peter"));   
        
    }
}


       