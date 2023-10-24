package javahomework;

import java.util.Scanner;

public class program_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        double n = scanner.nextInt();
        scanner.close();
        double r = n % 2;
        if (r == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is not even");
        }
    }
}
