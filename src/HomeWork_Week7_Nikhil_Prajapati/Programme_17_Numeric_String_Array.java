package HomeWork_Week7_Nikhil_Prajapati;

//Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Programme_17_Numeric_String_Array {

    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {4, 2, 8, 1, 6, 3, 5};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // String array
        String[] stringArray = {"nimesh", "mehul", "urveel", "dhara", "indu"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
