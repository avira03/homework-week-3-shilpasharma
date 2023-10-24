package javahomework;
import java.util.Scanner;
public class program_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any alphabet between A &  F: ");
        char ch= scanner.next().toUpperCase().charAt(0);
        scanner.close();
        String city;
        switch (ch) {
            case 'A':
                city = "London";
                break;
            case 'B':
                city = "Birmingham";
                break;
            case 'C':
                city = "Delhi";
                break;
            case 'D':
                city = "Mumbai";
                break;
            case 'E':
                city = "Coventry";
                break;
            case 'F':
                city = "Leicester";
                break;
            default:
                city = "Invalid Entry";
        }
        System.out.println("City Name: " + city);
    }
}
