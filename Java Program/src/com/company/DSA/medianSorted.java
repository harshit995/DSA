package com.company.DSA;

public class medianSorted {
    static  double median(int[] nums1, int[] nums2,int n1,int n2){
        int low=0,high=n1;
        int mid=((n1+n2+1)/2);
        while(low<=high){
            int i1=(low +high)/2;
            int i2=mid-i1;
            int max1 = (i1 > 0)? nums1[i1 - 1]: Integer.MIN_VALUE;
            int max2 = (i2 > 0) ? nums2[i2 - 1]: Integer.MIN_VALUE;
            int min1 = (i1 < n1)? nums1[i1]: Integer.MAX_VALUE;
            int min2 = (i2 < n2)? nums2[i2]: Integer.MAX_VALUE;
         if(max1<=min2 && max2<=min1){
                if((n1+n2)%2==0){
                    return ((double)Math.max(max1,max2)+Math.min(min1,min2))/2;
                }
                else{
                    return ((double)Math.max(max1,max2));
            }
            }
            else if(max1>min2){ high=i1-1;}
            else { low=i1+1;}
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1={3,5,6};
        int[] arr2={30,50,60};
        int n1=arr1.length;
        int n2=arr2.length;
        System.out.println("Median is " +median(arr1,arr2,n1,n2));
    }
}
