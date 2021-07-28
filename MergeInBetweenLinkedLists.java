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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 0;
        
        ListNode list1BJ = new ListNode();
        ListNode list1EJ = new ListNode();
        
        ListNode list1Head = list1;
        
        //ListNode list2E = list2;
        
        while(count <= b) {
            if(count == a - 1) {
                list1BJ = list1Head;
            }
            else if (count == b){
                list1EJ = list1Head.next;
            }
           
            list1Head = list1Head.next;
            count++;
        }
        
        list1BJ.next = list2;
        
                
        while(list2.next != null) {
            list2 = list2.next;
        }
        
        list2.next = list1EJ;
        
        return list1;
    }
}
