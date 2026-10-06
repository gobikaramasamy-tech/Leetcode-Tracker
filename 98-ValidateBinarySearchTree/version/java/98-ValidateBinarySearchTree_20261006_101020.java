// Last updated: 10/6/2026, 10:10:20 AM
1class Solution {
2    public boolean isValidBST(TreeNode root) {
3        if (root == null) {
4            return true;
5        }
6        return isValidBST(root, null, null);
7    }
8
9    private boolean isValidBST(TreeNode root, Integer min, Integer max) {
10        if (root == null) {
11            return true;
12        }
13        if ((min != null && min >= root.val) || (max != null && max <= root.val)) {
14            return false;
15        }
16        boolean left = isValidBST(root.left, min, root.val);
17        boolean right = isValidBST(root.right, root.val, max);
18        return left && right;
19    }
20}