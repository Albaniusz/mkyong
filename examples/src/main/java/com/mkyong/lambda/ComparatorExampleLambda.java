package com.mkyong.lambda;

import java.util.Comparator;

public class ComparatorExampleLambda {
    public static void main(String[] args) {
        Comparator<Developer> byName = (Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName());
    }
}
