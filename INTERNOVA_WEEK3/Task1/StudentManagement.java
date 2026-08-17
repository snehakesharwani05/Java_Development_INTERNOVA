class Student {
    // Attributes
    String studentName;
    int rollNumber;
    String branch;
    double cgpa;

    // Constructor
    Student(String studentName, int rollNumber, String branch, double cgpa) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Branch       : " + branch);
        System.out.println("CGPA         : " + cgpa);
        System.out.println("----------------------------");
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        // Creating three objects
        Student student1 = new Student("Sneha Kesharwani", 101, "CSE", 8.78);
        Student student2 = new Student("Rahul Sharma", 102, "CSE", 8.45);
        Student student3 = new Student("Priya Singh", 103, "CSE", 9.12);

        // Accessing attributes through objects
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}