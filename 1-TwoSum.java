import java.util.Scanner;

public class 1-TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Nested loops to check every pair of elements
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of nums[i] and nums[j] equals the target, return their indices
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // Return an empty array (shouldn't happen since the problem guarantees a solution)
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input the target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Call the twoSum function
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);

        // Output the result
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found!");
        }

        scanner.close();
    }
}
