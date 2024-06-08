/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==q||root==p) return root;
        TreeNode ls=lowestCommonAncestor(root.left, p, q);
        TreeNode rs=lowestCommonAncestor(root.right, p, q);
        if(ls!=null && rs!=null) return root;
        else if(rs!=null) return rs;
        else return ls;
    }
}