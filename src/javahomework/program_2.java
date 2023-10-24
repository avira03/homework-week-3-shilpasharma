// java program to input any year like (ex.2007) and find out if it is leap year or  not?


package javahomework;

import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year");
        int year = scanner.nextInt();
        scanner.close();

      //  int x= ((year % 4 && year== 0  % 100 != 0) || (year % 400 == 0));

        int x = year % 4;
        int y= year % 100;
        int z = year % 400;

        if (x == 0 && y !=0 ||  z==0) {

            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not a leap year ");
        }
    }
}
