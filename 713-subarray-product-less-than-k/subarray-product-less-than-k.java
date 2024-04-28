class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int start =0;
        int end =0; 
        int p =1;
        int res =0;
        while(end < nums.length){
            p *= nums[end];

            while( start < end && p >= k)
                p /= nums[start++];

            if(p < k){
                int len = end - start +1;
                res += len;
            }
            end++;
        }

        return res;
    }
}