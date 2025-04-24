package modul01;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
*/

import java.util.*;

public class LDateApp {

 public static void main(String[] args) {
  
  String Welcome = "Hello!";
  Calendar c = Calendar.getInstance();
  System.out.println(Welcome);
  System.out.println("The current date is: " +c.getTime());
  System.out.print("American format: ");
  System.out.print(c.get(Calendar.DATE));
  System.out.print("/");
  System.out.print(c.get(Calendar.MONTH)+1);
  System.out.print("/");
  System.out.println(c.get(Calendar.YEAR));
  System.out.print("Swedish format: ");
  System.out.print(c.get(Calendar.YEAR));
  System.out.print("/");
  System.out.print(c.get(Calendar.MONTH)+1);
  System.out.print("/");
  System.out.println(c.get(Calendar.DATE));

 }

}
