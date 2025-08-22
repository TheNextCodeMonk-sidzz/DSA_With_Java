package LinkedList.Doubly;

import static LinkedList.Doubly.Creating_doubly_LL.convertArrToLL;
import static LinkedList.Doubly.Creating_doubly_LL.printNode;
import static LinkedList.Doubly.Creating_doubly_LL.Node;

public class Deleting_at_head {

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,2,3,4,5};

        Creating_doubly_LL.Node head=convertArrToLL(arr);
        printNode(head);
        Node deletehead=deleteAtHead(head);
        printNode(deletehead);

    }

    public static Node deleteAtHead(Node head){
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;

        return head;

    }
}
