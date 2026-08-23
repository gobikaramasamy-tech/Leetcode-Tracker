// Last updated: 8/23/2026, 8:34:31 AM
1class Solution {
2    public boolean isPalindromic(String s) {
3        StringBuilder binary = new StringBuilder();
4        for(char c:s.toCharArray()){
5            int a=(int) c;
6            String b=String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
7            binary.append(b);
8        }
9        String str =binary.toString();
10        int l=0;
11        int r=str.length()-1;
12        while(l<r){
13            if(str.charAt(l)!=str.charAt(r)){
14                return false;
15            }
16            l++;
17            r--;
18        }
19        return true;
20    }
21}