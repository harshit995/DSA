package com.company.DSA.Hashing;

import java.util.HashSet;

public class CountDistinct {
    static int count(int[] arr,int n){
        HashSet <Integer> h= new HashSet<Integer>();
        for (int i = 0; i < n ; i++) {
            h.add(arr[i]);
        }
        System.out.println(h);
        return h.size();

    }

    public static void main(String[] args) {

        int[] arr={6,5,6,6,2,3};
        int n=arr.length;
        System.out.println(count(arr,n));
        }
    }

