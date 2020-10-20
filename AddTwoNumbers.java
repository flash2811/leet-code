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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        
        int carry = 0;
        
        while (p != null || q != null) {
            int l1Val = (p != null) ? p.val : 0;
            int l2Val = (q != null) ? q.val : 0;
            
            int sum = carry + l1_val + l2Val;
            carry = sum / 10;
            //the last digit
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if (p != null) p = p.next;
            
            if (q != null) q = q.next;
        }
        
        // for the left over carry 
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        
        return dummyHead.next;
        }
}
