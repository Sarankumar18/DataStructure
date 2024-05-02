class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int preSum =0;
        int cnt =0;
        map.put(0,1);
        for(int num : nums){
            preSum += num;
            int remove = preSum - k;
            cnt += map.getOrDefault(remove,0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }
}