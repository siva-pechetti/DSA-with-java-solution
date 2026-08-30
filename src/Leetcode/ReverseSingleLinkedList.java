package Leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseSingleLinkedList {

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode currentNode = head;
        ListNode nextNode;

        while (currentNode != null) {

            nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        head = reverseList(head);

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}