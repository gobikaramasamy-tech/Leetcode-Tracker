// Last updated: 7/9/2026, 3:17:10 PM
class Solution {
    public int hammingWeight(int n) {
        int a=0;
        while (n!=0){
            if((n&1)==1){
            a++;
            }
            n=n>>1;
        }
        return a;
        
    }
}