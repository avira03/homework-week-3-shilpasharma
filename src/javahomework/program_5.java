package javahomework;
import java.util.Scanner;

public class program_5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Employee Id: ");
            int employeeId = scanner.nextInt();

            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.next();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            scanner.close();

            // calculations
            double hra = 0.10 * basicSalary;
            double ta = 0.08 * basicSalary;
            double da = 0.09 * basicSalary;
            double pf = 0.20 * basicSalary;
            double grossSalary = basicSalary + hra + ta + da - pf;

            // Display the salary slip
            System.out.println("_______________________________");
            System.out.println("| Salary Slip                 |");
            System.out.println("|______________________________|");
            System.out.println("| Employee Id   : " + employeeId);
            System.out.println("| Employee Name : " + employeeName);
            System.out.println("|______________________________|");
            System.out.println("| Basic Salary  : " + basicSalary);
            System.out.println("| HRA 10%       : " + hra);
            System.out.println("| TA 8%         : " + ta);
            System.out.println("| DA 9%         : " + da);
            System.out.println("| PF - 20%      : " + pf);
            System.out.println("|______________________________|");
            System.out.println("| Gross Salary  : " + grossSalary);
            System.out.println("|==============================|");

        }
    }

