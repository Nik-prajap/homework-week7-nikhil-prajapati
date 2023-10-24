package HomeWork_Week7_Nikhil_Prajapati;

// Java program to calculate the average value of array elements.

public class Programme_19_Calc_The_Avg_Value {

    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 8, 12, 3, 7, 10};

        // Initialize a variable to store the sum
        int sum = 0;

        // Calculate the sum of array elements
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the average
        System.out.println("Average of the array elements: " + average);
    }
}
