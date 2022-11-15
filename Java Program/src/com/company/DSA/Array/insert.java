package com.company.DSA.Array;

public  class insert{
   static int insertAtPos(int[] arr, int n, int x, int pos, int cap){
        if(n==cap){
            return n;
        }
        int idx=pos-1;
        for(int i=n-1;i>=idx;i--){
        arr[i+1]=arr[i];
        arr[idx]=x;
        }
return (n+1);
}

public static void main(String[] args){
    int[] arr =new int[6];
    System.out.println("length is " + insertAtPos(arr,4,3,2,6));
}
}