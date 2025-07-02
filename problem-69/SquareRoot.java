import java.util.Scanner;

public class SquareRoot {

    // Function to calculate integer square root
    public static int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int x = scanner.nextInt();

        if (x < 0) {
            System.out.println("Invalid input. Enter a non-negative integer.");
        } else {
            int sqrt = mySqrt(x);
            System.out.println("Integer square root of " + x + " is: " + sqrt);
        }
    }
}
