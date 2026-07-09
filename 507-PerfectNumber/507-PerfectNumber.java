// Last updated: 7/9/2026, 3:15:34 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
            s+=i;
        }
        return s==num?true:false;
        
    }
}