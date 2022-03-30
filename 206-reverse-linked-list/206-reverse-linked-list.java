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
    public ListNode reverseList(ListNode head) {
       
        if(head==null) return null;
        ListNode current = head;
        ListNode temp = head;
        ListNode previous = null;
        
        while(temp!=null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
            
        }
        return previous;
    }
}