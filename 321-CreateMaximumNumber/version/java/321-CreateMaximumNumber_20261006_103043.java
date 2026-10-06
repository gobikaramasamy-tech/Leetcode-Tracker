// Last updated: 10/6/2026, 10:30:43 AM
1 /**  * Created by hrwhisper on 2015/11/23.  * http://www.hrwhisper.me/leetcode-create-maximum-number/  */
2
3
4public class Solution {
5    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
6        int get_from_nums1 = Math.min(nums1.length, k);
7        int[] ans = new int[k];
8        for (int i = Math.max(k - nums2.length, 0); i <= get_from_nums1; i++) {
9            int[] res1 = new int[i];
10            int[] res2 = new int[k - i];
11            int[] res = new int[k];
12            res1 = solve(nums1, i);
13            res2 = solve(nums2, k - i);
14            int pos1 = 0, pos2 = 0, tpos = 0;
15            
16            while (res1.length > 0 && res2.length > 0 && pos1 < res1.length && pos2 < res2.length) {
17                if (compare(res1, pos1, res2, pos2))
18                    res[tpos++] = res1[pos1++];
19                else
20                    res[tpos++] = res2[pos2++];
21            }
22            while (pos1 < res1.length)
23                res[tpos++] = res1[pos1++];
24            while (pos2 < res2.length)
25                res[tpos++] = res2[pos2++];
26
27            if (!compare(ans, 0, res, 0))
28                ans = res;
29        }
30
31        return ans;
32    }
33
34    public boolean compare(int[] nums1, int start1, int[] nums2, int start2) {
35        for (; start1 < nums1.length && start2 < nums2.length; start1++, start2++) {
36            if (nums1[start1] > nums2[start2]) return true;
37            if (nums1[start1] < nums2[start2]) return false;
38        }
39        return start1 != nums1.length;
40    }
41
42    public int[] solve(int[] nums, int k) {
43        int[] res = new int[k];
44        int len = 0;
45        for (int i = 0; i < nums.length; i++) {
46            while (len > 0 && len + nums.length - i > k && res[len - 1] < nums[i]) {
47                len--;
48            }
49            if (len < k)
50                res[len++] = nums[i];
51        }
52        return res;
53    } }