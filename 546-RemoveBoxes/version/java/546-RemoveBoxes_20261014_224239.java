// Last updated: 10/14/2026, 10:42:39 PM
1class Solution {
2    int[][][] memo;
3    public int removeBoxes(int[] boxes) {
4        int n = boxes.length;
5        memo = new int[n][n][n];
6        return dp(boxes, 0, n - 1, 0);
7    }
8    int dp(int[] boxes, int l, int r, int k) {
9        if (l > r) return 0;
10        if (memo[l][r][k] > 0) return memo[l][r][k];
11        int lOrg = l, kOrg = k;
12
13        while (l+1 <= r && boxes[l] == boxes[l+1]) { // Increase both `l` and `k` if they have consecutive colors with `boxes[l]`
14            l += 1;
15            k += 1;
16        }
17        int ans = (k+1) * (k+1) + dp(boxes, l+1, r, 0); // Remove all boxes which has the same with `boxes[l]`
18        for (int m = l+1; m <= r; ++m) // Try to merge non-contiguous boxes of the same color together
19            if (boxes[m] == boxes[l])
20                ans = Math.max(ans, dp(boxes, m, r, k+1) + dp(boxes, l+1, m-1, 0));
21        return memo[lOrg][r][kOrg] = ans;
22    }
23}