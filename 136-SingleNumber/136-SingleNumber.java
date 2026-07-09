// Last updated: 7/9/2026, 3:17:50 PM
class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            a=a^nums[i];
        }
        return a;
    }
}