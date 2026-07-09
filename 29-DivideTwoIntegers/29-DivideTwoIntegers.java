// Last updated: 7/9/2026, 3:20:16 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 2147483647 && divisor == -1)
            return -2147483647;

        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        long d = Math.abs((long)dividend);
        long ds = Math.abs((long)divisor);

        int count = 0;

        while(d >= ds){
            d -= ds;
            count++;
        }

        if(dividend < 0 && divisor > 0)
            return -count;
        else if(dividend > 0 && divisor < 0)
            return -count;

        return count;
    }
}