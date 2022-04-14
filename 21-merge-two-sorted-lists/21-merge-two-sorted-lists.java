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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
         if(temp1==null && temp2==null) 
            return null;
        else if(temp1==null)
            return list2;
        else if(temp2 == null)
            return list1;
        
        while(temp1!= null && temp2!=null){
            if(temp1.val<=temp2.val){
                dummy.next = temp1;
                dummy=dummy.next;
                temp1=temp1.next;
            }
            else {
               dummy.next = temp2;
                dummy= dummy.next;
                temp2=temp2.next;
                
            }
        }
        if(temp1==null && temp2!=null){
            dummy.next = temp2;
        }
        else if(temp2==null && temp1!=null){
            dummy.next = temp1;
        }
        return head.next;
        
    }
}