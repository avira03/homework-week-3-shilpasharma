package javahomework;
import java.util.Scanner;

public class program_12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a character: ");
            char x = scanner.next().charAt(0);
            scanner.close();

            if (Character.isDigit(x)) {
                System.out.println( x+ " is a number.");
            } else if (Character.isLetter(x)) {
                System.out.println(x+ " is an alphabet.");
            } else {
                System.out.println(x+ " is a symbol.");
            }



        }
    }
