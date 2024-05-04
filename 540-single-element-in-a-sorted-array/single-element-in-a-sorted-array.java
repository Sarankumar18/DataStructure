class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int low =1;
        int high = nums.length-2;

        if(nums.length == 1) return nums[0];
        else if(nums[0] != nums[1]) return nums[0];
        else if(nums[high] != nums[high+1]) return nums[high+1];

        while(low <= high){
            int mid = (low + high) /2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1] ) return nums[mid];
            else if((mid % 2 == 0 && nums[mid] == nums[mid+1]) || (mid %2 ==1 && nums[mid] == nums[mid-1])){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return -1;
    }
}