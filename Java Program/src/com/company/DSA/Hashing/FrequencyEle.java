package com.company.DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyEle {
    static int freqEle(int[] arr,int n){
        HashMap <Integer,Integer> h =new HashMap<>();
        for (int x:arr) {
            h.put(x,h.getOrDefault(x,0)+1);
        }
        System.out.println(h);
        for (Map.Entry<Integer,Integer> e: h.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());

        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={6,5,5,2,3};
        int n=arr.length;
        System.out.println(freqEle(arr,n));
    }
}
