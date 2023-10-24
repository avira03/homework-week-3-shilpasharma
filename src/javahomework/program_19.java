package javahomework;

import java.util.Arrays;

public class program_19 {

        public static void main(String[] args) {
            int[] array = {5, 2, 9, 1, 5, 6};
            double sum = 0;
              double avg;
            for (int value : array) {
                sum += value;
            }
            avg =  sum /array.length;
            System.out.println("Avg of Numeric Array: "+ Arrays.toString(array) + " is " + avg);

        }

    }
