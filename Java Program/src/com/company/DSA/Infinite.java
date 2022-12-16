package com.company.DSA;

public class Infinite {
    static int infiniteSearch(int[] arr,int x){
        if(arr[0]==x) return 0;
        int i=1;
        while(arr[i]<x){
          i=i*2;
          if(arr[i]==x) return i;
        }
        return bSearch(arr,x,(i/2)+1,i-1);
    }
    static int bSearch(int[] arr, int x, int low,int high) {
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,8,9,9,99,300,200000,400000,3131313,131313555};
        System.out.println("Index at " + infiniteSearch(arr,999));
    }
}
