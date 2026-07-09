// Last updated: 7/9/2026, 3:14:05 PM
class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        int rev = 0;
        while(n>1){
        rev=n/2;
        count+=rev;
        n=n-rev;
        
    }
    return count;
    }
    
     }
