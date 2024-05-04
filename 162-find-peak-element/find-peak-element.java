class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n-2;

        if(n ==1) return 0;
        else if(nums[0] > nums[1] ) return 0;
        else if(nums[high] < nums[high+1]) return high+1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) return mid;
            else if(nums[mid] > nums[mid-1]) low = mid+1;
            else high = mid-1;
        }

        return -1;
    }
}