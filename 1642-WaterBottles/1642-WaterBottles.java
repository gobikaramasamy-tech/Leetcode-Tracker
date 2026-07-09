// Last updated: 7/9/2026, 3:14:08 PM
class Solution {
    public int numWaterBottles(int n, int ne) {
        int ans = 0,empty = 0;

        while (n > 0) {
            ans += n;          
            empty += n;        
            n = empty / ne;    
            empty = empty % ne;
        }
        return ans;
    }
}