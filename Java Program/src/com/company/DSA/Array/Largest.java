package com.company.DSA.Array;

public class Largest {
    static int large(int  arr[]){
        int res=0;
        for(int i=1; i< arr.length; i++){
            if(arr[res]<arr[i]){
                res=i;
            }
        }
        return arr[res];
    }

    public static void main(String[] args) {
        int arr[]={8,9,22,12};
        System.out.println("Largest element is " + large(arr));
    }
}
