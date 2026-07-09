// Last updated: 7/9/2026, 3:13:03 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int d=0;
        int s=0;
        while(n>0){
            int digit =n%10;
            d+=digit;
            s+=digit*digit;
            n/=10;
        }
        return (s-d)>=50;
    }
    
    
}