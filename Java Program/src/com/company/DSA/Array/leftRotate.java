package com.company.DSA.Array;

public class leftRotate {
    static void leftRotation(int[] arr){
        int n= arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;
        for (int element: arr) {
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={8,9,22,12,6};
         leftRotation(arr);
    }
}
