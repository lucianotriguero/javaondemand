package modul01;
import java.util.Scanner;

/*
     * Course: Javaprogrammering
     * Modul 1
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
*/

public class ReadNameAgeSalaryApp {
    
    public static void main(String[] args) {

        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter name, age and salary:");

            // String input
            String name = myObj.nextLine();

            // Numerical input
            int age = myObj.nextInt();
            double salary = myObj.nextDouble();

            // Output input by user
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }
}
