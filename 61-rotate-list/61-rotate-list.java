/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode start = head;
        int i = 0;
        ListNode current=start;
        while(i<k){
          i++;
            current = current.next;
            if(current==null){
                current = head;
                k=k%i;
                i=0;   
            }
            
        }
        if(start == current) return head;
        
        while(current.next!=null){
            start = start.next;
            current = current.next;
        }
        ListNode ans = start.next;
        start.next = null;
        current.next = head;   
        return ans;
        
    }
}