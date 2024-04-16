class Solution {
    public int smallestEvenMultiple(int n) {

       int smallestMultiple = n % 2 == 0 ? n : 2 * n;
    return smallestMultiple;
    }
}