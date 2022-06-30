package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */

//        int[][] arr= new int [3][]; // rows column

//        int[][] arr= {
//                {1,2,3},// oth index
//                {4,5}, //1
//                {7,8,9,5,6} //2
//        };


//        int [][] flats = new int[2][3];
//        flats[0][0] =001;
//        flats[0][1] =002;
//        flats[0][2] =003;
//        flats[1][0] =101;
//        flats[1][1] =102;
//        flats[1][2] =103;
//
//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length ; j++) {
//                System.out.print(flats[i][j] + " ");
//            }
//            System.out.println("");
//        }



//     int[][] arr = new int[3][3];
//        System.out.println(arr.length); // no. of rows
//        //input
//
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col =0; col<arr[row].length;col++){
//                arr[row][col]=in.nextInt();
//            }
//
//        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col =0; col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//
//        }

//        for (int row = 0; row <arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//
//        for (int[] a: arr){
//            System.out.println(Arrays.toString(a));
//        }

//        questions

//        int sum=0;
//        int a =5;
//        int[]marks={5,7,5,6};
//        for (int element:marks) {
//           if(a==element){
//               System.out.println("matched");
//           }
//           sum=sum+element;
//        }
//        System.out.println(sum);

        int[][] mat1 = {{1,2,3},
                        {4,5,6}};
        int[][] mat2 = {{2,6,13},
                        {3,7,6}};
        int[][] result = {{0,0,0},
                          {0,0,0}};

        for (int i = 0; i < mat1.length; i++) {//row number times
            for (int j = 0; j < mat1[i].length; j++){ //column number times
                System.out.format("setting value for i=%d and j=%d\n" ,i,j);
                result[i][j]=mat1[i][j]+mat2[i][j];
            }

        }

        for (int i = 0; i < mat1.length; i++) {//row number times
            for (int j = 0; j < mat1[i].length; j++){ //column number times
                System.out.print(result[i][j]+ " ");
//                result[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.println("");
        }
    }
}
