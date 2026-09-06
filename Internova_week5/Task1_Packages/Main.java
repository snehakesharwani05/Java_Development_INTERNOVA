import studentmanagement.Student;

public class Main {
    public static void main(String[] args) {

        // Creating Student object
        Student student = new Student(
            101,
            "Sneha Kesharwani",
            "B.Tech Computer Science and Engineering"
        );

        // Displaying student information
        student.displayStudentInfo();
    }
}