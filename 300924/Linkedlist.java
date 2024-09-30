import java.util.Scanner;


class Node{
    int data;
    Node next;
    Node(){
        data=0;
        next=null;
    }
    Node(int x){
        data=x;
        next=null;
    }
}

public class Linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node();
        Node d = head;
        for (int i=0;i<n;i++){
            Node temp = new Node(sc.nextInt());
            d.next = temp;
            d = temp;
        }
        sc.close();
        Node copy = new Node();
        for (Node i=head.next; i!=null; i=i.next){
            Node t = new Node();
            t.data=i.data;
            t.next = copy;
            copy = t;
        }
        Node j=head.next;
        Node k=copy;
        while (j!=null && k!=null){
            if (j.data != k.data){
                System.out.println(false);
                return;
            }
            j=j.next;
            k=k.next;
        }
        System.out.println(true);
    }
}
