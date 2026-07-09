// Last updated: 7/9/2026, 3:13:13 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int trun =1;
        while(x>=1&&y>=4){
            x-=1;
            y-=4;
            trun++;
        }
        if(trun%2==0) return "Alice";
        else return "Bob";
    }
}