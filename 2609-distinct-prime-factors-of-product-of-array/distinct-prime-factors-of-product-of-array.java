class Solution {
    public int distinctPrimeFactors(int[] nums) {
        int n = nums.length;
        Set<Integer> primes = new HashSet<>();
        for(int i =0; i<n; i++){
            primeFactors(primes,nums[i]);
        }
        return primes.size();
    }
public void primeFactors(Set<Integer> prime , int n){

        for(int i=2 ; i <= n; i++){
            if(n % i == 0){
                prime.add(i);
                while(n % i == 0){
                    n /= i;
                }
            }
        }
    }
    
}