// Last updated: 7/9/2026, 3:16:51 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return (nums.length==set.size()) ? false : true;
    }
}