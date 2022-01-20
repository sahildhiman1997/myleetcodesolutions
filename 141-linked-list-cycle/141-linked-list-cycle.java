/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode tortoise = head;
        ListNode rabbit = head;
        
        if(head == null || head.next == null){
            return false;
        }
        
        
        
        while(tortoise!=null){

            
            if(rabbit.next!=null && rabbit.next.next!=null){
                rabbit = rabbit.next.next;
                tortoise = tortoise.next;
            }else{
                return false;
            }
            
            if(tortoise ==rabbit){
                return true;
            }
        
        }
        
        return false;
        
        
        
        
    }
}