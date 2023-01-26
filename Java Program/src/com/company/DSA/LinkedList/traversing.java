package com.company.DSA.LinkedList;

public  class traversing {
    static class Node {
         int data;
         Node next;

         Node(int x) {
             data = x;
             next = null;
         }

     }
         public static void main(String[] args) {
             Node head = new Node(10);
             head.next = new Node(20);
             head.next.next = new Node(30);
             traverse(head);
         }

         public static void traverse(Node head) {
             Node curr = head;
             while (curr != null) {
                 System.out.print(curr.data + " ");
                 curr = curr.next;
             }
         }

}
