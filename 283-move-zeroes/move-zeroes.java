class Solution {
    public void moveZeroes(int[] nums) {
    int leftMostZeroIndex = 0; 

    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {
        // If the current element is not zero
        if (nums[i] != 0) {
            // Swap the current element with the leftmost zero element (if any)
            int temp = nums[i];
            nums[i] = nums[leftMostZeroIndex];
            nums[leftMostZeroIndex] = temp;

            // Move the leftmost zero index to the next position
            leftMostZeroIndex++;
        }
    }
}
}