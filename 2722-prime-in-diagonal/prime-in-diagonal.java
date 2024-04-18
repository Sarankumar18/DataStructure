class Solution {
    public static boolean isPrime(int a){
        if(a <= 1)
            return false;
        if(a % 2 == 0 && a != 2)
            return false;
        for(int i =3; i*i <= a; i+=2){
            if(a % i == 0)
                return false;
        }
        return true;
    }


    public int diagonalPrime(int[][] nums) {
        int ans = 0;
        for(int i =0; i < nums.length; i++){
             int a = nums[i][i];
             int b = nums[i][nums.length - i - 1];
             if(isPrime(a))
                ans = Math.max(ans,a);
            if(isPrime(b))
                ans = Math.max(ans,b);
        }

        return ans;
    }
}