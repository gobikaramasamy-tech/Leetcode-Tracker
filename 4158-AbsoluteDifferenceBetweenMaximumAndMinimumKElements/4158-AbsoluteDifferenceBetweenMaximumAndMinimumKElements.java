// Last updated: 7/9/2026, 3:13:05 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        long a=0;
        long b=0;
        for(int i=0;i<k;i++){
            a+=nums[i];
        }
        for(int i=nums.length-k;i<nums.length;i++){
            b+=nums[i];
        }
        return(int)Math.abs(b-a);
        
        
    }
}