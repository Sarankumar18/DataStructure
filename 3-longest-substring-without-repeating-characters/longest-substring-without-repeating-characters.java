class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int windowStart =0;
        int maxLength =0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int windowEnd =0; windowEnd < s.length(); windowEnd++){
            char endChar = s.charAt(windowEnd);

            if(map.containsKey(endChar)){
                windowStart = Math.max(windowStart, map.get(endChar) + 1);

            }
            map.put(endChar, windowEnd);

            maxLength = Math.max(maxLength, windowEnd - windowStart +1);
        }

        return maxLength;
    }
}