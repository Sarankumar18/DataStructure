public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        // Sort points based on their start coordinates
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        int arrow = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrow++;
                end = points[i][1];
            } else {
                end = Math.min(end, points[i][1]);
            }
        }

        return arrow;
    }
}