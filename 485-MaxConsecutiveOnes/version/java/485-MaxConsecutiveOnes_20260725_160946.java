// Last updated: 7/25/2026, 4:09:46 PM
1class Solution {
2    public String convertToBase7(int num) {
3        if(num==0)
4        {
5            return "0";
6        }
7        boolean negative=false;
8        if(num<0)
9        {
10            negative=true;
11            num=Math.abs(num);
12        }
13        StringBuilder ans=new StringBuilder();
14        while(num>0)
15        {
16            ans.append(num%7);
17            num=num/7;
18        }
19        if(negative)
20        {
21            ans.append("-");
22        }
23        return ans.reverse().toString();
24    }
25}