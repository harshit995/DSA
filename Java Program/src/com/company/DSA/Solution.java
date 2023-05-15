package com.company.DSA;

class Solution {
    public int getDecimalValue(ListNode head) {
        int len=0;
        for(ListNode curr=head;curr!=null;curr=curr.next){
            len++;
        }
        int i=1,sum=0;
        ListNode curr=head;
        while(curr!=null){
            sum+=((curr.val)*(Math.pow(2,len-i)));
            curr=curr.next;
            i++;
        }
        return sum;
    }
}