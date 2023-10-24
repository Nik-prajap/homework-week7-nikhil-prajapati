package HomeWork_Week7_Nikhil_Prajapati;

// Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Programme_12_Number_Or_Alphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        if (Character.isDigit(input)) {
            System.out.println("The input is a number.");
        } else if (Character.isLetter(input)) {
            System.out.println("The input is an alphabet (letter).");
        } else {
            System.out.println("The input is a symbol or special character.");
        }
        scanner.close();
    }
}
