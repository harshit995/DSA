package com.company.DSA.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashsets {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        //insert
        set.add(90);
        set.add(30);
        set.add(3);
        set.add(15);

        System.out.println(set);

        //search
        if(set.contains(1)){
            System.out.println("it contains");
        }else{
            System.out.println("does not contain");
        }

        set.remove(30);

        System.out.println("size is "+set.size());

        //iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
