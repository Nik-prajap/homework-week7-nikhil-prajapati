package HomeWork_Week7_Nikhil_Prajapati;

// Write a java program to print the numbers between 1 to 100
// which can be divided by 3 and 5 separately.

public class Programme_11_Divided_By_3_And_5 {

    public static void main(String[] args) {
        System.out.println("Numbers divisible by both 3 and 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNumbers divisible by 3 or 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

