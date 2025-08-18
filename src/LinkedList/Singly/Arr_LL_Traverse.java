package LinkedList.Singly;

import org.w3c.dom.Node;

public class Arr_LL_Traverse {

    static class Node {
        int data;
        Node next;

        Node() { data = 0; }
        Node(int d) { data = d; }  //constructor to create a new node
    }

    static Node constructLL(int arr[]) {
        // code here
        Node head=new Node(arr[0]);
        Node mover=head;

        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=mover.next;
        }
        return head;

    }
}
