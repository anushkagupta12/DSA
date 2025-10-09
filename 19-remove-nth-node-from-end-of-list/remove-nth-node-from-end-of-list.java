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

    // public int findLength(ListNode head){
    //     int count = 0;
    //     if(head == null) return count;
    //     ListNode curr = head;
    //     while(curr != null){
    //         count++;
    //         curr = curr.next;
    //     }
    //     return count;
    // }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int length = findLength(head);
        // int i = 0, traverseTill = length - n - 1;
        // if(traverseTill == -1) return head.next;
        // ListNode curr = head;
        // while(i < traverseTill){
        //     curr = curr.next;
        //     i++;
        // }
        // curr.next = curr.next.next;
        // return head;
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;

        for(int i = 1; i <= n; i++) {
                fast = fast.next;
            }

        while(fast.next != null) {
         fast = fast.next;
         slow = slow.next;
         
        }

        slow.next = slow.next.next;
        
        return start.next;

    }
}