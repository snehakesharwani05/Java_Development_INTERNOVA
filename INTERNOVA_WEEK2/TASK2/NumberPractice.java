
public class NumberPractice {
    public static void main(String[] args) {

        // 1. Print numbers from 1 to 100
        System.out.println("Numbers from 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        // 2. Print all even numbers between 1 and 100
        System.out.println("\n\nEven numbers between 1 and 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // 3. Print all odd numbers between 1 and 100
        System.out.println("\n\nOdd numbers between 1 and 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // 4. Calculate the sum of numbers from 1 to 100
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        System.out.println("\n\nSum of numbers from 1 to 100: " + sum);
    }
}


