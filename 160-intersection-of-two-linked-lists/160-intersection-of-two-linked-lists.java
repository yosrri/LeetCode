/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dum1 = headA;
        ListNode dum2 = headB;
        
        while(dum1!=null && dum2!=null){
            if(dum1==dum2){
                return dum1;
            }
            dum1=dum1.next;
            dum2=dum2.next;
            if(dum1==null && dum2==null)
                break;
            if(dum1==null)
                dum1=headB;
            if(dum2==null)
                dum2=headA;
        }
        return null;
        
    }
}