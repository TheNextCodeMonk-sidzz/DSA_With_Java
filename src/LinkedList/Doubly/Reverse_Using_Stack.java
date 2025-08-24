package LinkedList.Doubly;

import java.util.Stack;
import LinkedList.Doubly.Reverse_a_doubly_linked_list.Node;
import static LinkedList.Doubly.Reverse_a_doubly_linked_list.printNode;


public class Reverse_Using_Stack {
    public static void main(String[] args) {
        int[] arr={1,2,3,8,7,9,10};
        Node head=Reverse_a_doubly_linked_list.createDLL(arr);
        printNode(head);
        Node newNode=reverseUsingStack(head);

        printNode(newNode);
    }

    static Node reverseUsingStack(Node res){
        Stack<Integer> stack=new Stack<>();
        Node temp=res;

        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        temp=res;
        while(temp!=null){
            temp.val=stack.pop();
            temp=temp.next;
        }
        return res;
    }


}
