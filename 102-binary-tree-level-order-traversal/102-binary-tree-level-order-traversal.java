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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
               
        if(root==null) return ans;
        
        
        List<TreeNode> previousRow = new ArrayList();
        List<TreeNode> currentRow = new ArrayList();
        
        previousRow.add(root);
       
        
        while(!previousRow.isEmpty()){
            currentRow = new ArrayList();
            for(TreeNode n: previousRow){
                if(n.left!=null) currentRow.add(n.left);
                if(n.right!=null) currentRow.add(n.right);           
            }
          
            List<Integer> toPush = new ArrayList();
            for(TreeNode i: previousRow){
                toPush.add(i.val);
            }
            ans.add(toPush);
            previousRow = currentRow;
        }
        
        return ans;
        
    }
}