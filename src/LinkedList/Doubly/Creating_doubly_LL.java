package LinkedList.Doubly;



public class Creating_doubly_LL {

    static class Node{

        int data;
        Node prev;
        Node next;

        Node(int data , Node prev, Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }

        Node(int data){
            this.data=data;
        }

    }


    private static Node convertArrToLL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            mover.next=newNode;
            mover=mover.next; //now it will move to next noce
        }
        return head;
    }

    private static Node printNode(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;// this will print 3
        }
        System.out.println("null");
        return head;
    }

    static Node insertAtHeadDLL(Node head,int k){
        Node node=new Node(k);
        node.next=head;
        node.prev=null;
        if(head!=null) {
            head.prev = node;
        }
        head=node;
        return head;

    }


    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,2,3,4,5};

        Node head=convertArrToLL(arr);
        printNode(head);
        Node res=insertAtHeadDLL(head,20);
        printNode(res);

    }
}
