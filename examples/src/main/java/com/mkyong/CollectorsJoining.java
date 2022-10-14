package com.mkyong;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoining {
    public static void main(String[] args) {
        {
            List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
            //java | python | nodejs | ruby
            String result = list.stream().map(x -> x).collect(Collectors.joining(" | "));

            System.out.println(result);
        }

        CollectorsJoining dummy = new CollectorsJoining();
        dummy.test();
    }

    void test() {

        List<Game> list = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        //{Dragon Blaze, Angry Bird, Candy Crush}
        String result = list.stream().map(x -> x.getName())
                .collect(Collectors.joining(", ", "{", "}"));

        System.out.println(result);
    }

    class Game {
        String name;
        int ranking;

        public Game(String name, int ranking) {
            this.name = name;
            this.ranking = ranking;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }
    }

}
