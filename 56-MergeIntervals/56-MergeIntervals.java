// Last updated: 7/9/2026, 3:19:31 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0] - b[0]);
        int n =intervals.length;
        List<int[]>merge = new ArrayList<>();
        int[] prev = intervals[0];
        for(int i=0;i<n;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1] = Math.max(prev[1],intervals[i][1]);
            }else{
                merge.add(prev);
                prev = intervals[i];
            }
        }
        merge.add(prev);
        return merge.toArray(new int[merge.size()][]);
    }
}