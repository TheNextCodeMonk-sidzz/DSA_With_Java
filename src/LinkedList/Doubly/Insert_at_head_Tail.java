package LinkedList.Doubly;
import static LinkedList.Doubly.Creating_doubly_LL.Node;
import static LinkedList.Doubly.Creating_doubly_LL.convertArrToLL;
import static LinkedList.Doubly.Creating_doubly_LL.printNode;


public class Insert_at_head_Tail {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 2, 3, 4, 5};

        Node head = convertArrToLL(arr);
        printNode(head);

//        Node newhead=insertAtHead(head);
//        printNode(newhead);
        Node tailhead=insertAtTail(head);
        printNode(tailhead);
    }

    public static Node insertAtHead(Node head){

        Node newNode= new Node(10);

        newNode.next=head;
        head.back=newNode;
        newNode.back=null;
        head=newNode;

        return head;
    }

    public static Node insertAtTail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode= new Node(13,temp,temp.back );
        temp.back.next=newNode;
        temp.back=newNode;



        return head;
    }
}
