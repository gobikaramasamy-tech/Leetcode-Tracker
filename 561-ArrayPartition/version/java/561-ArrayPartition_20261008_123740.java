// Last updated: 10/8/2026, 12:37:40 PM
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        int max = nums[0], min = nums[0];
4        int n = nums.length;
5
6        // Find min and max to determine counting array size
7        for (int i = 1; i < n; i++) {
8            if (max < nums[i]) max = nums[i];
9            if (min > nums[i]) min = nums[i];
10        }
11
12        int l = max - min + 1;
13        int[] c = new int[l];
14
15        // Build frequency (counting) array
16        for (int i = 0; i < n; i++) {
17            c[nums[i] - min]++;
18        }
19
20        int sum = 0;
21        boolean s = false;  // Carry flag for odd leftover from previous value
22
23        // Simulate sorted pairing using counting array
24        for (int k = 0; k < l; k++) {
25            if (c[k] != 0) {
26                int a = c[k];
27
28                // If there's a carry from previous value, consume one unit
29                if (s) a--;
30
31                // Number of complete pairs at this value contributes to sum
32                sum += ((a + 1) / 2) * (k + min);
33
34                // Update carry flag: true if leftover count is odd
35                s = a % 2 == 1;
36            }
37        }
38
39        return sum;
40    }
41}