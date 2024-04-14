class Solution {
    public int maximalRectangle(char[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return 0;
    }

    int maxArea = 0;
    int[] heights = new int[matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
        // Update heights array based on current row
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == '1') {
                heights[j]++;
            } else {
                heights[j] = 0;
            }
        }
        // Calculate maximum rectangle area for current row
        maxArea = Math.max(maxArea, largestRectangleArea(heights));
    }

    return maxArea;
}

// Function to calculate the largest rectangle area in a histogram
private int largestRectangleArea(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    int maxArea = 0;
    int i = 0;

    while (i < heights.length) {
        if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
            stack.push(i++);
        } else {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, heights[top] * width);
        }
    }

    while (!stack.isEmpty()) {
        int top = stack.pop();
        int width = stack.isEmpty() ? i : i - stack.peek() - 1;
        maxArea = Math.max(maxArea, heights[top] * width);
    }

    return maxArea;
}
}