package com.company.DSA.Array;

public class delete {
    static int deletes(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                break;
            }
            if (i == n) return n;

            for (int j = i; j < n - 1; j++) {
                arr[j] = arr[j + 1];

            }

        }
        return n - 1;
    }
        public static void main (String[]args){
            int arr[] = {8, 9, 22, 12, 6};
            System.out.println("Length  is " + deletes(arr, 5, 6));
        }

}