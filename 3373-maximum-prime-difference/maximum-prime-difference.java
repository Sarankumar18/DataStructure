class Solution {
    boolean n[] = new boolean[101];
    public void createSeive(){
        n[0] = false;
        n[1] = false;
        for(int i = 2 ; i < 101; i++ ){
            n[i] = true;
        }
        for(int i =2; i * i <= 100; i++){
           if(n[i]){
                for(int j = i * i; j <= 100; j+=i){
                    n[j] = false;
                }
           }
        }

    }

    public int maximumPrimeDifference(int[] nums) {
        createSeive();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            if(n[nums[i]]){
            min = Math.min(min,i);
            max = Math.max(max,i);
            }
        }
    
        return max-min;
    }
}