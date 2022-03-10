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
    public ListNode mergeKLists(ListNode[] lists) {

          PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>((a,b)->  a.val - b.val);
        for(ListNode n: lists){
            while(n!=null){
               heap.add(n);
                n=n.next;
            }
        }
        ListNode head = heap.poll();
        ListNode current = head;
        while(heap.size()!=0){
            current.next = heap.poll();
            current = current.next;
        }
        if(current!=null) current.next = null;
        return head;
      }
}