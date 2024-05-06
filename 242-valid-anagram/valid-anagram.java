class Solution {
    public boolean isAnagram(String s, String t) {
        

        int freq1[] = new int[26];

        for(int i =0; i<s.length(); i++){
            freq1[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            freq1[t.charAt(i) - 'a']--;
        }

        for(int num : freq1){
            if(num != 0)
                return false;
        }
        return true;
    }
}