package com.company.DSA.Array;

public class Frequency {
    static void freq(int[] arr){
        int n=arr.length;
        int freq = 1, i = 1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.print(arr[i-1] +" freq is " + freq +" ");
            System.out.println(" ");
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.print("" +arr[n-1] +" freq is " + 1 );

        }
    }
    public static void main(String[] args) {
        int[] arr={8,8,9,22,42,42,66};
        freq(arr);
    }
}
