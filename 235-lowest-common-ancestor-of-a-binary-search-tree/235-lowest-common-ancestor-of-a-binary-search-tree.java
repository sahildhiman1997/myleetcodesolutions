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


        TreeNode ans = root;
       
        
        while(true){
             if(root ==q || root == p) return root;
            if(p.val<=root.val && q.val<=root.val){
                ans =root.left;
                root = root.left;
                
            }else if(p.val>=root.val && q.val >=root.val){
                ans = root.right;
                root = root.right;
               
            }else{
                break;
            }
        }
        return ans;
    }
}