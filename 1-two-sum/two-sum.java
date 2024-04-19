class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = -1;
        int y = -1;
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                x = map.get(target - nums[i]);
                y = i;
                break;
            }
            map.put(nums[i],i);
        }
        return new int[]{x,y};
    }
}