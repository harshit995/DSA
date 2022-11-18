package com.company.DSA.Array;

public class leftRotateByD {
    static void Rotate(int []arr,int d){
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        for (int element:arr) {
            System.out.print(element+" ");
        }
    }

    static void reverse(int arr[],int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] arr={7,5,1,32,6};
        Rotate(arr,2);
    }
}
