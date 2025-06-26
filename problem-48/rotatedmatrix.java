public class rotatedmatrix {
    public void rotate(int[][]matrix){
        for(int i= 0 ; i<n; i++){
            for(j = i +1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
             }
        }
        for(int i=0;i<n;i++){
            for(j= i+1; k = n-1; j<k; j++; k--){
                int temp = matric[i][j];
                matrix[i][j] = matrix[i][k];
                matrxi[i][k] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotatedmatrix rm = new rotatedmatrix();
        rm.rotate(matrix);
        System.out.println("Rotated Matrix:");
        for (int[] row : matrix1) {
            System.out.println(Arrays.toString(row));
        }

    }
}