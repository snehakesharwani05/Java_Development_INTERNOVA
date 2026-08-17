import java.util.Scanner;

// Parent class
class Employee {
    String name;
    int employeeId;
    double salary;

    // Constructor
    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Parent class method
    void displayEmployeeDetails() {
        System.out.println("Name        : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.printf("Salary      : Rs. %.2f%n", salary);
    }
}

// Child class 1
class Developer extends Employee {
    String programmingLanguage;

    // Constructor
    Developer(String name, int employeeId, double salary,
              String programmingLanguage) {

        // Calling parent constructor
        super(name, employeeId, salary);

        this.programmingLanguage = programmingLanguage;
    }

    // Developer-specific method
    void displayDeveloperDetails() {
        displayEmployeeDetails(); // Parent method
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

// Child class 2
class Manager extends Employee {
    int teamSize;

    // Constructor
    Manager(String name, int employeeId, double salary, int teamSize) {

        // Calling parent constructor
        super(name, employeeId, salary);

        this.teamSize = teamSize;
    }

    // Manager-specific method
    void displayManagerDetails() {
        displayEmployeeDetails(); // Parent method
        System.out.println("Team Size   : " + teamSize);
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Developer input
        System.out.println("Enter Developer Details");

        System.out.print("Name: ");
        String devName = sc.nextLine();

        System.out.print("Employee ID: ");
        int devId = sc.nextInt();

        System.out.print("Salary: ");
        double devSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Programming Language: ");
        String language = sc.nextLine();

        Developer developer =
                new Developer(devName, devId, devSalary, language);

        // Manager input
        System.out.println("\nEnter Manager Details");

        System.out.print("Name: ");
        String managerName = sc.nextLine();

        System.out.print("Employee ID: ");
        int managerId = sc.nextInt();

        System.out.print("Salary: ");
        double managerSalary = sc.nextDouble();

        System.out.print("Team Size: ");
        int teamSize = sc.nextInt();

        Manager manager =
                new Manager(managerName, managerId, managerSalary, teamSize);

        // Display details
        System.out.println("\n===== DEVELOPER DETAILS =====");
        developer.displayDeveloperDetails();

        System.out.println("\n===== MANAGER DETAILS =====");
        manager.displayManagerDetails();

        sc.close();
    }
}