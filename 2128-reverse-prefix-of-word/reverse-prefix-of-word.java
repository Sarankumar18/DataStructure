class Solution {
    public String reversePrefix(String word, char ch) {

        int high = word.indexOf(ch);
        if(high != -1){  
            return  reverse(word,0,high);
        }

        return word;
        
    }

    public static String reverse(String word, int low, int high){
    StringBuilder reversed = new StringBuilder(word.substring(0, low));
    for (int i = high; i >= low; i--) {
        reversed.append(word.charAt(i));
    }
    reversed.append(word.substring(high + 1));
    return reversed.toString();
}
}