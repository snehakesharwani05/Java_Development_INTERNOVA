class Employee {
    // Attributes
    int employeeId;
    String employeeName;
    String department;
    double salary;

    // Default Constructor
    Employee() {
        employeeId = 0;
        employeeName = "Unknown";
        department = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized Constructor
    Employee(int employeeId, String employeeName, String department, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee information
    void displayInfo() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : ₹" + salary);
        System.out.println("------------------------------");
    }
}

public class EmployeeInformation {
    public static void main(String[] args) {

        // Object created using default constructor
        Employee employee1 = new Employee();

        // Objects created using parameterized constructor
        Employee employee2 = new Employee(101, "Rahul Sharma", "IT", 55000);
        Employee employee3 = new Employee(102, "Priya Singh", "HR", 50000);

        // Display information
        System.out.println("Employee 1 - Default Constructor");
        employee1.displayInfo();

        System.out.println("Employee 2 - Parameterized Constructor");
        employee2.displayInfo();

        System.out.println("Employee 3 - Parameterized Constructor");
        employee3.displayInfo();
    }
}