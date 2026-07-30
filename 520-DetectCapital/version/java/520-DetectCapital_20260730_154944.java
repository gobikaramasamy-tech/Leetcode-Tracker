// Last updated: 7/30/2026, 3:49:44 PM
1class Solution {
2    public boolean checkRecord(String s) {
3        int countA = 0, countL = 0;
4
5        for (char ch : s.toCharArray()) {
6            if (ch != 'L') countL = 0;
7            if (ch == 'L') countL++;
8            if (ch == 'A') countA++;
9            if (countA == 2 || countL == 3) return false;
10        }
11
12        return true;
13    }
14}