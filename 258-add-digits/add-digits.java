class Solution {
    public int addDigits(int num) {
        
        while(num >= 10){
            int latest = 0;
            while(num != 0){
                int last = num % 10;
                latest += last;
                num /= 10;
            }
            num = latest;
        }
        return num;
    }
}