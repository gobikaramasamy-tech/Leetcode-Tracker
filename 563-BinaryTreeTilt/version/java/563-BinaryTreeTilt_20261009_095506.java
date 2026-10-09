// Last updated: 10/9/2026, 9:55:06 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans = 0;
18
19    public int findTilt(TreeNode root) {
20        helper(root);
21        return ans;
22    }
23
24    // Post-Order DFS helper method: returns total subtree sum 🔀
25    public int helper(TreeNode root) {
26        // Base Case: Empty subtree sum is 0 🍃
27        if (root == null) return 0;
28
29        // Step 1: Bottom-up evaluation of left and right subtree sums 📐
30        int left = helper(root.left);
31        int right = helper(root.right);
32
33        // Step 2: Accumulate absolute tilt difference for the current node ⚖️
34        ans += Math.abs(left - right);
35
36        // Step 3: Return total subtree sum (current node + left + right) to parent
37        return root.val + left + right;
38    }
39}