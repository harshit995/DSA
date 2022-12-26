package com.company.DSA.Array;
//{2,5,3,6}
public class secondLargest {
    static int secondLargest(int[] arr){
        int res=-1,largest=0,n=arr.length;
        for(int i=1;i<n;i++){
          if(arr[i]>arr[largest]){
              res=largest;
              largest=i;
          }
          else if(arr[i]!=arr[largest]){
              if(res==-1||arr[i]>arr[res]){
                  res=i;
              }
          }
        }
            return arr[res];
    }
    public static void main(String[] args) {
        int arr[]={8,9,22,12};
        System.out.println("Second Largest element is " + secondLargest(arr));
    }
}
