package LinkedList;

import java.util.Scanner;

public class CircularLinkedList {

    Node head;

    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;

        temp.next = newNode;

        head = newNode;
    }

    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }



    void display() {

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

        CircularLinkedList list = new CircularLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }

        System.out.println("Original list:");
        list.display();

        list.insertAtBeginning(45);

        System.out.println("After inserting 45 at beginning:");
        list.display();

        sc.close();
    }

}