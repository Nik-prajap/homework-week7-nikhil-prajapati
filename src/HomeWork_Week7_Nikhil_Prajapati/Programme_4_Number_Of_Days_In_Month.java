package HomeWork_Week7_Nikhil_Prajapati;

import java.util.Scanner;

public class Programme_4_Number_Of_Days_In_Month {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int daysInMonth;
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }
        return daysInMonth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();
        boolean isLeap = isLeapYear(year);
        int days = getDaysInMonth(month, year);

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        if (days == -1) {
            System.out.println("Invalid month or year input.");
        } else {
            System.out.println("Number of days in month " + month + ": " + days);
        }
        scanner.close();
    }
}



