// Last updated: 7/9/2026, 3:17:00 PM
class Solution 
{
    public boolean isHappy(int n)
     {
        int slow = n, fast = n;

        while (true) 
        {
            slow = sumOfSquares(slow);                  
            fast = sumOfSquares(sumOfSquares(fast));     

            if (slow == 1 || fast == 1)
             return true;    
            if (slow == fast)
             return false;              
        }
    }
     private int sumOfSquares(int n) 
    {
        int sum = 0;
        while (n != 0) 
        {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}