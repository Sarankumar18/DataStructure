class Solution {
    public int lengthOfLastWord(String s) {
        String myString = s.trim();
        int len = 0;
        for(int i = myString.length()-1; i >= 0; i--){
            if(myString.charAt(i) == ' '){
                return len;
            }
            len++;
        }
        return len;
    }
}