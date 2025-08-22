package LinkedList.Doubly;



public class Creating_doubly_LL {

    public static class Node{

        int data;
        Node back;
        Node next;

        Node(int data ,  Node next,Node back){
            this.data=data;
            this.back=back;
            this.next=next;
        }

        Node(int data){
            this.data=data;
            next=null;
            back=null;
        }

    }


    public static Node convertArrToLL(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i], null, prev);
            prev.next=temp; // point to temp
            prev=temp; // move to temp
        }
        return head;
    }

    public static Node printNode(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;// this will print 3
        }
        System.out.println("null");
        return head;
    }

    private static Node insertAtHeadDLL(Node head,int k){
        Node node=new Node(k);
        node.next=head;
        node.back=null;
        if(head!=null) {
            head.back = node;
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
