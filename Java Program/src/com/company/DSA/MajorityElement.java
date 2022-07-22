package com.company.DSA;

import javax.swing.*;

public class MajorityElement {
    static int majorityEle(int[] arr,int n){
        int res=0,count=1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else
                count --;

        if(count==0){
            res=i;
            count=1;
        }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]) count++;
        }
        if(count> n/2){
            return res;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={6,1,2,2,2};
        int n=arr.length;
        System.out.println(majorityEle(arr,n));
    }
}
