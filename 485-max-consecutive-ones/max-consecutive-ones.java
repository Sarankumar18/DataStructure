class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int currentMax =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 1){
                currentMax++;
            }else{
                max = Math.max(currentMax,max);
                currentMax =0;
            }
        }
        
        return Math.max(currentMax,max);
    }
}