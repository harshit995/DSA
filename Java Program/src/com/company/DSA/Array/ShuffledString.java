package com.company.DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;

class ShuffledString {
    public static String restoreString(String s, int[] in) {
        char[] c = new char[in.length];
        for(int i = 0; i < in.length; i++)
            c[in[i]] = s.charAt(i);
        return new String(c);
    }

//    public static String restoreString(String s,int[]in){
//        ArrayList<Character> list=new ArrayList<>(in.length);
//        char[] ch = s.toCharArray();
//        System.out.println(ch);
//        for(int i=0;i<in.length;i++){
//            list.add(in[i],ch[i]);
//        }
//        int[] arr=new int[list.size()];
//        for(int i=0;i<list.size();i++){
//            arr[i]=list.get(i);
//        }
//        return Arrays.toString(arr);
//    }

    public static void main(String[] args) {
        String s="codeleet";
        int[] n={4,5,6,7,0,1,2,3};
        System.out.println(restoreString(s,n));
    }
}