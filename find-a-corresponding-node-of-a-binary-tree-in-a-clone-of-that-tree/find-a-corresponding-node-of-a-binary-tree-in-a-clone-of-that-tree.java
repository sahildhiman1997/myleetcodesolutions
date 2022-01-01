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
  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {


        if (target == original) {
            return cloned;
        }
        if (original.left != null) {
           if( getTargetCopy(original.left, cloned.left, target)!=null) return getTargetCopy(original.left, cloned.left, target);
        }
        if (original.right != null) {
           if( getTargetCopy(original.right, cloned.right, target)!=null) return getTargetCopy(original.right, cloned.right, target);
        }
        return null;
    }
}