// Last updated: 7/9/2026, 3:20:05 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int n=nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
        
        
    }
}