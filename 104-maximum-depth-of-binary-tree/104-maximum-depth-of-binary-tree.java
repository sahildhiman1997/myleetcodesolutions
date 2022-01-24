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
    public int maxDepth(TreeNode root) {
 
//      Using BFS
        int ans = 0;
        if(root == null) return ans;
        
        List<TreeNode> previousRow = new ArrayList<TreeNode>(){{add(root);}};
        List<TreeNode> currentRow;
        
        while(!previousRow.isEmpty()){
            ans++;
            currentRow =  new ArrayList();
            for(TreeNode n: previousRow){
                if(n.left!=null) currentRow.add(n.left);
                if(n.right!=null) currentRow.add(n.right);
            }
            
            previousRow = currentRow;
        }
        
        return ans;
        
        
    }
}