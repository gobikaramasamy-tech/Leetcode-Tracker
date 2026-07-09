// Last updated: 7/9/2026, 3:13:01 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int m=nums[nums.length/2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m){
                c++;
            }
        }
        return c==1;
    }
}