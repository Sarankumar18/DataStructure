class Solution {
    public void rotate(int[][] matrix) {

        //[1,2,3]                       [1,4,7]                         [7,4,1]
        //[4,5,6]  -> transform         [2,5,8]  -> reverse the row     [8,5,2]
        //[7,8,9]                       [3,6,9]                         [9,6,3]
        
        int n = matrix.length;
        int m = matrix[0].length;
        //transfose

        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }        

        //reverse
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}