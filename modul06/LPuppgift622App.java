package modul06;

import java.util.Stack;

public class LPuppgift622App {

    public static String multiBaseOutput(Integer num, Integer b) {
        String digitChar = "0123456789ABCDEF";

        Stack<Character> stk = new Stack<Character>();
        do {
            //Push right-most digit on the Stack
            Character c = digitChar.charAt(num%b);
            stk.push(c);
            num = num/b;
        } while( num!=0);

        String numStr = "";
        while (!stk.empty()) {
            numStr = numStr + stk.lastElement();
            stk.pop();
        }
        return numStr;
    }

    public static void main(String[] args) {
        
        System.out.println(multiBaseOutput(26, 2));
        System.out.println(multiBaseOutput(75, 2));
        System.out.println(multiBaseOutput(236, 2));
        System.out.println(multiBaseOutput(26, 8));
        System.out.println(multiBaseOutput(75, 8));
        System.out.println(multiBaseOutput(236, 8));
        System.out.println(multiBaseOutput(26, 16));
        System.out.println(multiBaseOutput(75, 16));
        System.out.println(multiBaseOutput(236, 16));
    }
}
