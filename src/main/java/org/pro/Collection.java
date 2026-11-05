package org.pro;

import java.util.HashMap;
import java.util.Map;

public class Collection {

    public static void display(String[] args){


        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("A", 30);
        System.out.println(map.size());
        System.out.println(map.get("A"));
    }
}
