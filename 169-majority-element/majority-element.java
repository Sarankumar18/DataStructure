class Solution {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int ele = 0;

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
        }
        vote =0;
        for(int i =0; i< nums.length; i++){
            if(ele == nums[i]){
                vote++;
            }
        }
        if(vote >= nums.length/2)
            return ele;
        
        return -1;

    }
}