// Last updated: 7/9/2026, 3:16:33 PM
class Solution {
    public int addDigits(int num) {
        
        if(num!=0&&num%9==0)
        return 9;
        else
        return(num%9);
        
    }
}