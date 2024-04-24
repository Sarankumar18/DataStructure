class Solution {
    public boolean isSubsequence(String s, String t) {
    int j = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        boolean found = false;
        while (j < t.length()) {
            if (c == t.charAt(j)) {
                j++;
                found = true;
                break; // Exit the loop once the character is found
            }
            j++;
        }
        if (!found) {
            return false; // If the character is not found in t, return false
        }
    }
    return true; // All characters in s are found in t
}
}