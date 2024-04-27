class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longStreak =0;

        for(int num : nums){
           if(!set.contains(num-1)){
             int streak =1;
             int curNum = num;
             while(set.contains(curNum+1)){
                curNum++;
                streak++;
             }
             if(streak > longStreak) longStreak = streak;
           }
        }

        return longStreak;
    }
}