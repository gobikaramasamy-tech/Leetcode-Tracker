// Last updated: 7/9/2026, 3:13:11 PM
class Solution {
    public boolean canAliceWin(int[] num) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<=num.length-1;i++){
            if(num[i]<10)
             sum1+=num[i];
             else
             sum2+=num[i];

        }
        if(sum1==sum2)
        return false;
        else 
        return true;

    }
}