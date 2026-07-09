// Last updated: 7/9/2026, 3:13:30 PM
class Solution {
    public int findDelayedArrivalTime(int a, int b) {
        if(a+b>=24)
           return (a+b)-24;
           else
           return a+b;
        
    }
}