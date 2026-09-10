
        package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class PairsInDDL {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static LinkedList<Integer> pairsDDL(Node head, Node tail, int sum) {
        Node left = head;
        Node right = tail;
        LinkedList<Integer> list = new LinkedList<Integer>();

        while (left != right && left.prev != right) {
            if (left.data + right.data == sum) {
                list.add(left.data);
                list.add(right.data);
                left = left.next;
                right = right.prev;
            } else if (left.data + right.data < sum) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }

        return list;
    }

    public static Node createList(int n, Scanner sc) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            Node newNode = new Node(value);
            newNode.next = null;
            newNode.prev = null;

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    public static Node getTail(Node head) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        return temp;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = createList(n, sc);
        Node tail = getTail(head);

        printList(head);

        System.out.println("Enter pair sum:");
        int sum = sc.nextInt();

        System.out.println("After pairs in DDL");

        LinkedList<Integer> result = pairsDDL(head, tail, sum);

        for (int i = 0; i < result.size(); i += 2) {
            System.out.println("(" + result.get(i) + ", " + result.get(i + 1) + ")");
        }

        sc.close();
    }
}

