package com.mkyong;

import java.util.stream.Stream;

public class ForLoopEnumStream {
    public static void main(String[] args) {
        Stream.of(Programming.values())
                .filter(x -> !x.toString().equals("SCALA"))
                .forEach(System.out::println);
    }
}
