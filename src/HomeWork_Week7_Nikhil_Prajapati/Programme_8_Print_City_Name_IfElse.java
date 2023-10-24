package HomeWork_Week7_Nikhil_Prajapati;

/** Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme_8_Print_City_Name_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F or a to f): ");
        char alphabet = scanner.next().charAt(0);

        String cityName;

        if (alphabet == 'A' || alphabet == 'a') {
            cityName = "Ahmedabad";
        } else if (alphabet == 'B' || alphabet == 'b') {
            cityName = "Baroda";
        } else if (alphabet == 'C' || alphabet == 'c') {
            cityName = "Chandigarh";
        } else if (alphabet == 'D' || alphabet == 'd') {
            cityName = "Delhi";
        } else if (alphabet == 'E' || alphabet == 'e') {
            cityName = "Elephanta";
        } else if (alphabet == 'F' || alphabet == 'f') {
            cityName = "Fatehpur";
        } else {
            cityName = "Invalid entry";
        }

        System.out.println("City Name: " + cityName);

        scanner.close();
    }
}
