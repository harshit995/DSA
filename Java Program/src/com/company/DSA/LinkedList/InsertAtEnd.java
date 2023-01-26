package com.company.DSA.LinkedList;

public class InsertAtEnd {
//static class Node{
//    int data;
//    Node next;
//    Node(int x){
//        data=x;
//        next=null;
//    }
//
//    static Node insertEnd(Node head,int a){
//        Node temp=new Node(a);
//        if(head==null){
//            return temp;
//        }
//        else{
//            Node curr =head;
//            while(curr.next!=null){
//                curr=curr.next;
//            }
//            curr.next=temp;
//            return head;
//        }
//    }
//    public static void main(String[] args) {
//        Node head = new Node(10);
//        head.next=new Node(20);
//        System.out.println( insertEnd(head,52));
//}
//}

    static class Node{
        int data;
        Node next;
        Node(int x ){
            data=x;
            next=null;
        }
    }

    public static Node insertAtEnd(Node head,int a){
        Node temp=new Node(a);
        if(head==null){
            head=temp;
            return head;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        insertAtEnd(head, 52);
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
