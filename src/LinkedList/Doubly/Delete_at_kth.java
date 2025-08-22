package LinkedList.Doubly;

import static LinkedList.Doubly.Creating_doubly_LL.Node;
import static LinkedList.Doubly.Creating_doubly_LL.convertArrToLL;
import static LinkedList.Doubly.Creating_doubly_LL.printNode;

public class Delete_at_kth {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 2, 3, 4, 5};

        Node head = convertArrToLL(arr);
        printNode(head);

        Node ans=deleteAtK(head, 3);
        printNode(ans);


    }

    public static Node deleteAtK(Node head, int k){

        Node temp=head;
        int count=0;

        while(temp!=null){
            if (count == k) {
                // Case 1: deleting the head
                if (temp.back == null) {
                    head = temp.next;         // move head
                    if (head != null) head.back = null;
                }
            }
                count++;
            if(count==k){
                Node prev=temp.back; // no need
                prev.next=temp.next; // can also dp , temp.back.next=temp.next;
                temp.next.back = prev; // temp.next.back=temp.back;
                temp.back=null;
                temp.next=null;
            }
            temp=temp.next;
        }


        return head;
    }
}
