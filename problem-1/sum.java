import java.util.Scanner;

public class Solution{
    public int[] sum(int[]nums , int target){
        for(int i=0; i< nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if( nums[i] + nums[j] == target){
                    return new int[] {i , j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the number of arrays:");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        Solution solution = new Solution();
        int[] result = solution.sum(nums, target);

        if(result.length == 2){
            System.out.println("Indices : [" +result[0]+ " ," +result[1]+ " ]");
        }   
        else{
             System.out.println("No two sum solution found.");
        }
    }
}