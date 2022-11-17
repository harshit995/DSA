package com.company.DSA.Array;

public class MoveAllZero {
    static void toMoveEnd(int []arr){
        int n= arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;

            }
        }
        for (int element: arr) {
            System.out.print(element +" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={8,9,0,0,22,12};
        toMoveEnd(arr);
    }
}
