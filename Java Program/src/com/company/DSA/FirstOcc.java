package com.company.DSA;

public class FirstOcc {

    static int firstOcc(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
         int mid = low + ((high - low) / 2);
         if(arr[mid]>x){
             high=mid-1;
         }
         else if(arr[mid]<x){
             low=mid+1;
         }
         else{
             if(mid==0 || arr[mid-1]!=arr[mid]){
                 return mid;
             }
             else{
                 high=mid-1;
             }
         }

        }
        return -1;
    }
    public static void main(String[] args) {
    int[] arr={1,3,5,8,9,9};
    int x=9;
        System.out.println("element first occ is " + firstOcc(arr,x));
    }
}
