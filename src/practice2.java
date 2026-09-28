import java.util.Scanner;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;

    }
}
public class practice2 {
    Node head;
    Node temp;
     void insert(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=temp=newNode;
        }
             temp.next = newNode;
             newNode.prev = temp;
             temp = newNode;
    }
    void atPosition(int pos,int data){
        Node newNode=new Node(data);
        Node temp=head;
        for (int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next=newNode;

    }
    void deleteAtPosition(int pos){
         Node temp=head;
        for (int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        temp.next.prev=temp;


    }
    void display(){
         Node temp=head;
         while(temp !=null){
             System.out.print(temp.data + "->");
             temp=temp.next;
         }
    }

    public static void main(String[] args) {
        practice2 list =new practice2();
Scanner sc=new Scanner(System.in);
      list.insert(2);
      list.insert(4);
      list.insert(6);
      list.insert(9);
      list.display();
        System.out.println("Insert at any position:");
      int pos=sc.nextInt();
      int data= sc.nextInt();
      list.atPosition(2,5);
        list.display();
        System.out.println("Delete a Node");
        int pos1=sc.nextInt();
        list.deleteAtPosition(pos1);

        list.display();



    }
}
