package com.bnelson;


import java.util.Scanner;

/**
 * Created by bnelson on 1/2/17.
 */
public class CircleCalculator {

    private static Scanner scanner = new Scanner(System.in);

    private static double getRadius() {
        System.out.print("What is the radius: ");

        double input = scanner.nextDouble();

        return input;
    }

    private void displayCircumference(double radius) {
        double circumference = (radius * 2 * Math.PI);
        System.out.format("The circumference is: %.2f%n", circumference);
    }

    private void displayArea(double radius) {
        double area = (radius * radius * Math.PI);
        System.out.format("The area is: %.2f%n", area);
    }

    public static void main(String[] args) {
        CircleCalculator calc = new CircleCalculator();
        double radius = getRadius();
        calc.displayCircumference(radius);
        calc.displayArea(radius);

    }
}
