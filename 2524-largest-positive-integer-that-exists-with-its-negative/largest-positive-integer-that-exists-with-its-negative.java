class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = -1;
        for(int i =0; i< nums.length; i++){
            if(nums[i] < 0)
                map.put(nums[i], i);
        }

        for(int i =0 ; i<nums.length; i++){
            if(nums[i] > 0 && map.containsKey(-nums[i])){
                k = Math.max(k,nums[i]);
            }
        }
        return k;
    }
}