package com.example.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1 = readValidNumber(scanner, "Enter the first number: ");
        double number2 = readValidNumber(scanner, "Enter the second number: ");

        System.out.println();
        System.out.println("=== RESULT ===");
        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));

        if (number2 != 0) {
            System.out.println("Division: " + (number1 / number2));
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        scanner.close();
    }

    private static double readValidNumber(Scanner scanner, String prompt) {
        double number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            try {
                number = scanner.nextDouble();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return number;
    }
}
