package Stack_Queue;

public class QueueUsingArrays {


    static final int N = 5;

    static int[] queue = new int[N];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int x) {

        if (rear == N - 1) {
            System.out.println("Queue Overflow");
        }
        else {
            if (front == -1) {
                front = 0;
            }

            rear++;
            queue[rear] = x;

            System.out.println(x + " inserted");
        }
    }

    static void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.print("Queue: ");

            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }

    static void peek() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    static void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        }
        else {
            System.out.println(queue[front] + " deleted");
            front++;

            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    public static void main(String[] args) {

        enqueue(20);
        enqueue(30);
        enqueue(40);

        display();

        peek();

        dequeue();

        display();

        peek();
    }
}