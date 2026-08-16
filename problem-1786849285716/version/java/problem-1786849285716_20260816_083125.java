// Last updated: 8/16/2026, 8:31:25 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int mD=Integer.MAX_VALUE;
4        int ans =-1;
5        for(int i=0;i<drones.length;i++){
6            int a=drones[i][0];
7            int b =drones[i][1];
8            int r=drones[i][2];
9            int d=Math.abs(a-target[0])+Math.abs(b-target[1]);
10            if(d<=r&&d<mD){
11                mD=d;
12                ans=i;
13            }
14        }
15        return ans;
16    }
17}