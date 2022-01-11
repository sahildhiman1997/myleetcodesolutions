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
  
        public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List param = new ArrayList<Integer>();

        param.add(0);
        return sumHelper(root, param );
    }

    private static int binaryToInteger(List param) {
        System.out.println("calculcating for " + param);
        int ans = 0;
        int i = param.size()-1;
        while (i >-1 ) {
           if((int) param.get(i) ==1){
                ans += Math.pow(2, param.size()-i-1);
            }else{

           }
            i--;
        }
        return ans;
    }

    private int sumHelper(TreeNode root, List param) {
        int ans = 0;
        if (root.val == 1) {
            param.add(1);
        }else{
            param.add(0);
        }
        if (root.left == null && root.right == null) {
            int k = binaryToInteger(param);
                    param.remove(param.size() - 1);

            return k;
        }

        if (root.left != null) {
            ans += sumHelper(root.left, param);
        }
        if (root.right != null) {
            ans += sumHelper(root.right, param);
        }
        param.remove(param.size() - 1);

        return ans;
    }
}