package HomeWork_Week7_Nikhil_Prajapati;

//Java program to test if an array contains a specific value.

public class Programme_20_Array_Specific_Value {

    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 8, 12, 3, 7, 10};

        // Value to search for
        int targetValue = 3;

        // Initialize a variable to store whether the array contains the target value
        boolean containsValue = false;

        // Iterate through the array to check if it contains the target value
        for (int number : numbers) {
            if (number == targetValue) {
                containsValue = true;
                break; // Exit the loop early, as we found the value
            }
        }

        // Check and print the result
        if (containsValue) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
