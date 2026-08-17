import java.util.Scanner;

// Part A: Method Overloading
class Calculator {

    // Method with 2 int parameters
    int calculate(int a, int b) {
        return a + b;
    }

    // Method with 2 double parameters
    double calculate(double a, double b) {
        return a + b;
    }

    // Method with 3 int parameters
    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

// Parent class
class Vehicle {

    // Parent method
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Child class 1
class Car extends Vehicle {

    // Method overriding
    @Override
    void start() {
        System.out.println("Car starts with a key or push button.");
    }
}

// Child class 2
class Bike extends Vehicle {

    // Method overriding
    @Override
    void start() {
        System.out.println("Bike starts with a self-start or kick.");
    }
}

// Main class
public class PolymorphismDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== PART A: METHOD OVERLOADING =====
        System.out.println("===== METHOD OVERLOADING =====");

        Calculator calculator = new Calculator();

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("calculate(int, int) = "
                + calculator.calculate(a, b));

        System.out.print("\nEnter first decimal number: ");
        double x = sc.nextDouble();

        System.out.print("Enter second decimal number: ");
        double y = sc.nextDouble();

        System.out.println("calculate(double, double) = "
                + calculator.calculate(x, y));

        System.out.print("\nEnter third integer: ");
        int c = sc.nextInt();

        System.out.println("calculate(int, int, int) = "
                + calculator.calculate(a, b, c));


        // ===== PART B: METHOD OVERRIDING =====
        System.out.println("\n===== METHOD OVERRIDING =====");

        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        vehicle.start();
        car.start();
        bike.start();

        sc.close();
    }
}
