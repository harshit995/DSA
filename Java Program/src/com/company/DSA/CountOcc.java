package com.company.DSA;

 class CountOcc {
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

    static int lastOcc(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
                    ;
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }


    static int  countOcc(int[] arr,int n ,int x){

        int first = firstOcc(arr,x);
        if (first==-1){
            return 0;
        }
        else{
            return (lastOcc(arr,n,x)-first+1);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,5,5,7};
        int x=5;
        int n=arr.length;
        System.out.println("Count is " + countOcc(arr,n,x));

    }
}
