package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.Map;

public class MapFromKeysMain {
    public static void main(String[] args) {
        Map<String, Integer> sourceMap = new HashMap<>();

        sourceMap.put("one", 1);
        sourceMap.put("two", 2);
        sourceMap.put("three", 3);
        sourceMap.put("five", 4);
        sourceMap.put("ten", 10);

        new MapFromKeysCreator().createMap(sourceMap);
    }
}
