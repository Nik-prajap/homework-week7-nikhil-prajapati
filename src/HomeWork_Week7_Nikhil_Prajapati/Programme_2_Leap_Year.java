package HomeWork_Week7_Nikhil_Prajapati;

import java.util.Scanner;

// Input any year and find out if its Leap year or not??
public class Programme_2_Leap_Year {

    public static void main(String[] args) {

        // Scanner used.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Year");
        // Input as Int for the year
        int year = scanner.nextInt();

        //if-else method used
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap year.");
        } else {
            System.out.println(year + " is not a Leap year");
        }

        //Scanner closed.
        scanner.close();
    }
}
