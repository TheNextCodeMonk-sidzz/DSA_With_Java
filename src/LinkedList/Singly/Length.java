package LinkedList.Singly;

public class Length {
    static class Node{
        int data;
        Node next;
        Node(int a){  data = a; next = null; }
    }
    public int getCount(Node head) {
        // code here
        Node temp=head;
        int count =0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;

    }
}
