package LinkedList.Doubly;
import static LinkedList.Doubly.Creating_doubly_LL.Node;
import static LinkedList.Doubly.Creating_doubly_LL.convertArrToLL;
import static LinkedList.Doubly.Creating_doubly_LL.printNode;


public class Delete_at_tail {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,2,3,4,5};

        Node head=convertArrToLL(arr);
        printNode(head);

        Node delete=deleteAtTail(head);
        printNode(delete);
    }

    public static Node deleteAtTail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next; // put prev= temp.next and return the last valid not null value
        }
        // goes to the last element and then check for its prev/ back element value and stores it in a node
        Node prev= temp.back;
        // make the second last value point to null to ignore;
        prev.next=null;
        //point the last element or temp to null ie < replace temp's back value as null so nothing points to it so java collects to garbage value
        temp.back=null;
        return head;

    }
}
