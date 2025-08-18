package LinkedList.Concept_understading;

/// Steps to create a Linked List
//  1. Create a Node Class -> give two arguments (Data, next)
//   2.Define Variables inside node class
//    3.Create Constructor to initialize the objected created from the class
//     4.      Create a main class (Linked list)



public class Creating_LinkedList {
    // create a new type of class Node
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


    // func to conver an array to Linked list
    private static Node converArrToLL(int[] arr){
        Node headNode=new Node(arr[0]);
        Node mover=headNode;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            mover.Next=newNode;
            mover=mover.Next; //now it will move to next noce
        }
        return headNode;
    }

    private static Node PrintNode(Node headNode){
        Node temp=headNode;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.Next;// this will print 3
        }
        System.out.println("null");
        return headNode;
    }

    // function to delete a node at head position
    private static Node deleteHeadNode(Node headNode){
        Node temp=headNode.Next;
        return temp;
    }

    // function to delete a node at tail position
    private static Node deleteTailNode(Node headNode){
        if(headNode!=null && headNode.Next==null){
            return null;
        }
        Node temp=headNode;
        while(temp.Next.Next!=null){
            temp=temp.Next;
        }
        temp.Next=null;
        return headNode;
    }

    // function to delete kth node

    private static Node deleteKthNode(Node headNode, int k){
        if(headNode==null) return headNode;
        if(k==1){
            Node temp=headNode;
            headNode=headNode.Next;
            return headNode;
        }

        Node temp=headNode;
        int count=0;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==k) {
                prev.Next = prev.Next.Next;
                break;
            }
            prev=temp;

            temp=temp.Next;
        }
        return headNode;
    }


    //write a main function where code will be executed
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node headNode= converArrToLL(arr);
//        Node result=deleteHeadNode(headNode);
//        PrintNode(result);
//        Node result1=deleteTailNode(headNode);
//        PrintNode(result1);
        Node result2=deleteKthNode(headNode,3);
        PrintNode(result2);

    }
}
