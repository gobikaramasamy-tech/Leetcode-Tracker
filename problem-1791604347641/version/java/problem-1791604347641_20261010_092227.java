// Last updated: 10/10/2026, 9:22:27 AM
1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums);
4        int l = 0, r = 1, res = 0;
5        while(r < nums.length) {
6            int diff = nums[r] - nums[l];
7            if(diff == 1) res = Math.max(res, r - l + 1);
8            if(diff <= 1) r++;
9            else l++;
10        }
11
12        return res;
13    }
14}