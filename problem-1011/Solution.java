import java.util.Scanner;

public class Solution {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking weights input
        System.out.print("Enter number of packages: ");
        int n = scanner.nextInt();
        int[] weights = new int[n];
        System.out.println("Enter the weights of packages:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        // Taking number of days input
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        Solution sol = new Solution();
        int minCapacity = sol.shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity required: " + minCapacity);

        scanner.close();
    }

    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w);  // max single package weight
            right += w;                // sum of all weights
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int current = 0;
        int requiredDays = 1;

        for (int w : weights) {
            if (current + w > capacity) {
                requiredDays++;
                current = 0;
            }
            current += w;
        }

        return requiredDays <= days;
    }
}
