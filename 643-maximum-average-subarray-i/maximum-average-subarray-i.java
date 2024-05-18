class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = -Double.MAX_VALUE;
        double windowSum =0;
        int windowStart =0;
        for(int windowEnd =0; windowEnd < nums.length; windowEnd++){
            windowSum += nums[windowEnd];

            if(windowEnd >= k -1){
                double curAverage = windowSum / k;
                maxAverage = Math.max(curAverage, maxAverage);
                windowSum -= nums[windowStart++];

            }
        }
        return maxAverage;
    }
}