// Last updated: 10/9/2026, 10:15:48 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        Arrays.sort(nums);
4        for(int i = 0; i < nums.length-1; i+=3) {
5            if(nums[i] != nums[i+1]) return nums[i];
6        }
7        return nums[nums.length - 1];
8    }
9}