package javahomework;

public class program_11 {

    public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                double x = i%3;
                if (x == 0) {
                    System.out.println("division by 3: "+ i  );
                }
                double y = i % 5;
                if (y == 0) {
                    System.out.println("division by 5:  " + i  );
                }
            }
        }
    }




