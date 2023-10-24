package HomeWork_Week7_Nikhil_Prajapati;

// Java program to sum values of an array

public class Programme_18_Sum_Values_Of_Array {

    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 8, 12, 3, 7, 10};

        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Print the sum
        System.out.println("Sum of the array elements : " + sum);
    }
}