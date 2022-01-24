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
 
//         Iterative using stack
        
        
        
        Stack<TreeNode> left = new Stack();
        Stack<TreeNode> right = new Stack();
        if(root == null) return true;
    
        if(root.left!=null)        left.add(root.left);
        if(root.right!=null)        right.add(root.right);
        
        while(!left.isEmpty() || !right.isEmpty()){ 
            if((left.isEmpty() && !right.isEmpty()) || (!left.isEmpty() && right.isEmpty())){
                return false;
            }
            
            TreeNode l  = left.pop();
            TreeNode r  = right.pop();
            
            if(l.val == r.val){ 
                if(l.left!=null && r.right!=null) { left.push(l.left); right.push(r.right);}
                if(l.right!=null && r.left!=null) { right.push(r.left); left.push(l.right);}
         
                if((l.left==null && r.right!=null) || (l.left!=null && r.right==null)) return false;
                          if((l.right==null && r.left!=null) || (l.right!=null && r.left==null)) return false;
                
                
            }else{
                return false;
            }
        }
        
        
        return true;
    }
}