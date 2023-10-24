package javahomework;

import java.util.Arrays;
import java.util.Scanner;

public class program_20 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println(" Array: " + Arrays.toString(array));


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value to look into array");
        int x = scanner.nextInt();
        scanner.close();


        boolean found = false;
        for (int value : array) {
            if (value == x) {
                found = true;
            }
        }

        if (found) {
            System.out.println("array contains " + x);
        } else {
            System.out.println(x + " not found in an array");
        }
    }

}

