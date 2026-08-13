
public class MethodOperations {

    // Method to find the square of a number
    static int square(int num) {
        return num * num;
    }

    // Method to find the cube of a number
    static int cube(int num) {
        return num * num * num;
    }

    // Method to find the average of three numbers
    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Method to find the maximum of two numbers
    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        // Calling the methods with parameters
        int num = 5;

        int num1 = 10;
        int num2 = 20;

        double a = 15;
        double b = 25;
        double c = 35;

        System.out.println("----- Method Operations -----");

        System.out.println("Number       : " + num);
        System.out.println("Square       : " + square(num));
        System.out.println("Cube         : " + cube(num));

        System.out.println("\nThree Numbers: " + a + ", " + b + ", " + c);
        System.out.println("Average      : " + average(a, b, c));

        System.out.println("\nTwo Numbers  : " + num1 + ", " + num2);
        System.out.println("Maximum      : " + maximum(num1, num2));
    }
}


