package com.company.DSA;
public class Searching {
    public static void main (String[]args){
        int[] arr={1,2,5,6,7,9};
        int x=6;
        int n =arr.length;
//                System.out.println("element is" + bsearchs(arr,x,n));
        int answer= bsearchs(arr,x,n);
        System.out.println(answer);
    }
    public static int bsearchs(int[] arr, int x, int n) {
        int low = 0;
        int high = n - 1;
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
}

