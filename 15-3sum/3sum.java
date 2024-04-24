class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        

        // Set<List<Integer>> st = new HashSet<>();

        // for(int i =0; i< nums.length; i++){
        //     Set<Integer> hashSet = new HashSet<>();
        //     for(int j = i+1; j < nums.length; j++){
        //         int third = -(nums[i] + nums[j]);
        //         if(hashSet.contains(third)){
        //             List<Integer> list = Arrays.asList(nums[i],nums[j],third);
        //             list.sort(null);
        //             st.add(list);
        //         }
        //         hashSet.add(nums[j]);
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans; 


        //Three Pointer Approach

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i< nums.length; i++){

            //skip the deuplicates of i
            if(i != 0 && nums[i] == nums[i -1]) continue;

            int j = i +1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    List<Integer> list = Arrays.asList(nums[i], nums[j],nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                     while(j < k  && nums[j] == nums[j-1]) j++;
                     while(j < k && nums[k] == nums[k+1]) k--;
                }

               

            }
        }

        return ans;
    }
}