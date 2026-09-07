import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("======================================");
        System.out.println("        SAFE CALCULATOR");
        System.out.println("======================================");

        while (continueProgram) {

            try {
                System.out.print("\nEnter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                System.out.println("\n----- Results -----");

                System.out.println("Addition       : " + (num1 + num2));
                System.out.println("Subtraction    : " + (num1 - num2));
                System.out.println("Multiplication : " + (num1 * num2));

                // Division by zero handling
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }

                System.out.println("Division       : " + (num1 / num2));
                System.out.println("Modulus        : " + (num1 % num2));

            } catch (InputMismatchException e) {

                System.out.println("\nERROR: Invalid input!");
                System.out.println("Please enter numbers only.");

                // Clear invalid input
                scanner.nextLine();

            } catch (ArithmeticException e) {

                System.out.println("\nERROR: " + e.getMessage());

            } finally {

                System.out.println("\n--------------------------------------");
            }

            // Ask whether user wants to continue
            while (true) {

                try {
                    System.out.print("Do you want to perform another calculation? (yes/no): ");
                    String answer = scanner.next();

                    if (answer.equalsIgnoreCase("yes")) {
                        break;
                    } else if (answer.equalsIgnoreCase("no")) {
                        continueProgram = false;
                        break;
                    } else {
                        System.out.println("Please enter only 'yes' or 'no'.");
                    }

                } catch (Exception e) {
                    System.out.println("Unexpected input error occurred.");
                    scanner.nextLine();
                }
            }
        }

        System.out.println("\nThank you for using Safe Calculator!");
        scanner.close();
    }
}
