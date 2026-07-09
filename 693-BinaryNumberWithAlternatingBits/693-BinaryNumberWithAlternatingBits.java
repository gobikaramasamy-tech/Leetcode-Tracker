// Last updated: 7/9/2026, 3:15:09 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int y=0;
        y=n>>1;
        while(n!=0){
            if((n&1)==(y&1))
           break; 
           n= n>>1;
           y=y>>1;
          
        }
        if(n==0)
         return true;
         else return false;
           
        
    }
}