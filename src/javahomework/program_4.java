package javahomework;

import java.util.Scanner;

public class program_4 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a year");
            int year = scanner.nextInt();

            System.out.println("enter month number");
            int month = scanner.nextInt();
            scanner.close();
            boolean x = isLeapYear(year);
            System.out.println("is leap year: "+x);

            int y = getDaysInMonth(month,year);
            System.out.println("days in months: "+y);
        }

        // Method to check if a year is a leap year
        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        // Method to get the number of days in a month
        public static int getDaysInMonth(int month, int year) {
            if (month < 1 || month > 12 || year < 1 || year > 9999) {
                return -1;
            }

            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                default:
                    return -1;
            }
        }
    }