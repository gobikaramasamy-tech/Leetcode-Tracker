// Last updated: 7/9/2026, 3:15:40 PM
class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return 1;
        int count=1;
        while (n>0){
            count++;
            n=n-count;
            
        }
        return count -1;
    }
}