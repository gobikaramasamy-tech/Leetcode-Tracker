// Last updated: 7/30/2026, 3:49:04 PM
1class Solution {
2
3    int diameter = 0;
4
5    public int diameterOfBinaryTree(TreeNode root) {
6
7        if (root == null) {
8            return 0;
9        }
10
11        height(root);
12
13        return diameter;
14    }
15
16    public int height(TreeNode root) {
17
18        if (root == null) {
19            return 0;
20        }
21
22        int leftHeight = height(root.left);
23
24        int rightHeight = height(root.right);
25
26
27        // Diameter passing through current node
28        int currentDiameter = leftHeight + rightHeight;
29
30        diameter = Math.max(diameter, currentDiameter);
31
32
33        // Return height to parent
34        return 1 + Math.max(leftHeight, rightHeight);
35    }
36}