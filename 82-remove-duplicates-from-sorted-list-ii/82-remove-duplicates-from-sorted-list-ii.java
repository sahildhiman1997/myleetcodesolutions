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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        
         while(head!=null && head.next!=null){
            if(head.next.val == head.val){
                int val = head.val;
                while(head!=null && head.val ==val){
                    head=head.next;
                }
            }else{
                head.next = deleteDuplicates(head.next);
                break;
            };
        }
        return head;
    }
}