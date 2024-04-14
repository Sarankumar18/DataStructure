class Solution {
    //intution
    // Step:1 reverse entire aray
    //Step:2 reverse till k
    //Step3: reverse remaining elements
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k -1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int []nums, int start, int end){
       while(start < end){
            int temp = nums[end];
            nums[end--] = nums[start];
            nums[start++] = temp;
       }
    }
}