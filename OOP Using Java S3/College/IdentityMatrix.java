package College;
import java.util.*;

public class IdentityMatrix {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter row and column size:");
    int row = s.nextInt();
    int column = s.nextInt();
    s.nextLine();

    // If it's not a square matrix, it can't be an identity matrix
    if (row != column) {
      System.out.println("Not an identity matrix (must be square).");
      return;
    }

    System.out.println("Enter elements of matrix:");
    int[][] a = new int[row][column];
    
    // Reading elements of the matrix
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        a[i][j] = s.nextInt();
      }
    }

    // Check if it's an identity matrix
    boolean isIdentity = true;
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if (i == j) {
          // Diagonal elements should be 1
          if (a[i][j] != 1) {
            isIdentity = false;
            break;
          }
        } else {
          // Off-diagonal elements should be 0
          if (a[i][j] != 0) {
            isIdentity = false;
            break;
          }
        }
      }
      if (!isIdentity) break;
    }

    // Output the result
    if (isIdentity) {
      System.out.println("It is an identity matrix.");
    } else {
      System.out.println("It is not an identity matrix.");
    }

    s.close();
  }
}
