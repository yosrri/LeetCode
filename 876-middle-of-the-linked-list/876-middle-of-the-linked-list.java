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
    public ListNode middleNode(ListNode head) {
        if(head==null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next !=null){
            slow = slow.next;
            if(fast.next.next==null)
                break;
            fast = fast.next.next;
        }
        return slow;
    }
}