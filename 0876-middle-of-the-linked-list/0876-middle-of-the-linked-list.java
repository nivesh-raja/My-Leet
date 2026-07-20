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
    public static int getLength(ListNode head){
        int length = 0;
        while (head != null){
            head = head.next;
            length++;
        }
        return length;
    }
    public ListNode middleNode(ListNode head) {
        int length = getLength(head);
        int mid = length/2;
        while (mid != 0){
            head = head.next;
            mid--;
        }
        return head;
    }
}