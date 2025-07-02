public class sortedsearchmatrix{
    public boolean searchmatrix(int[][]matrix, int target){
        int m = matrix.length;
        int n= matrix[0].length;
        int left =0, right = m * n -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid/n][mid%n];

            if(midElement == target){
                return true;
            }else if(midElement < target){
                left = mid + 1;
        }
            else{
                right = mid - 1;
            }
        }        return false;
    }   
    public static void main(String[] args){
          Solution sol = new Solution();

        int[][] matrix1 = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target1 = 3;
        int target2 = 13;

        System.out.println("Searching for 3: " + sol.searchMatrix(matrix1, target1)); // true
        System.out.println("Searching for 13: " + sol.searchMatrix(matrix1, target2)); // false
    }
}