package javahomework;

import java.util.Arrays;

public class program_18 {

        public static void main(String[] args) {
            int[] array = {5, 2, 9, 1, 5, 6};
            int sum = 0;
            for (int value : array) {
                sum += value;
            }
            System.out.println("Sum of Numeric Array: "+ Arrays.toString(array) + " is " + sum);

        }
    }


