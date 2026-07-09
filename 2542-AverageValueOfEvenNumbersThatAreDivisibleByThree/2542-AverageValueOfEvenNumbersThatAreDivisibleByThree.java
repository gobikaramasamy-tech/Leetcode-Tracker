// Last updated: 7/9/2026, 3:13:46 PM
class Solution {
    public int averageValue(int[] nums) {
        int c=0;
        int s=0;
        for(int i:nums){
            if(i%2==0&&i%3==0){
                s+=i;
                c++;
            }
        }
        return c==0?0:s/c;

    }
}