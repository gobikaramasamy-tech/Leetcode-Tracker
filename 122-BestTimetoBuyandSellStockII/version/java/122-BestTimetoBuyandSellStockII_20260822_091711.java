// Last updated: 8/22/2026, 9:17:11 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int p=0;
4        for(int i=1;i<prices.length;i++){
5            if(prices[i]>prices[i-1]){
6                p+=prices[i]-prices[i-1];
7            }
8        }
9        return p;
10    }
11}