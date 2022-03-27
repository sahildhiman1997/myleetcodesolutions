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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        
        ListNode previousStart = head;
        ListNode start = head;
        ListNode current = head;
        int i = 0;
        while(current!=null){
            
            i++;
            
            if(i==n+1){
               
                i=1;
                previousStart = start;
                start = current;
            }
            System.out.println(current.val+" at i: "+i+"previousStart is: "+previousStart.val+", start is: "+start.val);
            current = current.next;
        }
        
        if(previousStart== start) return head.next;
        
        
//         int toCover = n-i;
        
//         for(i = 0;i<toCover-1;i++){
//             previousStart = previousStart.next;
//         }
        for(int j = 0;j<i-1;j++){
              previousStart = previousStart.next;
        }
        previousStart.next = previousStart.next.next;
        return head;
    }
}