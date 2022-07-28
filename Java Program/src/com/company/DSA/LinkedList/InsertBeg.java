package com.company.DSA.LinkedList;

public class InsertBeg {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    static Node insertBegin(Node head,int a){
        Node temp=new Node(a);
        temp.next=head;
        return temp;

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        System.out.println( insertBegin(head,52));
        }
    }

