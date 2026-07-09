// Last updated: 7/9/2026, 3:13:16 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int og=x;
        int a=0,b=0;
        while (x!=0){
            a=(x%10);
            b=b+a;
            x=x/10;
        }
        if(og%b==0) return b;
        else return -1;
    }
}