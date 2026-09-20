// Last updated: 9/20/2026, 8:25:10 AM
1class Solution {
2    public int countIntersectingIntervals(int[][] intervals) {
3        int c=0;
4        for(int i=0;i<intervals.length;i++){
5            for(int j=i+1;j<intervals.length;j++){
6                if(intervals[i][0]<=intervals[j][1] && intervals[j][0]<=intervals[i][1]){
7                    c++;
8                }
9            }
10        }
11        return c;
12        
13    }
14}