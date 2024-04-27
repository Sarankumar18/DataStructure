class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();    
        int b =0;
        int a =0;
        for(int i =0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }
                    set.add(grid[i][j]);
            }
        }
        int n = grid.length;
        for(int i =1; i<= n*n; i++){
            if(!set.contains(i)){
                b = i;
                break;
            }
        }
        return new int[]{a,b};
    }
}