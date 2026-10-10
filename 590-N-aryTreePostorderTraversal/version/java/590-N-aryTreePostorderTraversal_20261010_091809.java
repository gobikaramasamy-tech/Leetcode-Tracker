// Last updated: 10/10/2026, 9:18:09 AM
1class Solution {
2    public List<Integer> postorder(Node root) {
3        // If the root is null, return an empty list
4        if (root == null) return new ArrayList<>();
5
6        List<Integer> res = new ArrayList<>();
7
8        // Start DFS from the root
9        dfs(root, res);
10
11        // Return the result list containing node values in post-order
12        return res;
13    }
14
15    private void dfs(Node root, List<Integer> res) {
16        // Recursively call dfs for each child of the current node
17        for (Node child : root.children) {
18            dfs(child, res);
19        }
20        // Append the value of the current node to the result list
21        res.add(root.val);
22    }
23}