class Solution {
    public static int findDays(int weights[], int cap){
        int days =1;
        int load =0;
        for(int i =0; i< weights.length; i++){
            if(load + weights[i] > cap){
                load = weights[i];
                days++;
            }else{
                load += weights[i];
            }
        }

        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        for(int weight : weights){
            low = Math.max(low,weight);
        }
        int high =0;
        for(int weight : weights){
            high += weight;
        }
        while(low <= high){
            int mid = (low +high)/2;
            if(findDays(weights,mid) <= days){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
     return low;   
    }
}