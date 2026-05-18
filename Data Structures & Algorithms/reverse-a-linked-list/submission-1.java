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

        if(head == null)
            return null;
        if(head.next == null)
            return head;

        ListNode newNode = null;
        ListNode dummy = new ListNode(head.val);
        head = head.next;
        while(head != null){
            newNode = new ListNode(head.val);
            newNode.next = dummy;
            dummy = newNode;

            head = head.next;
        }
        return newNode;
    }
}
