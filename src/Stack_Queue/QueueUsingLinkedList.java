package Stack_Queue;

public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;

    public void enqueue(int data) {

        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue - Remove element
    public int dequeue() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    public int peek() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

    public void display() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue:");
        queue.display();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Removed: " + queue.dequeue());

        System.out.println("Queue after dequeue:");
        queue.display();
    }
}
