package HomeWork_Week7_Nikhil_Prajapati;

import java.util.Scanner;

/**
 * Tell us that Input number is Odd or Even
 * Use Ternary Operator
 */
public class Programme_1_Ternary_Operator {

    public static void main(String[] args) {
        // Scanner used
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        // Input number
        int a = scanner.nextInt();
        //Ternary Operator used
        String b = a % 2 == 0 ? "Even" : "Odd";

        // if-else method used
        if (a % 2 == 0) {
            b = "Even";
        } else {
            b = "Odd";
        }
        System.out.println("The Entered number is " + b);
        // Scanner closed.
        scanner.close();
    }
}