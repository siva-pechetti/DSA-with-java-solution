package LinkedList;

import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLinkedList {
    Node1 head;
    void insertAtBeginning(int data){

        Node1 newNode = new Node1(data);
        if(head  == null){
            head=newNode;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
    }
    void insertEnd(int data){

        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node1 tail=head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;

    }
    void insertAtPosition(int pos, int data) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }
        Node1 newNode = new Node1(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node1 temp = head;
        for (int i = 1; i < pos-1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.prev=temp;
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.next.prev=newNode;
    }

    void display() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    void deleteAtBeginning(){
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node1 temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }
    void deleteAtPosition(int pos) {
        Node1 nextNode;
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }

        Node1 temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Invalid position");
                return;
            }

            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Invalid position");
            return;
        }
        nextNode=temp.next;
        temp.next=nextNode.next;
        nextNode.next.prev=nextNode.prev;

    }

    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Insert At Beginning");
            System.out.println("2. Insert At End");
            System.out.println("3. Insert At Given Position");
            System.out.println("4. Delete First Node");
            System.out.println("5. Delete Last Node");
            System.out.println("6. Delete At Given Position");
            System.out.println("7. Display");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Data:");
                    int data1 = sc.nextInt();
                    list.insertAtBeginning(data1);
                    break;

                case 2:
                    System.out.println("Enter Data:");
                    int data2 = sc.nextInt();
                    list.insertEnd(data2);
                    break;

                case 3:
                    System.out.println("Enter Data:");
                    int data3 = sc.nextInt();

                    System.out.println("Enter Position:");
                    int pos1 = sc.nextInt();

                    list.insertAtPosition(pos1, data3);
                    break;

                case 4:
                    list.deleteAtBeginning();
                    break;

                case 5:
                    list.deleteAtEnd();
                    break;

                case 6:
                    System.out.println("Enter Position:");
                    int pos2 = sc.nextInt();

                    list.deleteAtPosition(pos2);
                    break;

                case 7:
                    list.display();
                    break;

                case 8:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }

}