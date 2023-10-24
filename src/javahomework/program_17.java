package javahomework;
import java.util.Arrays;

public class program_17 {

        public static void main(String[] args) {

            int[] numericArray = {5, 2, 9, 1, 5, 6};
            System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));

            Arrays.sort(numericArray);
            System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

            // String array
            String[] stringArray = {"apple", "orange", "banana", "grape", "kiwi"};
            System.out.println("\nOriginal String Array: " + Arrays.toString(stringArray));

            // Sort string array
            Arrays.sort(stringArray);
            System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
        }
    }


