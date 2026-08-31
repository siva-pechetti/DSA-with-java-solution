package Leetcode;

import java.util.Scanner;

public class SortedLinkedList {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node sorted(Node head){
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);

        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;

        Node temp=head;

        while(temp!=null){
            if(temp.data == 0){
                zero.next=temp;
                zero=zero.next;
            } else if (temp.data==1) {
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        zero.next=(oneHead.next!=null) ? oneHead.next:twoHead.next;
        one.next=(twoHead.next!=null)? twoHead.next:null;
        two.next=null;
        return zeroHead.next;

    }

    public static Node createList(int n, Scanner sc) {

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
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

        System.out.println("Enter " + n + " values (only 0, 1, 2):");

        Node head = createList(n, sc);

        System.out.println("Original list:");
        printList(head);

        head = sorted(head);

        System.out.println("Sorted list:");
        printList(head);

        sc.close();
    }


}
