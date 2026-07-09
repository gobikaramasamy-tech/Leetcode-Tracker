// Last updated: 7/9/2026, 3:17:52 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t=0;
        int r=0;
        int a=0;
        for(int i=0;i<gas.length;i++){
            t+=gas[i] -cost[i];
            r+=gas[i] - cost[i];
            if(r<0){
                r=0;
                a=i+1;
            }
        }
        return t>=0 ? a:-1;
        
    }
}