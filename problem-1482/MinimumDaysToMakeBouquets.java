import java.util.*;

public class MinimumDaysToMakeBouquets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input bloomDay array
        System.out.print("Enter number of flowers: ");
        int n = sc.nextInt();

        int[] bloomDay = new int[n];
        System.out.println("Enter bloom days:");
        for (int i = 0; i < n; i++) {
            bloomDay[i] = sc.nextInt();
        }

        // Input m and k
        System.out.print("Enter number of bouquets (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of adjacent flowers per bouquet (k): ");
        int k = sc.nextInt();

        // Call and print the result
        int result = minDays(bloomDay, m, k);
        System.out.println("Minimum number of days to make " + m + " bouquets: " + result);
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) return -1;

        int left = 1;
        int right = (int) 1e9;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean canMake(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0, flowers = 0;

        for (int day : bloomDay) {
            if (day <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}
