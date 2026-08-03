public class TASK5 {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int num1 = 100;
        double implicitCast = num1;

        System.out.println("----- Implicit Type Casting -----");
        System.out.println("Before Casting (int)    : " + num1);
        System.out.println("After Casting (double)  : " + implicitCast);

        // Explicit Type Casting (Narrowing)
        double num2 = 99.99;
        int explicitCast = (int) num2;

        System.out.println("\n----- Explicit Type Casting -----");
        System.out.println("Before Casting (double) : " + num2);
        System.out.println("After Casting (int)     : " + explicitCast);
    }
}