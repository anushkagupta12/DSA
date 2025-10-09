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
    public ListNode reverseList(ListNode head) {
        // if(head == null || head.next == null) {
        //     return head;
        // }
        // ListNode prev = null;
        // ListNode curr = head;

        // while(curr != null) {
        //     ListNode frwd = curr.next;
        //      curr.next = prev;
        //      prev = curr;
        //      curr = frwd;
              
        // }
        // return prev;
        

        ListNode newHead = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}