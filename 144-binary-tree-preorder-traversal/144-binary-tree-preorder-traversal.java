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
    public List<Integer> preorderTraversal(TreeNode root) {

           List<Integer> ans = new ArrayList<Integer>();
           if(root==null) return ans;
        
//         recursive solution
//         ans.add(root.val);
//         if(root.left!=null){
//             ans.addAll(preorderTraversal(root.left));
//         }
//         if(root.right!=null) {
//             ans.addAll(preorderTraversal(root.right));
//         }
          
        
//         iterative
        
        Stack<TreeNode> stack = new Stack<TreeNode>();      
        TreeNode current = root;
        while(current!=null || !stack.isEmpty()){
            if(current!=null) ans.add(current.val);
           
            
            if(current.right!=null) {stack.push(current.right);}
            current = current.left;
            if(current==null && !stack.isEmpty()) {current = stack.pop();}
        }
         return ans;
    }
       

}