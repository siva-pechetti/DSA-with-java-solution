
package LinkedList;

public class LengthOfLoopInLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int findLength(Node slow, Node fast) {
        int count = 1;
        fast = fast.next;

        while (slow != fast) {
            count++;
            fast = fast.next;
        }

        return count;
    }

    public static int detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return findLength(slow, fast);
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        n9.next = n3;

        Node head = n1;

        System.out.println("Length of cycle: " + detectCycle(head));
    }
}
