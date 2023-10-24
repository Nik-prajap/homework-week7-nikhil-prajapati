package HomeWork_Week7_Nikhil_Prajapati;

/**
 * Input student Name, roll no, and three subjects Math, Science and English Marks.
 * Marks is between 0 to 100,
 * and if it is out of range print error message - "Invalid Input - Marks should be between 0 to 100"
 * Find out total, percentage and result.
 * if person is pass or fail on basis of percentage (pass>=35) and
 * also give them grade if %>=80 A+,
 * give if %>=60 than A
 * give if %>=50 than B
 * and %>=35 than C
 * And Print Mark Sheet in Given Format.
 */import java.util.Scanner;


class Student {
    private String name;
    private int rollNumber;
    private int mathMarks;
    private int englishMarks;
    private int scienceMarks;
    private double totalMarks;
    private double percentage;
    private String result;
    private String grade;

    public Student(String name, int rollNumber, int mathMarks, int englishMarks, int scienceMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mathMarks = mathMarks;
        this.englishMarks = englishMarks;
        this.scienceMarks = scienceMarks;

        this.totalMarks = mathMarks + englishMarks + scienceMarks;
        this.percentage = (totalMarks / 300) * 100;

        if (mathMarks >= 0 && mathMarks <= 100 && englishMarks >= 0 && englishMarks <= 100 && scienceMarks >= 0 && scienceMarks <= 100) {
            if (percentage >= 40) {
                this.result = "Pass";
                if (percentage >= 90) {
                    this.grade = "A+";
                } else if (percentage >= 80) {
                    this.grade = "A";
                } else if (percentage >= 70) {
                    this.grade = "B";
                } else {
                    this.grade = "C";
                }
            } else {
                this.result = "Fail";
                this.grade = "F";
            }
        } else {
            this.result = "Invalid marks";
            this.grade = "N/A";
        }
    }

    public void printMarkSheet() {
        System.out.println("__________________________________________________");
        System.out.println("|                                                 |");
        System.out.println("|                    Mark Sheet                   |");
        System.out.println("|_________________________________________________|");
        System.out.println("|     Name              : " + name + "                     |");
        System.out.println("|     Roll Number       : " + rollNumber + "                      |");
        System.out.println("|_________________________________________________|");
        System.out.println("|     Subjects          :         Marks           |");
        System.out.println("|_________________________________________________|");
        System.out.println("|     Math Marks        : " + mathMarks + "                      |");
        System.out.println("|     English Marks     : " + englishMarks + "                      |");
        System.out.println("|     Science Marks     : " + scienceMarks + "                      |");
        System.out.println("|_________________________________________________|");
        System.out.println("|     Total Marks       : " + totalMarks + "                    |");
        System.out.println("|_________________________________________________|");
        System.out.println("|     Percentage        : " + percentage + "%" + "                    |");
        System.out.println("|     Result            : " + result + "                     |");
        System.out.println("|     Grade             : " + grade + "                       |");
        System.out.println("|_________________________________________________|");


    }
}

public class Programme_3_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter Math Marks (0-100): ");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter English Marks (0-100): ");
        int englishMarks = scanner.nextInt();
        System.out.print("Enter Science Marks (0-100): ");
        int scienceMarks = scanner.nextInt();

        Student s1 = new Student(name, rollNumber, mathMarks, englishMarks, scienceMarks);
        s1.printMarkSheet();

        // Close the Scanner
        scanner.close();
    }
}