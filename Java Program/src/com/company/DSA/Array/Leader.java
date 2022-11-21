package com.company.DSA.Array;
public class Leader {
    static void CurrentLeader(int[] arr,int n){
        int currleader=arr[n-1];
        System.out.print(currleader);
        for (int i = n-2; i >=0 ; i--) {
            if(currleader<arr[i]){
                currleader=arr[i];
                System.out.print(currleader +" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={8,9,22,12,6};
        CurrentLeader(arr,5 );
    }
}
