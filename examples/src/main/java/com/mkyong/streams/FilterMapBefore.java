package com.mkyong.streams;

import java.util.HashMap;
import java.util.Map;

public class FilterMapBefore {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "linode.com");
        map.put(2, "heroku.com");

        String result = "";
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if ("something".equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
    }
}
