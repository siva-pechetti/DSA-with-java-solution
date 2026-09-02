package LinkedList;

import java.util.Scanner;


public class CircularLinkedList {

    public static Node createList(int n, Scanner sc) {

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (tail == null) {
                head = newNode;
                tail = newNode;

                tail.next = head;
            }
            else {
                newNode.next = head;

                tail.next = newNode;

                tail = newNode;
            }
        }

        return head;
    }

    public static void display(Node head) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = createList(n, sc);
        System.out.println("Original list:");
        display(head);




    }
}