// Last updated: 7/30/2026, 3:44:52 PM
1
2class Solution {
3    //prev is pointer for previous node to check with the current node
4    //current its null
5    TreeNode prev = null;
6    //min is a varaible for storing min difference of the each nodes
7    // current sotring maximum value of integer for initial
8    int min = Integer.MAX_VALUE;
9    public int getMinimumDifference(TreeNode root) {
10        //we passing root to our inorder function
11        inorder(root);
12        //finally we return the minimum value
13        return min;
14    }
15    
16    //This is our recursive function
17    //it runs until we find the last node
18    private void inorder(TreeNode node)
19    {
20        // this is the base condition for the recursion
21        if(node == null) return;
22
23        //first we pass left node to the inorder function
24        // because it should be sorted in the order of LEFT -> CURRENT -> RIGHT
25        inorder(node.left);
26
27        // if the previous node is not null we enter into this if block
28        // in the first time it was be null
29        if (prev != null)
30        {
31            // now we check the difference of the previous and current node values are smaller than previous minimum value
32            // in the first run it  was be MAX_VALUE of Integer so we that it stores the minimul value in the first run
33            min = Math.min(node.val - prev.val,min);
34        }
35        //then we store the current node to the previous to keep track of last node
36        prev = node;
37
38        //At last we pass the right node to inorder function
39        inorder(node.right);
40    }
41}