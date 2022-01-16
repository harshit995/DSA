package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        int[] arr =new int [5];
//        arr[0]=23;
//        arr[1]=73;
//        arr[2]=13;
//        arr[3]=33;
//        arr[4]=93;
//        System.out.println(arr[3]);
        //input using for loop
//        for (int i=0;i<=arr.length;i++){
//            arr[i]=in.nextInt();
//        }


//        for (int i=0;i<=arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
        String[] str = new String[5];

        for (int i = 0; i < str.length ; i++) {
            str[i]=in.next();
        }

        System.out.println(Arrays.toString(str));


//        for (int i=0;i<=arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

        // for each
//        for(int num : arr){ //for every element in array print element
//            System.out.println(num + " "); // num = element
//        }



    }
}
