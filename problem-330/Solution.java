public class Solution{
    public int minpatches(int [] nums, int n){
        int miss = 1;
        int patches = 0;
        int  i = 0;
        while(miss <= n){
            if( i < nums.length && nums[i] <= miss){
                miss += nums[i];
                i++;
            }else{
                miss += miss;
                patches++;
            }
        }
        return patches;
    }
    public static void main(String[] args) {
        int [] nums = {1,5,10};
        int n = 20;
        Solution sol = new Solution();
        System.out.println(sol.minpatches(nums, n));
    }
}