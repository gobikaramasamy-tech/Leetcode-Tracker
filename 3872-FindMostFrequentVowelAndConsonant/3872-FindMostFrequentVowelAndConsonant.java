// Last updated: 7/9/2026, 3:13:08 PM
class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
         int a=0,b=0;
         for(char c:s.toCharArray()){
            int i=c-'a';
            freq[i]++;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                a=Math.max(a,freq[i]);
            }
            else{
                b=Math.max(b,freq[i]);
            }
         }
         return(a+b);
    }
}