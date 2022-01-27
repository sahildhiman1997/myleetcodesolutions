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

    public boolean findTarget(TreeNode root, int k) {
        if(root ==null) return false;
        HashSet<Integer> set = new HashSet<>();
        Queue<TreeNode> deque = new ArrayDeque();
        deque.add(root);
        while(deque.isEmpty()==false){
            TreeNode current = deque.poll();
            if(set.contains(k-current.val)){
                return true;
            }
            else{
                
                set.add(current.val);
                
                if(current.left!=null){
                    deque.offer(current.left);
                }
                if(current.right!=null){
                    deque.offer(current.right);
                }
            }



        }
        return false;


    }

}