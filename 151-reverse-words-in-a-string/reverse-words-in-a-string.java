class Solution {
    public String reverseWords(String s) {
        StringBuilder temp = new StringBuilder();
        String ss = "";
        boolean wordStarted = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                ss = s.charAt(i) + ss;
                wordStarted = true;
            } else if (wordStarted) {
                temp.append(ss).append(" ");
                ss = "";
                wordStarted = false;
            }
        }
        if (!ss.isEmpty()) {
            temp.append(ss);
        }
        return temp.toString().trim();
    }
}
