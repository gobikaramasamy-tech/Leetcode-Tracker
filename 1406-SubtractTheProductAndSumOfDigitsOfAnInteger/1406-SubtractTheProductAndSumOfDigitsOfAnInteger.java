// Last updated: 7/9/2026, 3:14:21 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int m=1;
        while(n>0){
            int last =n%10;
            s+=last;
            m*=last;
            n/=10;
        }
        return m-s;
    }
}