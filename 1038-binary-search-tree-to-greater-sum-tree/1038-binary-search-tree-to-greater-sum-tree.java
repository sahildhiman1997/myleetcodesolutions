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
   int k = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) {
            root.val += Math.max(bstToGst(root.right).val,k);
            k = root.val;
        } else {
            root.val += k;
            k = root.val;
        }

        if (root.left != null) {
            bstToGst(root.left);
        }

        return root;
    }
}