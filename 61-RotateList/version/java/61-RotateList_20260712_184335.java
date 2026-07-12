// Last updated: 7/12/2026, 6:43:35 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0;
5        int high = n - 1;
6
7        while (low <= high) {
8            int mid = low + (high - low) / 2;
9
10            if (nums[mid] == target) {
11                return true;
12            }
13
14            // Handle duplicate edge case
15            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
16                low++;
17                high--;
18            }
19
20            // Left half is sorted
21            else if (nums[low] <= nums[mid]) {
22                if (nums[low] <= target && target <= nums[mid]) {
23                    high = mid - 1;
24                } else {
25                    low = mid + 1;
26                }
27            }
28
29            // Right half is sorted
30            else {
31                if (nums[mid] <= target && target <= nums[high]) {
32                    low = mid + 1;
33                } else {
34                    high = mid - 1;
35                }
36            }
37        }
38
39        return false;
40    }
41}