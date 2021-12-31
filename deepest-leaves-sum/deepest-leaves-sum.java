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
  int maxDepth = 0;
    int currentDepth = 0;
    int sum = 0;

  public int deepestLeavesSum(TreeNode root) {
        int depth = currentDepth;
        currentDepth = depth + 1;
        if (root.left == null && root.right == null) {
            if (maxDepth == depth) {
                sum += root.val;
            } else if (depth > maxDepth) {
                sum = root.val;
                maxDepth = depth;
            }
        } 
        if (root.right != null) {
            deepestLeavesSum(root.right);
        }
        if (root.left != null) {
            deepestLeavesSum(root.left);
        }
        currentDepth -= 1;
        return sum;
    }
}