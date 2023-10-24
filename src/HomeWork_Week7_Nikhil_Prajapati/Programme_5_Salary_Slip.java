package HomeWork_Week7_Nikhil_Prajapati;

import java.util.Scanner;

public class Programme_5_Salary_Slip {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input employee details
            System.out.print("Enter Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            // Calculate HRA, TA, DA, PF, and Gross Salary
            double hra = basicSalary * 0.10;
            double ta = basicSalary * 0.08;
            double da = basicSalary * 0.09;
            double pf = basicSalary * 0.20;
            double grossSalary = basicSalary + hra + ta + da - pf;

            // Print the salary slip
            System.out.println(" _______________________________");
            System.out.println("| Salary Slip                   |");
            System.out.println("|_______________________________|");
            System.out.println("| Employee ID : " + employeeId + "            |");
            System.out.println("| Employee Name : " + employeeName + "        |");
            System.out.println("|_______________________________|");
            System.out.println("| Basic Salary : " + basicSalary + "        |");
            System.out.println("| HRA 10% : " + hra + "             |");
            System.out.println("| TA 8% : " + ta + "               |");
            System.out.println("| DA 9% : " + da + "               |");
            System.out.println("| PF - 20% : " + pf + "           |");
            System.out.println("|_______________________________|");
            System.out.println("| Gross Salary : " + grossSalary + "        |");
            System.out.println("|===============================|");

            scanner.close();
        }
    }

