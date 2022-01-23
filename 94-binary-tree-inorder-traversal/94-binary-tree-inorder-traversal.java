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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        
        if(root == null) return ans;
        stack.push(current);
      
        while(!stack.isEmpty()){
          
            while(current.left!=null) {
                stack.push(current.left);
                current = current.left;
            }
              
            do{
              current = stack.pop();
                ans.add(current.val);
            }while(current.right==null && !stack.isEmpty());
            
            if(current.right!=null){
              current = current.right;
                stack.push(current);
            }
        }
  
        
        
        return ans;
    }
}
