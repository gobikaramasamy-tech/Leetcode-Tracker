// Last updated: 10/9/2026, 10:01:19 AM
1class Solution {
2    private boolean isSameTree(TreeNode p, TreeNode q) {
3        if (p == null && q == null) {
4            return true;
5        }
6        if (p == null || q == null) {
7            return false;
8        }
9        if (p.val != q.val) {
10            return false;
11        }
12        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
13    }
14
15    private boolean helper(TreeNode p, TreeNode q) {
16        if (p == null) {
17            return false;
18        }
19        if (isSameTree(p, q)) {
20            return true;
21        }
22        return helper(p.left, q) || helper(p.right, q);
23    }
24
25    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
26        return helper(root, subRoot);
27    }
28}