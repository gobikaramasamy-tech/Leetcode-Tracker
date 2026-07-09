// Last updated: 7/9/2026, 3:17:42 PM
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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            ListNode pre = dummy;
            while(pre.next != null&& pre.next.val <curr.val){
                pre = pre.next;
            }
            curr.next = pre.next;
            pre.next = curr;
            curr = nextNode;
            
            
        }   
        return dummy.next;   
    }
}