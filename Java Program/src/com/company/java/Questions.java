package com.company.java;

public class Questions {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//
//        int n=3;
//        int sum=0;
//        int i=1;
//        while(i<=n){
//            sum=sum+(2*i);
//            i++;
//        }
//        System.out.println(sum);


//        int n=3;
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(n*i);
//        }

//        int n=3;
//        int pro=1;
//        for (int i = 1; i <=n; i++) {
//            pro=pro*i;
//        }
//        System.out.println(pro);



//        int[] arr={5,2,4,3,1,8};
//        int l= arr.length;
//        int temp;
//        int n =Math.floorDiv(l,2);
//        for (int i = 0;  i < n; i++) {
//            //swap a[i] and a[l-1-i]
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//
//        for ( int element:arr) {
//            System.out.printf("{%d}",element);
//        }

//        int[] arr={5,2,4,3,1,8};
//        int max=0;
//        for (int e:arr) {
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println(max);
        boolean isSorted=true;
        int[] arr={5,2,4,3,1,8};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("sorted");
        }
        else {
            System.out.println("not sorted");
        }
    }
}
