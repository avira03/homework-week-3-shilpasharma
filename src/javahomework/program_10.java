package javahomework;

import java.util.Scanner;

public class program_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the operation symbol (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        scanner.close();
        double r;

        if (operation == '+') {
            r = a + b;
            System.out.println("Addition Result: " + r);
        } else if (operation == '-') {
            r = a - b;
            System.out.println("Subtraction Result: " + r);
        } else if (operation == '*') {
            r = a * b;
            System.out.println("Multiplication Result: " + r);
        } else if (operation == '/') {
            if (b != 0) {
                r = a / b;
                System.out.println("Division Result: " + r);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation symbol.");
        }

    }
}
