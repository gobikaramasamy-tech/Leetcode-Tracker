// Last updated: 7/18/2026, 8:13:15 PM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder b=new StringBuilder();
4        StringBuilder m=new StringBuilder();
5        StringBuilder a=new StringBuilder();
6        for(char c:s.toCharArray()){
7            if(c==y){
8                b.append(c);
9            }else if(c==x){
10                a.append(c);
11            }else{
12                m.append(c);
13            }
14        }
15        return b.toString() + m.toString()+a.toString();
16    }
17    
18}