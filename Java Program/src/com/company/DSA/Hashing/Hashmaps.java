package com.company.DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //insertion
        map.put("india",120);
        map.put("US",220);
        map.put("AFRICA",100);
        map.put("china",100);

//        System.out.println(map);

        //update
        map.put("china",90);
        System.out.println(map);

        //searching for key
        if(map.containsKey("china")){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }

        //for value
        System.out.println(map.get("china"));

        map.remove("US");

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

    }

}
