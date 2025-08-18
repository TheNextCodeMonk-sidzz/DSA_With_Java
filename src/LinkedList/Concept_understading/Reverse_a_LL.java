package LinkedList.Concept_understading;

public class Reverse_a_LL {
    //create a node class
    static class Node{
        int data;
        Node Next;

        Node(int data1, Node Next1){
            this.data=data1;
            this.Next=Next1;
        }

        Node(int data1){
            this.data=data1;
            this.Next=null; // or just dont define
        }
    };

    // create a main func

    public static void main(String[] args) {
        Node head = new Node(1);
        head.Next = new Node(2);
        head.Next.Next = new Node(3);
        head.Next.Next.Next = new Node(4);
        head.Next.Next.Next.Next = new Node(5);

        // Now you can call your reverse function like:
        // head = reverseList(head);

        // Print the list before reversing (for checking)
        printList(head);

        head=reverseLinkedList(head);
        printList(head);

    }

    // create a reverseLL function

    static Node reverseLinkedList(Node head){

        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr!=null){

            next=curr.Next;
            curr.Next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }

    // function to write or print the node
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.Next;
        }
        System.out.println("null");
    }
}
