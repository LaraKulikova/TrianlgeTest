package TriangleTest;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();

        String result = checkTriangleType(a, b, c);
        System.out.println("Triangle " + result);
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
            return "There is no triangle";
        }
    }
}