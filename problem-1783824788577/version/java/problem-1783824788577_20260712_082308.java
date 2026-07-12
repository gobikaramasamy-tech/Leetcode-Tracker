// Last updated: 7/12/2026, 8:23:08 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String[] s = startTime.split(":");
4        String[] e = endTime.split(":");
5        int ss = Integer.parseInt(s[0])*3600
6            +Integer.parseInt(s[1])*60
7            +Integer.parseInt(s[2]);
8        int es = Integer.parseInt(e[0])*3600
9            +Integer.parseInt(e[1])*60
10            +Integer.parseInt(e[2]);
11        return es-ss;
12        
13    }
14}