package com.company;
import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        // take input of two numbers amd print sum
//        int  num1,num2,sum;
//
//        System.out.println("enter no. 1");
//        num1=in.nextInt();
//        System.out.println("enter 2 no.");
//         num2=in.nextInt();
//         sum=num1+num2;
//        System.out.println("sum is " + sum);

        int ans = sum3(4,5);
        System.out.println(ans);
    }

    // static  void sum(){
//        Scanner in= new Scanner(System.in);
//        System.out.println("enter no. 1");
//        int num1=in.nextInt();
//        System.out.println("enter 2 no.");
//        int num2=in.nextInt();
//        int sum=num1+num2;
//        System.out.println("sum is " + sum);

    //pass the value of numbers when you are calling the method in  main()
 static  int sum3(int a, int b){
        int sum = a+b;
        return sum;
 }
    // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no. 1");
        int num1 = in.nextInt();
        System.out.println("enter 2 no.");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

//            System.out.println("This will never execute");
    }


    /*
    return_type name(arguments) {
    //body
    return statement;

     */
}

