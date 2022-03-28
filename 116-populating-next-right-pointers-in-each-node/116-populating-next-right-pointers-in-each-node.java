/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        
        List<Node> list1 = new ArrayList();
        List<Node> list2 = new ArrayList();
        
        list1.add(root);
       
        while(!list1.isEmpty()){
            for(int i = 0;i<list1.size()-1;i++){
                list1.get(i).next = list1.get(i+1);
                if(list1.get(i).left!=null) list2.add(list1.get(i).left);
                if(list1.get(i).right!=null) list2.add(list1.get(i).right);
            }
            int i = list1.size()-1;
            list1.get(list1.size()-1).next = null;
            if(list1.get(i).right!=null) list2.add(list1.get(list1.size()-1).left);
            if(list1.get(i).right!=null) list2.add(list1.get(list1.size()-1).right);
            
            list1 = list2;
            list2 = new ArrayList();
        }
        return root;
    }
}