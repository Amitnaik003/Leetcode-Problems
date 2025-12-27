import java.util.Scanner;
   
public class minimimsotedarray {
    public static int findmin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) { 
            int mid = left + (right - left) / 2; 

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else { 
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int minElement = findmin(nums);
        System.out.println("The minimum element in the sorted array is: " + minElement);
    }
}
