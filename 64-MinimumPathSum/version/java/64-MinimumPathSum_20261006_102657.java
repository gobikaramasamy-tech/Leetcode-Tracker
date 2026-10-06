// Last updated: 10/6/2026, 10:26:57 AM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        int [][] dp=new int[n][m];
6        
7        dp[0][0]=grid[0][0];
8        for(int i=1;i<n;i++){
9            dp[i][0]=dp[i-1][0]+grid[i][0];
10        }
11        for(int i=1;i<m;i++){
12            dp[0][i]=dp[0][i-1]+grid[0][i];
13        }
14        for(int i=1;i<n;i++){
15            for(int j=1;j<m;j++){
16                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
17            }
18        }
19        return dp[n-1][m-1];
20    }
21}