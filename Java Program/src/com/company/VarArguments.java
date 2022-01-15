package com.company;

import java.util.Arrays;

public class VarArguments {
    public static void main(String[] args) {
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
