package HomeWork_Week7_Nikhil_Prajapati;

/**Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) if
 * any other alphabet should be invalid entry
 */



import java.util.Scanner;

public class Programme_9_Print_City_Name_InSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet A to F : ");
        char alphabet = scanner.next().charAt(0);

        String cityName;

        switch (Character.toUpperCase(alphabet)) {
            case 'A':
                cityName = "Athens";
                break;
            case 'B':
                cityName = "Beijing";
                break;
            case 'C':
                cityName = "Cannes";
                break;
            case 'D':
                cityName = "Delhi";
                break;
            case 'E':
                cityName = "Edinburgh";
                break;
            case 'F':
                cityName = "Frankfurt";
                break;
            default:
                cityName = "Invalid entry";
        }

        System.out.println("City Name: " + cityName);

        scanner.close();
    }
}
