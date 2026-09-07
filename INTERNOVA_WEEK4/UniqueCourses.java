import java.util.HashSet;
import java.util.Scanner;

public class UniqueCourses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create HashSet
        HashSet<String> courses = new HashSet<>();

        System.out.println("======================================");
        System.out.println("          UNIQUE COURSES");
        System.out.println("======================================");

        // Add courses
        courses.add("Java");
        courses.add("Python");
        courses.add("Data Structures");
        courses.add("Database Management");
        courses.add("Web Development");
        courses.add("Cloud Computing");
        courses.add("Artificial Intelligence");

        // Duplicate entries
        courses.add("Java");
        courses.add("Python");
        courses.add("Java");

        System.out.println("\nCourses after adding entries:");
        displayCourses(courses);

        System.out.println("\nTotal unique courses: " + courses.size());

        // Search course
        System.out.print("\nEnter a course to search: ");
        String searchCourse = scanner.nextLine();

        if (courses.contains(searchCourse)) {
            System.out.println(searchCourse + " is available in the HashSet.");
        } else {
            System.out.println(searchCourse + " is not available in the HashSet.");
        }

        System.out.println("\nNotice:");
        System.out.println("Duplicate course names were added,");
        System.out.println("but HashSet stored each course only once.");

        scanner.close();
    }

    public static void displayCourses(HashSet<String> courses) {

        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}