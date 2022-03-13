/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
 
        Node current = head;
        
        while(current!=null){
            Node n = new Node(current.val);
            n.next = current.next;
            n.random = current.random;
            current.next = n;
            current = n.next;
        }
        
        // while(head!=null){
        //     int k = (head.random==null)?-1:head.random.val;
        //     System.out.println(head.val+", "+k);
        //     head = head.next;
        // }
        
  
        Node n1 = head.next;
        
       
        current = n1;
        while(current.next!=null){
            if(current.random!=null) current.random = current.random.next;
            current = current.next.next;
        }
        if(current.random!=null) current.random = current.random.next;
                
        current = head;
        
        while(current!=null){
            Node copy = current.next;
            Node n = copy.next;
            
            if(copy.next!=null) copy.next = copy.next.next;
            current.next = n;
            current = current.next;
            
        }
        return n1;
        
    }
}