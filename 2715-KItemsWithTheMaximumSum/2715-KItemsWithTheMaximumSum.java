// Last updated: 7/9/2026, 3:13:31 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;
        else if(k<=(numOnes+ numZeros))
        return numOnes;
        else{
            int rem = k-(numZeros+numOnes);
            return numOnes-rem;
        }
    }
}