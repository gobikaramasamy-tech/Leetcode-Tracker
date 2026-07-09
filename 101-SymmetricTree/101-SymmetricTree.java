// Last updated: 7/9/2026, 3:18:17 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left,root.right);
    }
    boolean helper(TreeNode leftR,TreeNode rightR){
        if(leftR == null && rightR == null) return true;
        if(leftR==null || rightR== null) return false;
        if(leftR.val != rightR.val) return false;
        return helper(leftR.left,rightR.right) && helper(leftR.right,rightR.left);
    }
}