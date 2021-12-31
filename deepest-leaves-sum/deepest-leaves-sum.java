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
         public int deepestLeavesSum(TreeNode root) {
            List<TreeNode> list1 = new ArrayList<TreeNode>();
            list1.add(root);
            List<TreeNode> list2 = new ArrayList<TreeNode>();

            while (true) {
                boolean listIsLast = false;
                if (list2.isEmpty()) {
                    for (TreeNode node : list1) {
                        if (node.left != null) list2.add(node.left);
                        if (node.right != null) list2.add(node.right);
                    }
                    if (list2.isEmpty() == false) {
                        list1 = new ArrayList<TreeNode>();
                    } else {
                        break;
                    }
                } else if (list1.isEmpty()) {
                    for (TreeNode node : list2) {
                        if (node.left != null) list1.add(node.left);
                        if (node.right != null) list1.add(node.right);
                    }
                    if (list1.isEmpty() == false) {
                        list2 = new ArrayList<TreeNode>();
                    } else {
                        break;
                    }
                }
            }
            int answer = 0;
            for (TreeNode node : list1) {
                answer += node.val;
            }
            for (TreeNode node : list2) {
                answer += node.val;
            }

            return answer;
        }
}