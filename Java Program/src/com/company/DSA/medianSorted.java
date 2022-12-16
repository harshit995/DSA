package com.company.DSA;

public class medianSorted {
    static  double median(int[] arr1, int[] arr2,int n1,int n2){
        int low=0,high=n1-1;
        while(low<=high){
            int i1=(low +high)/2;
            int i2=((n1+n2+1)/2)-i1;
            int min1,min2,max1,max2;
            if(i1==n1){
                min1=Integer.MAX_VALUE;
            }
            else{
                min1=arr1[i1];
        }if(i1==0){
                max1=Integer.MIN_VALUE;
            }
            else{
                max1=arr1[i1-1];
        }if(i2==n2){
                min2=Integer.MAX_VALUE;
            }
            else{
                min2=arr2[i2];
        } if(i2==0){
                max2=Integer.MIN_VALUE;
            }
            else{
                max2=arr2[i2-1];
        } if(max1<=min2 && max2<=min1){
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
        int[] arr2={30,50,60,72};
        int n1=arr1.length;
        int n2=arr2.length;
        System.out.println("Median is " +median(arr1,arr2,n1,n2));
    }
}
