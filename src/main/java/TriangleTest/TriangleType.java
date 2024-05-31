package TriangleTest;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String firstInput = input.next();
        System.out.print("Enter second number: ");
        String secondInput = input.next();
        System.out.print("Enter third number: ");
        String thirdInput = input.next();

        try {
            int a = Integer.parseInt(firstInput);
            int b = Integer.parseInt(secondInput);
            int c = Integer.parseInt(thirdInput);
            String result = checkTriangleType(a, b, c);
            System.out.println("Triangle " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }
    }

    public static String checkTriangleType(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "Equilateral triangle";
            } else if (a == b || a == c || b == c) {
                return "Isosceles triangle";
            } else {
                return "This is a scalene triangle";
            }
        } else {
            return "Your data is not valid!Enter integers greater than zero!";
        }
    }
}