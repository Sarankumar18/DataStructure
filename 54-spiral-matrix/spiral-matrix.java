class Solution {
    public List<Integer> spiralOrder(int[][] mat) {

        // [1, 2, 3,  4]
        // [5, 6, 7,  8]
        // [9, 10,11, 12]

        int top =0;
        int bottom = mat.length-1;
        int left =0;
        int right = mat[0].length-1;
        List<Integer> list = new ArrayList<Integer>();
        while(top <= bottom && left <= right){

            //from left to right
            for(int i = left; i <= right; i++){
                list.add(mat[top][i]);
            }
            top++;

            //From top to bottom
            for(int i = top; i<=bottom; i++){
                list.add(mat[i][right]);
            }
            right--;

            //Right to Left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }

            //From bottom to top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(mat[i][left]);
                }
                left++;
            }
        }

        return list;
        
    }
}