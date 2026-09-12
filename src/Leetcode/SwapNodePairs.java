package Leetcode;

public class SwapNodePairs {

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

    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=head.next;
        ListNode currentNode=head;
        ListNode prev=null;

        while (currentNode != null && currentNode.next != null) {

            ListNode nextNode = currentNode.next;

            currentNode.next = nextNode.next;
            nextNode.next = currentNode;

            if (prev != null) {
                prev.next = nextNode;
            }

            prev = currentNode;
            currentNode = currentNode.next;
        }
        return newHead;
    }
}