package LinkedList.Doubly;

public class Reverse_a_doubly_linked_list {
    // creating Node class ............................

    static class Node{
        int val;
        Node back;
        Node next;

        public Node(int val,Node back, Node next) {
            this.back = back;
            this.val = val;
            this.next = next;
        }

        public Node(int val){
            this.val=val;
        }
    }

    // creating a DLL ..............................................

    static Node createDLL(int[] arr){
        Node head=new Node(arr[0]);
        int n=arr.length;
        Node prev=head;
        for(int i=1;i<n;i++){
            Node temp=new Node(arr[i], prev,null);
            prev.next=temp;
            prev=temp;
        }
        return head;

    }
// printing the DLL........................................

    public static Node printNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;// this will print 3
        }
        System.out.println("null");
        return head;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,8,7,9,10};

        Node res=createDLL(arr);
        printNode(res);
        Node ans=reverse_DLL(res);
        printNode(ans);

    }

    // think of (a,b) swap. swap prev and next . keep the temp running
    // but you need to have a 3rd variable to store the prev , cuz its should't overwrite
    // and return the prev.back. cuz we rooling prev and back.

    public static Node reverse_DLL(Node head){
        Node temp=head;
        Node prev=null;

        while(temp!=null){
            prev=temp.back;
            temp.back=temp.next;
            temp.next=prev;
            temp=temp.back;

        }

        return prev.back;
    }





}
