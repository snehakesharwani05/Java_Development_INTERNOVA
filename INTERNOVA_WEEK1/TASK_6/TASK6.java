import java.util.Scanner;

public class TASK6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accepting input
        System.out.print("Enter an integer value: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        // Displaying original values
        System.out.println("\n===== Original Values =====");
        System.out.println("Integer : " + intValue);
        System.out.println("Float   : " + floatValue);
        System.out.println("Double  : " + doubleValue);

        // Implicit Type Casting (Widening)
        float intToFloat = intValue;
        double floatToDouble = floatValue;

        System.out.println("\n===== Implicit Type Casting =====");
        System.out.println("Integer to Float  : " + intToFloat);
        System.out.println("Float to Double   : " + floatToDouble);

        // Explicit Type Casting (Narrowing)
        int floatToInt = (int) floatValue;
        float doubleToFloat = (float) doubleValue;
        int doubleToInt = (int) doubleValue;

        System.out.println("\n===== Explicit Type Casting =====");
        System.out.println("Float to Integer  : " + floatToInt);
        System.out.println("Double to Float   : " + doubleToFloat);
        System.out.println("Double to Integer : " + doubleToInt);

        sc.close();
    }
}