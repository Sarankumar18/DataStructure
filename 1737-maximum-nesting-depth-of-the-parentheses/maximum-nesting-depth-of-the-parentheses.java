class Solution {
    public int maxDepth(String s) {
        int greater =0;
        int opened =0;
        for(char c : s.toCharArray()){
            if(c == '('){
                opened++;
                greater = Math.max(greater,opened);
            }else if(c == ')'){
                opened--;
            }
        }

        return greater;
    }
}