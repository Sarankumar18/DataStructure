class Solution {
    public int[] sortedSquares(int[] nums) {
        int start =0;
        int end = nums.length -1;
        int highestSquareIndex = end;
        int sortedArray[] = new int[end +1];
        while(start <= end){
            int startSquare = nums[start] * nums[start];
            int endSquare  = nums[end] * nums[end];

            if(startSquare < endSquare){
                sortedArray[highestSquareIndex--] = endSquare;
                end--;
            }else{
                sortedArray[highestSquareIndex--] =  startSquare;
                start++;
            }
        }

        return sortedArray;
    }
}