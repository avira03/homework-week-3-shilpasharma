package javahomework;

import java.util.Scanner;

public class program_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter sales id: ");
        int salesId = scanner.nextInt();
        System.out.print("enter seller name: ");
        String sellerName = scanner.next();

        System.out.print("enter sales amount: ");
        double saleAmt = scanner.nextDouble();

        System.out.print("enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.close();

        double commissionRate;
        if (saleAmt >= 50000) {
            commissionRate = 0.35;
        } else if (saleAmt >= 30000) {
            commissionRate = 0.20;
        } else if (saleAmt >= 20000) {
            commissionRate = 0.10;
        } else if (saleAmt >= 10000) {
            commissionRate = 0.05;
        } else {
            commissionRate = 0.02;
        }
        double salesCommission = saleAmt * commissionRate;
        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + saleAmt);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Sales Commission: " + salesCommission);

        double totalEarnings = basicSalary + salesCommission;
        System.out.println("Total Earnings: " + totalEarnings);


    }
}

