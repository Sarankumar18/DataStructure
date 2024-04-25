class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
    }

    static void mergeSort(int[] nums, int low, int high){
        if(low >= high)
            return;
        int mid = (low + high) /2;
        mergeSort(nums,low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }

    static void merge(int[] nums, int low,int mid, int high){
        int left = low;
        int right = mid+1;
        int temp[] = new int[high+1];
        int k =0;
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp[k++] = nums[left++];
            }else{
                temp[k++] = nums[right++];
            }
        }

        while(left <= mid){
            temp[k++] = nums[left++];
        }
        while(right <= high){
            temp[k++] = nums[right++];
        }

        k=0;
        for(int i=low; i<= high; i++ ){
            nums[i] = temp[k++];
        }
    }
}