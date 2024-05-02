class Solution {

    // arr1 = [6,9,12]
    // arr2 = [1,3,4]
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int mergeSort(int nums[], int low, int high){
        int count =0;
        if(low >= high) return count;
            int mid = (low + high)/2;
            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid+1, high);
            count += countPairs(nums, low, mid, high);
             merge(nums, low, mid, high);
        
        return count;
    }

    public static void merge(int nums[], int low, int mid, int high){
        int left = low; 
        int right = mid +1;
        int temp[] = new int[high - low +1];
        int i =0;
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp[i++] = nums[left++];
            }else{
                temp[i++] = nums[right++];
            }
        }
        while(left <= mid){
             temp[i++] = nums[left++];
        }

        while(right <= high){
            temp[i++] = nums[right++];
        }
         i =0;
        for(int j = low; j <= high; j++){
            nums[j] = temp[i++];
        }
 
    }

    public static int countPairs(int nums[], int low, int mid, int high){
        int right = mid +1;
        int count  =0;

        for(int i = low; i <= mid; i++){

            while(right <= high && (long) nums[i] > (long)2 * nums[right] ) right++;
            count += (right - (mid +1));
        }

        return count;
    }
}