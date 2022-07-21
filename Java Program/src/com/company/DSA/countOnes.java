package com.company.DSA;

public class countOnes {
    static int  countOnes(int[] arr,int n){
        int low=0,high=n-1;
        while(low<=high){
            int mid=low +((high-low)/2);
            if(arr[mid]==0){
                low=mid+1;
            }
            else{
                if(mid==0|| arr[mid-1]!=arr[mid]){//arr[mid-1]==0
                    return (n-mid);
                }
                else{
                    high=mid-1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1};
        int n=arr.length;
        System.out.println("Count is " + countOnes(arr,n));
    }
}
