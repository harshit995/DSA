package com.company.DSA;

public class LastOcc {
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
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,8,9,9};
        int x=9;
        int n=arr.length;
        System.out.println("element last occ is " + lastOcc(arr,n,x));
    }
}
