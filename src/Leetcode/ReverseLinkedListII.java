package Leetcode;

public class ReverseLinkedListII {

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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=null;

        ListNode temp=head;


        for(int i=1;i<left;i++){
            prev=temp;
            temp=temp.next;
        }
        ListNode before=prev;
        ListNode tail=temp;

        ListNode prev1=null;
        ListNode currentNode=temp;
        ListNode nextNode;
        for(int i=left;i<=right;i++){
            nextNode = currentNode.next;
            currentNode.next = prev1;
            prev1 = currentNode;
            currentNode = nextNode;
        }
        if(before!=null){
            before.next=prev1;
        }
        else{
            head=prev1;
        }
        tail.next=currentNode;

        return head;

    }


}
