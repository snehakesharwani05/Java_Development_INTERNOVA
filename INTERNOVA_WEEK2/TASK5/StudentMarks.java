
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a 1D array to store marks of 5 students
        int[] marks = new int[5];

        // Take marks as input
        System.out.println("Enter marks of 5 students:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Display all marks
        System.out.println("\n----- Student Marks -----");

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // Calculate total marks
        int total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }

        // Calculate average
        double average = (double) total / 5;

        // Find highest and lowest marks
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 1; i < 5; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        // Display results
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks   : " + total);
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}


