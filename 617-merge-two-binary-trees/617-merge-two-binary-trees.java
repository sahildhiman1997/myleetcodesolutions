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
     
      if(root2!=null && root1!=null){
          if(root2.left!=null){
              if(root1.left!=null){
                 mergeTrees(root1.left, root2.left);
                  // root1.left.val+=root2.left.val;
              }else{
                  root1.left= root2.left;
                      // root2.left.val;
              }
          }
          if(root2.right!=null){
              if(root1.right!=null){
                mergeTrees(root1.right, root2.right);
                  // root1.right.val+=root2.right.val;
              }else{
                  root1.right = root2.right;
                  // root1.right.val=root2.right.val;
              }
          }
           root1.val+=root2.val;
      }
       if(root1==null && root2!=null) return root2;
        
        return root1;
        
    }
}