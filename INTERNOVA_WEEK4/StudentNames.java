import java.util.ArrayList;
import java.util.Scanner;

public class StudentNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create ArrayList
        ArrayList<String> students = new ArrayList<>();

        System.out.println("======================================");
        System.out.println("       STUDENT NAME MANAGEMENT");
        System.out.println("======================================");

        // Add students
        students.add("Aarav");
        students.add("Priya");
        students.add("Rahul");
        students.add("Sneha");
        students.add("Ananya");

        System.out.println("\nStudents after adding:");
        displayStudents(students);

        // Add another student
        students.add("Rohan");

        System.out.println("\nAfter adding Rohan:");
        displayStudents(students);

        // Search for a student
        System.out.print("\nEnter student name to search: ");
        String searchName = scanner.nextLine();

        if (students.contains(searchName)) {
            System.out.println(searchName + " is present in the collection.");
        } else {
            System.out.println(searchName + " is not present in the collection.");
        }

        // Remove a student
        System.out.print("\nEnter student name to remove: ");
        String removeName = scanner.nextLine();

        if (students.remove(removeName)) {
            System.out.println(removeName + " has been removed successfully.");
        } else {
            System.out.println(removeName + " was not found.");
        }

        // Final collection
        System.out.println("\nFinal Student Collection:");
        displayStudents(students);

        scanner.close();
    }

    public static void displayStudents(ArrayList<String> students) {

        for (String student : students) {
            System.out.println("- " + student);
        }
    }
}