package com.mkyong.lambda;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {

        Comparator<Developer> byName = new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }
}
