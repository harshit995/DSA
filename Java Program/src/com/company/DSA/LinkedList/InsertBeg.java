package com.company.DSA.LinkedList;

public class InsertBeg {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static  Node insertBegin(Node head, int a) {
        Node temp = new Node(a);
        if (head == null) {
            head=temp;
            return head;
        }
        temp.next = head;
        head = temp;
        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head=insertBegin(head, 52);
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

