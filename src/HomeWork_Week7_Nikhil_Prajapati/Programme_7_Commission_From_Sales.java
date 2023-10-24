package HomeWork_Week7_Nikhil_Prajapati;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Programme_7_Commission_From_Sales {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double commission = 0;

        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        double totalSalary = basicSalary + commission;

        System.out.println("Sales Commission for " + sellerName + " (Sales ID: " + salesId + "): £" + commission);
        System.out.println("Total Salary: £" + totalSalary);

        scanner.close();
    }
}
