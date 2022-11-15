package com.company.DSA.Array;

public class sorted {
    static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={8,9,22,12};
        System.out.println("sorted : " + isSorted(arr));
    }
}
