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
        if  ( head == null) return null;
        ListNode n  = head.next;
        head.next = null;
        return helper(head, n);     
    }
    public ListNode helper(ListNode head, ListNode next){
        if(next == null) return head;
       ListNode temp =next.next;
        next.next = head;
        
        
        return helper(next, temp);
    }
}
