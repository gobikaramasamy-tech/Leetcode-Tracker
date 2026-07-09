// Last updated: 7/9/2026, 3:18:02 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int minBuyprice = prices[0];
        for(int i=1;i<prices.length;i++){
            int sellprice = prices[i];
            if(sellprice   > minBuyprice){
                int p= sellprice - minBuyprice;
                if(p>maxp) maxp =p;
            }else{
                minBuyprice=sellprice;

            }
        }
        return maxp;
    }
}