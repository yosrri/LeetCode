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
    public ListNode reverse(ListNode mid){       
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = mid;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }
    public boolean isPalindrome(ListNode head) {
        ListNode midNode = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        midNode = slow;

        //no of nodes is even
        if (fast != null) 
            midNode = midNode.next;
        midNode = reverse(midNode);

        slow = head;

        while (midNode!= null) {
            if (slow.val != midNode.val)
                return false;
            slow = slow.next;
            midNode = midNode.next;
        }
        return true;
    }
    
    
}
    
