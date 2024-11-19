import java.util.*;

public class MatrixColSum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int r = s.nextInt();
        int c = s.nextInt();
        
        int[][] a = new int[r][c];

        // Fill the array with random integers between 0 and 9 (excluding the last row)
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = (int)(Math.random() * 10); // Random number between 0 and 9
            }
        }

        // Calculate column sums and store in the last row
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r - 1; i++) {
                sum += a[i][j]; // Summing up the current column
            }
            a[r - 1][j] = sum; // Store the sum in the last row
        }

        // Display the array
        System.out.println("Generated Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
