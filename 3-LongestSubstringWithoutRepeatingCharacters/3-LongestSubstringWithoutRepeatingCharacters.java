// Last updated: 7/9/2026, 3:20:59 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int a=0;
        for(int i=0;i<n;i++){
            int[] freq = new int[256];
            for(int j=i;j<n;j++){
                if(freq[s.charAt(j)]>0){
                    break;
                }else{
                    freq[s.charAt(j)]++;
                    a=Math.max(a,j-i+1);
                }
            }
        }
        return a;
        
    }
}