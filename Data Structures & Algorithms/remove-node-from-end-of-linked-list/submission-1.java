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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null || head == null)
            return null;
        ListNode dummy = head;
        int count=0;
        while(dummy != null){
            dummy = dummy.next;
            count++;
        }
        n = count - n;
        if(n==0)
            return head.next;
        dummy = head;
        count = 0;

        while(dummy != null){
            count++;
            if(count == n){
                if(dummy.next.next != null)
                    dummy.next = dummy.next.next;
            else{
                    dummy.next = null;
                }
            break;
            }
            dummy = dummy.next;
        }
    return head;
    }
}
