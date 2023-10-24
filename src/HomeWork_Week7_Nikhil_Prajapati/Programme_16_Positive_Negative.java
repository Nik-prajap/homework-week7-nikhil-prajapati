package HomeWork_Week7_Nikhil_Prajapati;

//java program to check if enter number is “Positive”, “Negative” or "Zero"

import java.util.Scanner;

public class Programme_16_Positive_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
        scanner.close();
    }
}
