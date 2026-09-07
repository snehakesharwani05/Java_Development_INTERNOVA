import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

// Student Record Manager
public class StudentRecordManager {

    // HashMap stores Student ID and Student object
    private static HashMap<Integer, Student> students =
            new HashMap<>();

    // Scanner for user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("==============================================");
        System.out.println("          STUDENT RECORD MANAGER");
        System.out.println("==============================================");

        while (running) {

            displayMenu();

            try {

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewStudents();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        removeStudent();
                        break;

                    case 5:
                        displayUniqueCourses();
                        break;

                    case 6:
                        running = false;
                        System.out.println(
                                "\nThank you for using Student Record Manager!"
                        );
                        break;

                    default:
                        System.out.println(
                                "\nERROR: Invalid menu choice!"
                        );
                        System.out.println(
                                "Please select a number between 1 and 6."
                        );
                }

            } catch (Exception e) {

                System.out.println(
                        "\nERROR: Invalid input!"
                );

                System.out.println(
                        "Please enter a valid numeric choice."
                );

                // Clear invalid input
                scanner.nextLine();
            }

            System.out.println();
        }

        scanner.close();
    }

    // ==========================================
    // DISPLAY MENU
    // ==========================================

    private static void displayMenu() {

        System.out.println("----------------------------------------------");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Remove Student");
        System.out.println("5. Display Unique Courses");
        System.out.println("6. Exit");
        System.out.println("----------------------------------------------");
    }

    // ==========================================
    // ADD STUDENT
    // ==========================================

    private static void addStudent() {

        System.out.println("\n========== ADD STUDENT ==========");

        try {

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            // Validate ID
            if (id <= 0) {
                System.out.println(
                        "ERROR: Student ID must be a positive number."
                );
                return;
            }

            // Check unique ID
            if (students.containsKey(id)) {

                System.out.println(
                        "ERROR: Student ID " + id +
                        " already exists."
                );

                System.out.println(
                        "Student ID must be unique."
                );

                return;
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {

                System.out.println(
                        "ERROR: Student name cannot be empty."
                );

                return;
            }

            System.out.print("Enter Course: ");
            String course = scanner.nextLine().trim();

            if (course.isEmpty()) {

                System.out.println(
                        "ERROR: Course cannot be empty."
                );

                return;
            }

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age <= 0 || age > 100) {

                System.out.println(
                        "ERROR: Please enter a valid age."
                );

                return;
            }

            // Create Student object
            Student student =
                    new Student(id, name, course, age);

            // Store in HashMap
            students.put(id, student);

            System.out.println(
                    "\nStudent added successfully!"
            );

        } catch (java.util.InputMismatchException e) {

            System.out.println(
                    "ERROR: Invalid input."
            );

            System.out.println(
                    "Student ID and Age must be numeric."
            );

            scanner.nextLine();

        } catch (Exception e) {

            System.out.println(
                    "ERROR: Unable to add student."
            );

            scanner.nextLine();
        }
    }

    // ==========================================
    // VIEW STUDENTS
    // ==========================================

    private static void viewStudents() {

        System.out.println("\n========== ALL STUDENTS ==========");

        if (students.isEmpty()) {

            System.out.println(
                    "No student records available."
            );

            return;
        }

        System.out.println(
                "--------------------------------------------------"
        );

        System.out.printf(
                "%-10s %-20s %-20s %-5s%n",
                "ID",
                "Name",
                "Course",
                "Age"
        );

        System.out.println(
                "--------------------------------------------------"
        );

        for (Student student : students.values()) {

            StringBuilder output = new StringBuilder();

            output.append(
                    String.format(
                            "%-10d %-20s %-20s %-5d",
                            student.getId(),
                            student.getName(),
                            student.getCourse(),
                            student.getAge()
                    )
            );

            System.out.println(output);
        }

        System.out.println(
                "--------------------------------------------------"
        );

        System.out.println(
                "Total Students: " + students.size()
        );
    }

    // ==========================================
    // SEARCH STUDENT
    // ==========================================

    private static void searchStudent() {

        System.out.println("\n========== SEARCH STUDENT ==========");

        try {

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            if (id <= 0) {

                System.out.println(
                        "ERROR: Student ID must be positive."
                );

                return;
            }

            if (students.containsKey(id)) {

                Student student = students.get(id);

                StringBuilder result =
                        new StringBuilder();

                result.append("\nStudent Found!\n");
                result.append("------------------------------\n");
                result.append("Student ID : ")
                        .append(student.getId())
                        .append("\n");

                result.append("Name       : ")
                        .append(student.getName())
                        .append("\n");

                result.append("Course     : ")
                        .append(student.getCourse())
                        .append("\n");

                result.append("Age        : ")
                        .append(student.getAge())
                        .append("\n");

                result.append("------------------------------");

                System.out.println(result);

            } else {

                System.out.println(
                        "Student with ID " +
                        id +
                        " does not exist."
                );
            }

        } catch (java.util.InputMismatchException e) {

            System.out.println(
                    "ERROR: Student ID must be numeric."
            );

            scanner.nextLine();
        }
    }

    // ==========================================
    // REMOVE STUDENT
    // ==========================================

    private static void removeStudent() {

        System.out.println("\n========== REMOVE STUDENT ==========");

        try {

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            if (id <= 0) {

                System.out.println(
                        "ERROR: Student ID must be positive."
                );

                return;
            }

            if (students.containsKey(id)) {

                Student removedStudent =
                        students.remove(id);

                System.out.println(
                        "\nStudent removed successfully!"
                );

                System.out.println(
                        "Removed Student: " +
                        removedStudent.getName()
                );

                System.out.println(
                        "Student ID: " + id
                );

            } else {

                System.out.println(
                        "Student with ID " +
                        id +
                        " does not exist."
                );
            }

        } catch (java.util.InputMismatchException e) {

            System.out.println(
                    "ERROR: Student ID must be numeric."
            );

            scanner.nextLine();
        }
    }

    // ==========================================
    // DISPLAY UNIQUE COURSES
    // ==========================================

    private static void displayUniqueCourses() {

        System.out.println(
                "\n========== UNIQUE COURSES =========="
        );

        if (students.isEmpty()) {

            System.out.println(
                    "No students available."
            );

            return;
        }

        // HashSet automatically removes duplicates
        HashSet<String> uniqueCourses =
                new HashSet<>();

        // Add all student courses
        for (Student student : students.values()) {

            uniqueCourses.add(
                    student.getCourse()
            );
        }

        System.out.println(
                "\nUnique Courses:"
        );

        System.out.println(
                "------------------------------"
        );

        for (String course : uniqueCourses) {

            System.out.println(
                    "- " + course
            );
        }

        System.out.println(
                "------------------------------"
        );

        System.out.println(
                "Total Unique Courses: " +
                uniqueCourses.size()
        );
    }

    // ==========================================
    // STUDENT CLASS
    // ==========================================

    static class Student {

        private int id;
        private String name;
        private String course;
        private int age;

        // Constructor
        public Student(
                int id,
                String name,
                String course,
                int age) {

            this.id = id;
            this.name = name;
            this.course = course;
            this.age = age;
        }

        // Getter for ID
        public int getId() {
            return id;
        }

        // Getter for Name
        public String getName() {
            return name;
        }

        // Getter for Course
        public String getCourse() {
            return course;
        }

        // Getter for Age
        public int getAge() {
            return age;
        }
    }
}