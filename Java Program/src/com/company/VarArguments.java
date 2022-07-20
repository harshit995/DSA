package com.company;

import java.util.Arrays;

public class VarArguments {
    static int sum(int ...arr ){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum is " + sum(4,5,6));

        fun(2,3,4,5,6,7,9);
//        multiple(2,3,"harshit","harshit gupta");
demo(3,4,5,6);
demo("harshit");
    }

    static  void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static  void demo(String ...v){
        System.out.println(Arrays.toString(v));

    }
    static void multiple(int a ,int b,String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
