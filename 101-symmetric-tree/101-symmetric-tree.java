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
        if(root == null)   return true;
        return helper(root.left, root.right);
    }
    
    
    
    boolean helper(TreeNode l, TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null) return false;
        
        if(l.val!=r.val) return false;
            
        boolean l1=true, l2=true;
        
        if(l.left!=null || r.right!=null){
            l1 = helper(l.left, r.right);
        }
        if(l.right!=null || r.left!=null){
            l2  = helper(l.right, r.left);
        }
        
        if(l1==false || l2 == false){
            return false;
        }
        return true;
    }
}