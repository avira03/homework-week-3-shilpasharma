package javahomework;

import java.util.Scanner;

public class program_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any alphabet between A &  F: ");
        char ch = scanner.next().toUpperCase().charAt(0);
        scanner.close();
        String city;
        if (ch == 'A') {
            city = "London";
        } else if (ch == 'B') {
            city = "Birmingham";
        } else if (ch == 'C') {
            city = "Delhi";
        } else if (ch == 'D') {
            city = "Mumbai";
        } else if (ch == 'E') {
            city = "Coventry";
        } else if (ch == 'F') {
            city = "Leicester";
        } else {
            city = "Invalid Entry";
        }
        System.out.println("City Name: " + city);

    }
}
