import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRecords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create HashMap
        HashMap<Integer, String> studentRecords = new HashMap<>();

        System.out.println("======================================");
        System.out.println("          STUDENT RECORDS");
        System.out.println("======================================");

        // Add student records
        studentRecords.put(101, "Aarav Sharma");
        studentRecords.put(102, "Priya Singh");
        studentRecords.put(103, "Rahul Verma");
        studentRecords.put(104, "Sneha Gupta");
        studentRecords.put(105, "Ananya Das");

        // Display all records
        System.out.println("\nAll Student Records:");

        displayRecords(studentRecords);

        // Search by Student ID
        try {
            System.out.print("\nEnter Student ID to search: ");
            int searchId = scanner.nextInt();

            if (studentRecords.containsKey(searchId)) {
                System.out.println(
                        "Student Found: " +
                        studentRecords.get(searchId)
                );
            } else {
                System.out.println(
                        "No student found with ID: " + searchId
                );
            }

        } catch (Exception e) {

            System.out.println("ERROR: Please enter a valid numeric Student ID.");
            scanner.nextLine();
        }

        // Remove student
        try {
            System.out.print("\nEnter Student ID to remove: ");
            int removeId = scanner.nextInt();

            if (studentRecords.containsKey(removeId)) {

                String removedStudent = studentRecords.remove(removeId);

                System.out.println(
                        removedStudent +
                        " with ID " +
                        removeId +
                        " has been removed."
                );

            } else {

                System.out.println(
                        "No student found with ID: " + removeId
                );
            }

        } catch (Exception e) {

            System.out.println("ERROR: Please enter a valid numeric Student ID.");
        }

        // Updated records
        System.out.println("\nUpdated Student Records:");

        displayRecords(studentRecords);

        scanner.close();
    }

    public static void displayRecords(
            HashMap<Integer, String> studentRecords) {

        if (studentRecords.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        for (Map.Entry<Integer, String> entry :
                studentRecords.entrySet()) {

            System.out.println(
                    "Student ID: " + entry.getKey() +
                    " | Name: " + entry.getValue()
            );
        }
    }
}