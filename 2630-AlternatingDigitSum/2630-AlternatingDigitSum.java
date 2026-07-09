// Last updated: 7/9/2026, 3:13:36 PM
class Solution {
    public int alternateDigitSum(int n) {
        String  s= String.valueOf(n);
        int sum=0;
        int k=1;
        for(int i=0;i<s.length();i++){
            int d= s.charAt(i) - '0';
            sum+=k*d;
            k=-k;

        }
        return sum;
        
    }
}