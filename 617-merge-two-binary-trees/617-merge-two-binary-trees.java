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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
        root1.val+=root2.val;
        
        
        if(root1.left!=null){
            mergeTrees(root1.left, root2.left);
        }else{
            root1.left = root2.left;
        }
        
        if(root1.right!=null){
            mergeTrees(root1.right, root2.right);
        }else{
            root1.right = root2.right;
        }
        return root1;
    }
}