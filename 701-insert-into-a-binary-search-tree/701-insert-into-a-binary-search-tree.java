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
    public TreeNode insertIntoBST(TreeNode root, int val) {
       
        TreeNode current = root;
        TreeNode n = new TreeNode(val);
         if(root == null){
            return n;
        }
        while(true){
            if(current.val<val){
                if(current.right==null){
                    current.right = n;
                    return root;
                }
                current = current.right;
            }else{
                if(current.left==null){
                    current.left=n;
                    return root;
                }
                current=current.left;
            }
        }
        
    }
}