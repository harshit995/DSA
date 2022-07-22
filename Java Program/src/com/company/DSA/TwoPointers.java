package com.company.DSA;

public class TwoPointers {
    static  boolean isSum(int[] arr,int n,int sum){
        int low=0,high=n-1;
        while(low<=high) {
            if (arr[low] + arr[high] == sum) {
                return true;
            } else if (arr[low] + arr[high] > sum) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={6,1,0,1,2};
        int n=arr.length;
        int sum=7;
        System.out.println(isSum(arr,n,sum));
    }
}
