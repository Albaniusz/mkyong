package com.mkyong;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {
    public static void main(String[] args) {
        {
            StringJoiner sj = new StringJoiner(",");
            sj.add("aaa");
            sj.add("bbb");
            sj.add("ccc");
            String result = sj.toString(); //aaa,bbb,ccc

            System.out.println(result);
        }

        {
            StringJoiner sj = new StringJoiner("/", "prefix-", "-suffix");
            sj.add("2016");
            sj.add("02");
            sj.add("26");
            String result = sj.toString(); //prefix-2016/02/26-suffix

            System.out.println(result);
        }

        {
            //2015-10-31
            String result = String.join("-", "2015", "10", "31");

            System.out.println(result);
        }

        {
            List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
            //java, python, nodejs, ruby
            String result = String.join(", ", list);

            System.out.println(result);
        }
    }
}
