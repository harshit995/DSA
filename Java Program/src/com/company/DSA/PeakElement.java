package com.company.DSA;

public class PeakElement {
    static int peakEle(int[] arr,int n){
        int low=0,high=n-1;
        while(low<=high){
            int mid = low + ((high - low) / 2);
           if(mid==0 || arr[mid-1] < arr[mid] && mid==n-1 || arr[mid+1] <= arr[mid]){
               return mid;
           }
            else if(arr[mid]<=arr[mid-1] && mid>0){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={6,1,0,1,2};
        int n=arr.length;
        System.out.println("peak element is "+ peakEle(arr,n));
    }
}
