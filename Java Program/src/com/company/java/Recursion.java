package com.company.java;

public class Recursion {
    static int factorial (int n){
//        fact(n) = n * fact(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("the fact is " + factorial(5));
    }
}
