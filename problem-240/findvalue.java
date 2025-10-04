import java.util.Scanner;

public class findvalue {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1; 

        while (row < m && col >= 0) {
            int value = matrix[row][col]; 

            if (value == target) {
                return true;
            } else if (value > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the elements of the matrix row by row (sorted):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Input target
        System.out.print("Enter target to search: ");
        int target = scanner.nextInt();

        // Search and output result
        boolean result = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found? " + result);
    }
}
