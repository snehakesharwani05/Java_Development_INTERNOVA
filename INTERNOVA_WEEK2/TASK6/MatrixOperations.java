
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a 3 x 3 matrix
        int[][] matrix = new int[3][3];

        // Take matrix elements as input
        System.out.println("Enter elements of 3 x 3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\n----- Matrix -----");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate the sum of all elements
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + matrix[i][j];
            }
        }

        // Display the sum
        System.out.println("\nSum of all elements: " + sum);

        sc.close();
    }
}
