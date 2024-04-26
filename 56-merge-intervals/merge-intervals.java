class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];

        ArrayList<int []> ans = new ArrayList<>();
        for(int [] interval : intervals){
            if(end >= interval[0]){
                end = Math.max(end, interval[1]);
            }else{
                ans.add(new int[]{start,end});
                start = interval[0];
                end = interval[1];
            }
        }
        ans.add(new int[]{start,end});

        return ans.toArray(new int[0][]);
    }
}