// Last updated: 8/22/2026, 9:10:34 AM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        int n = triangle.size();
4
5        int[][] dp = new int[n][n];
6
7        
8        for (int j = 0; j < n; j++) {
9            dp[n - 1][j] = triangle.get(n - 1).get(j);
10        }
11        for (int r = n - 2; r >= 0; r--) {
12            for (int i = 0; i <= r; i++) {
13                dp[r][i] = triangle.get(r).get(i)
14                         + Math.min(dp[r + 1][i], dp[r + 1][i + 1]);
15            }
16        }
17
18        return dp[0][0];
19    }
20}