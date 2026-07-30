// Last updated: 7/30/2026, 3:51:31 PM
1class Solution {
2    public int maxDepth(Node root) {
3        if (root == null)
4            return 0;
5        
6        
7        int maxx = 1;
8        
9        
10        for (Node child : root.children)
11            maxx = Math.max(maxx, 1 + maxDepth(child));
12        
13        
14        return maxx;
15    }
16}