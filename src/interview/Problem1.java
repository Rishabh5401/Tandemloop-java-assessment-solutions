package interview;

import java.util.Scanner;

class Calculator {
    public void performOperation(double a, double b, String operation) {
        double result = 0;
        boolean success = true;

        switch (operation.toLowerCase()) {
            case "addition":
            case "+":
            case "add":
                result = a + b;
                break;
            case "subtraction":
            case "-":
            case "subtract":
                result = a - b;
                break;
            case "multiplication":
            case "*":
            case "multiply":
                result = a * b;
                break;
            case "division":
            case "/":
            case "divide":
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    success = false;
                } else {
                    result = a / b;
                }
                break;
            default:
                System.out.println("Invalid operation");
                success = false;
                break;
        }

        if (success) {
            System.out.println("Result: " + result);
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("--- Simple Calculator ---");
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.next();

        calc.performOperation(a, b, operation);
        scanner.close();
    }
}