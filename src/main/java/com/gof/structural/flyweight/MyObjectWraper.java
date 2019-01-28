package com.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public final class MyObjectWraper {
    static Map<String, MyObject> pool = new HashMap<>();

    public static MyObject valueOf(String name) {
        if (pool.containsKey(name)) {
            return pool.get(name);
        } else {
            MyObject result = new MyObject(name);
            pool.put(name, result);
            return result;
        }
    }
}
