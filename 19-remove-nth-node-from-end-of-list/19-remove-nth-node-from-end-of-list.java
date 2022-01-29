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
        if(head ==null) return null;
        ListNode current = head;
        int i = 1;
        
        
        
        ListNode currentChunkStarting=head;;
        ListNode previousChunkStarting = head;
        
        while(current.next!=null){
            current = current.next;
            i++;
            if(i==n+1){
                i = 1;
                previousChunkStarting=currentChunkStarting;
                currentChunkStarting =current ;
                System.out.println("Current chunk starting at: "+currentChunkStarting.val);
                
            }
        }
        
        if(previousChunkStarting==currentChunkStarting) return head.next;
        
       
//        int coveredBycurrentChunk = i;
        // n=n-i;
    
           System.out.println("at previous ");
           while(i>1){
               previousChunkStarting=previousChunkStarting.next;
               i--;
           }
           previousChunkStarting.next = previousChunkStarting.next.next;
       
        
       // while(n>1){
       //     currentChunkStarting=currentChunkStarting.next;
       //     n--;
       // }
        
       // currentChunkStarting.next = currentChunkStarting.next.next;
        
        return head;
        
    }
   
}