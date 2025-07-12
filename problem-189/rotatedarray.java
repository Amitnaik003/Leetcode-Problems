import java.util.Arrays;

public class Main {
    public static void main(String[] args) { 
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        sol.rotate(nums1, 3); 
        System.out.println("Output 1: " + Arrays.toString(nums1)); // [5,6,7,1,2,3,4]

        int[] nums2 = {-1, -100, 3, 99};
        sol.rotate(nums2, 2);
        System.out.println("Output 2: " + Arrays.toString(nums2)); // [3,99,-1,-100]
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k > n
        reverse(nums, 0, n - 1);         // Step 1: Reverse entire array
        reverse(nums, 0, k - 1);         // Step 2: Reverse first k elements
        reverse(nums, k, n - 1);         // Step 3: Reverse rest
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
