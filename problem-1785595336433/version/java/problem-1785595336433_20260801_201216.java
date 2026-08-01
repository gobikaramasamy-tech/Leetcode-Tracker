// Last updated: 8/1/2026, 8:12:16 PM
1class Solution {
2    public int countValidPrefixes(String s) {
3        int a=0;
4        int b=0;
5        int c=0;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='0'){
8                a++;
9            }else{
10                b++;
11            }
12            if(Math.abs(a-b)<=1){
13                c++;
14            }
15        }
16        return c++;
17    }
18}