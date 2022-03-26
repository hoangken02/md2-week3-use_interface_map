package com.kenIT;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //use HashMap
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("11",11);
        hashMap.put("12",12);
        hashMap.put("3",15);
        hashMap.put("1",17);
        hashMap.put("b",10);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        //use TreeMap
        // sắp xếp các key theo thứ tự 1 - 9 > A - Z > a -z
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in HashMap");
        System.out.println(treeMap + "\n");


        //use LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
