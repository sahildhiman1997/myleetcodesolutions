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
public class Solution {
    int minTillNow = Integer.MAX_VALUE;
    int maxTillNow = Integer.MIN_VALUE;

    public int maxAncestorDiff(TreeNode root) {
        int answer = 0;
         minTillNow = minTillNow > root.val ? root.val : minTillNow;
         maxTillNow = maxTillNow < root.val ? root.val : maxTillNow;


        return maxAncestorDiffHelper(root, minTillNow, maxTillNow);
    }

    private int maxAncestorDiffHelper(TreeNode root, int minTillNow, int maxTillNow) {
          if (root==null){
            return 0;
        }
         if(root.val>maxTillNow) maxTillNow = root.val;
         if(root.val<minTillNow) minTillNow = root.val;


      return Math.max(Math.max(Math.abs(maxTillNow - minTillNow), Math.abs(maxAncestorDiffHelper(root.right, minTillNow, maxTillNow))),
                Math.abs(maxAncestorDiffHelper(root.left, minTillNow, maxTillNow)));
    }
}