package modul02;

/**
     * Course: Javaprogrammering
     * Modul 2
     * Purpose: A simple program to calculate the area of a circle
     * (c) Luciano Triguero, june 2023 
     */

public class Circle {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double diameter = 10.0;
        double area = calculateArea(diameter / 2);
        System.out.println(area);
    }

}
