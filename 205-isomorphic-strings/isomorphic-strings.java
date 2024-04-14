class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (!map1.containsKey(charS)) {
                map1.put(charS, charT);
            } else {
                if (map1.get(charS) != charT)
                    return false;
            }

            if (!map2.containsKey(charT)) {
                map2.put(charT, charS);
            } else {
                if (map2.get(charT) != charS)
                    return false;
            }
        }

        return true;
    }
}