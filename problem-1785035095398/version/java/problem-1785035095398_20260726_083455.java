// Last updated: 7/26/2026, 8:34:55 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s>9*n){
4            return -1;
5        }
6        StringBuilder ans =new StringBuilder();
7        while(n>0){
8            int digit = Math.min(9,s);
9            ans.append(digit);
10            s-=digit;
11            n--;
12        }
13        return Integer.parseInt(ans.toString());
14    }
15}