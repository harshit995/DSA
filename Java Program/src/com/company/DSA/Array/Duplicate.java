package com.company.DSA.Array;

public class Duplicate {
    static int duplicates(int[] arr,int n){
        int res=1;
        for (int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={8,9,22,12};
        System.out.println("Largest element is " + duplicates(arr,4));
    }
}
