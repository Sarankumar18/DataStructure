class Solution {
    public int islandPerimeter(int[][] grid) {
  // Initialize perimter to 0
    int perimeter = 0;

    // Go through every value and check surroundings
    for(int row=0; row<grid.length; row++) {
        for(int col=0; col<grid[0].length; col++) {

            // Check all four surroundings if part of island
            if(grid[row][col] == 1) {

                // Add four initially
                perimeter+=4;

                // Begin decreasing from 4 if each side is NOT a perimeter

                // Left
                if(row-1 >= 0 && grid[row-1][col] == 1) perimeter -=1;

                // Top
                if(col-1 >= 0 && grid[row][col-1] == 1) perimeter -=1;

                // Right
                if(row+1 < grid.length && grid[row+1][col] == 1) perimeter -=1;

                // Bottom
                if(col+1< grid[0].length && grid[row][col+1] == 1) perimeter -=1;
            }
        }
    }
    return perimeter;
    }
}