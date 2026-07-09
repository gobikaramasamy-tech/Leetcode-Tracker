// Last updated: 7/9/2026, 3:19:41 PM
class Solution {
    public double myPow(double x, int n) {
     long N = n;
     if(N<0){
        x=1/x;
        N=-N;
     }
     double result = 1.0;
     double c=x;
     while(N>0){
        if(N%2==1){
            result *= c;
        }
        c*=c;
        N/=2;
     }
     return result;
    
    }
}