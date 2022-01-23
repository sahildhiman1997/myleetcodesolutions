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
    public List<Integer> postorderTraversal(TreeNode root) {
       LinkedList<Integer> ans = new LinkedList<Integer>();    
        if(root == null) return ans;
        
    
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode current = root;
        
        stack.push(current);
        while(!stack.isEmpty()){
          current = stack.pop();
            ans.addFirst(current.val);
            
            if(current.left!=null) stack.push(current.left);
            if(current.right!=null) stack.push(current.right);
         }  
            
            return ans;
        }
        

}