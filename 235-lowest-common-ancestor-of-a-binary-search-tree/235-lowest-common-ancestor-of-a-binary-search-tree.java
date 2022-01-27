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
        if(root ==q || root == p) return root;
        
        while(true){
            if(p.val<=root.val && q.val<=root.val){
                ans =root.left;
                root = root.left;
                if(root == p || root ==q) break;
            }else if(p.val>=root.val && q.val >=root.val){
                ans = root.right;
                root = root.right;
                if(root == p || root ==q) break;
            }else{
                break;
            }
        }
        return ans;
    }
}