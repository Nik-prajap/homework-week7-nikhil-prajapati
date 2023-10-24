package HomeWork_Week7_Nikhil_Prajapati;

// java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Programme_6_Odd_Or_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }
}
