// Last updated: 7/25/2026, 4:02:52 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3
4        Arrays.sort(g);
5        Arrays.sort(s);
6
7        int i = 0, j = 0, cnt = 0;
8
9        while(i < g.length && j < s.length) {
10            
11            if(s[j] >= g[i]) {
12                cnt++;
13                i++;
14            }
15            j++;
16        }
17
18        return cnt;
19    }
20}