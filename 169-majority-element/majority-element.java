class Solution {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int ele = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            if(vote == 0){
                ele = nums[i];
                vote++;
            }
            else if(ele == nums[i] ){
                vote++;
            }else{
                vote--;
            }
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
            
        return -1;

    }
}