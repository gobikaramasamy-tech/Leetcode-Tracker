// Last updated: 10/10/2026, 10:28:57 AM
1class Solution {
2    private int getReqNum(long a, long b, long n) {
3        int gap = 0;
4        while (a <= n) {
5            gap += Math.min(n + 1, b) - a;
6            a *= 10;
7            b *= 10;
8        }
9        return gap;
10    }
11
12    public int findKthNumber(int n, int k) {
13        long num = 1;
14        for (int i = 1; i < k;) {
15            int req = getReqNum(num, num + 1, n);
16            if (i + req <= k) {
17                i += req;
18                num++;
19            } else {
20                i++;
21                num *= 10;
22            }
23        }
24        return (int) num;
25    }
26}