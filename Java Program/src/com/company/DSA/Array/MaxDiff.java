package com.company.DSA.Array;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxDiff {
    static int MaxDifference(int[] arr,int n){
        int res=arr[1]-arr[0];
        int minvalue =arr[0];
        for(int j=1;j<n;j++){
            res=max(res,arr[j]-minvalue);
            minvalue=min(minvalue,arr[j]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={8,9,22,12,6};
        System.out.println("Max difference is " +  MaxDifference(arr,5));
    }
}
