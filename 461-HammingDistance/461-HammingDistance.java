// Last updated: 7/9/2026, 3:15:39 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int a=0;
         int n=x^y;
         while(n!=0){
            if((n&1)==1)
            a++;
            n=n>>1;
         } 
       return a; 
    }
}