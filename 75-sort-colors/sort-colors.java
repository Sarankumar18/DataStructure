class Solution {
    public void sortColors(int[] nums) {
       int low = 0;
       int mid = 0;
       int high = nums.length-1;
       while(mid <= high){
        if(nums[mid] == 0){
            swap(nums,low,mid);
            low++;
            mid++;
        }else if(nums[mid] == 1){
            mid++;
        }else{
            swap(nums,mid,high);
            high--;
        }
       }
    }

    public static void swap(int nums[],int ind1, int ind2){
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }

    
}