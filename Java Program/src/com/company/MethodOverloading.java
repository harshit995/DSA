package com.company;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(34);
        fun("harshit");
        int ans=sum1(2,5);
        System.out.println(ans);
    }
    static int sum1(int a,int b){
        return a+b;
    }
    static  void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);

    }
}
