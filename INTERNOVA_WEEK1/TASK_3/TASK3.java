import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter College Name: ");
        String collegeName = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        // Displaying the entered information
        System.out.println("\n===== Student Details =====");
        System.out.println("Full Name    : " + fullName);
        System.out.println("Age          : " + age);
        System.out.println("College Name : " + collegeName);
        System.out.println("Branch       : " + branch);
        System.out.println("City         : " + city);

        sc.close();
    }
}