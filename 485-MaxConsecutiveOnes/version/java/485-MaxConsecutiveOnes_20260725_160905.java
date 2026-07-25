// Last updated: 7/25/2026, 4:09:05 PM
1class Solution {
2    private int currentVal;
3    private int currentCount = 0;
4    private int maxCount = 0;
5    private List<Integer> modes = new ArrayList<>();
6
7    public int[] findMode(TreeNode root) {
8        inOrderTraversal(root);
9        int[] result = new int[modes.size()];
10        for (int i = 0; i < modes.size(); i++) {
11            result[i] = modes.get(i);
12        }
13        return result;
14    }
15
16    private void inOrderTraversal(TreeNode node) {
17        if (node == null) return;
18
19        inOrderTraversal(node.left);
20
21        currentCount = (node.val == currentVal) ? currentCount + 1 : 1;
22        if (currentCount == maxCount) {
23            modes.add(node.val);
24        } else if (currentCount > maxCount) {
25            maxCount = currentCount;
26            modes.clear();
27            modes.add(node.val);
28        }
29        currentVal = node.val;
30
31        inOrderTraversal(node.right);
32    }
33}