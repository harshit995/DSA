package com.company.DSA.Array;

public class reverse {
    static void reversing(int [] arr, int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println("Reversed array is: \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr ={8,9,22,12};
        reversing(arr,4);

    }
}
