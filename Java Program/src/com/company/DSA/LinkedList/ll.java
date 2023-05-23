package com.company.DSA.LinkedList;

import java.util.Scanner;

public class ll {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val , ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ListNode head= new ListNode(in.nextInt());
        ListNode curr=head;
        while(in.hasNext()){
            curr.next=new ListNode(in.nextInt());
            curr=curr.next;
        }


    }
}
