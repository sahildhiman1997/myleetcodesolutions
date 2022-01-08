import java.util.Random;
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
    ListNode head;
   


    public Solution(ListNode head) {
       this.head = head;
    }
    public int getRandom() {
        ListNode current = head;
        int ans = head.val;
        int i =1;
        while(current.next!=null){
            i++;
            current=current.next;
            Random r = new Random();
            int k = r.nextInt(i)+1;
            if(i==k){
                ans=current.val;
            }
        }
       
return ans;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */