class Solution {
    public int countBeautifulPairs(int[] nums) {
        int btPair =0;
        for(int i =0; i<nums.length; i++){
            String st ="";
            st += nums[i];
            int fd = nums[i] / (int)Math.pow(10,st.length()-1);
            System.out.println(fd);
            for(int j =i+1; j<nums.length; j++){
                String str ="";
                str += nums[j];
                int ld = str.charAt(str.length()-1) - '0';
                if(gcd(fd,ld) == 1)
                    ++btPair;
            }
        }

        return btPair;
    }

    public int gcd(int n1, int n2){
        if(n2 == 0)
            return n1;
        
        return gcd(n2, n1 % n2 );
    }
}