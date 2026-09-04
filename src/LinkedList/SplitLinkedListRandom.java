package LinkedList;

public class SplitLinkedListRandom {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node[] splitListToParts(Node head, int k) {

        int length = 0;
        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int size = length / k;
        int extra = length % k;

        Node[] result = new Node[k];
        temp = head;

        for (int i = 0; i < k; i++) {

            result[i] = temp;

            int partSize = size;

            if (i < extra) {
                partSize++;
            }

            for (int j = 1; j < partSize && temp != null; j++) {
                temp = temp.next;
            }

            if (temp != null) {
                Node nextNode = temp.next;
                temp.next = null;
                temp = nextNode;
            }
        }

        return result;
    }

}