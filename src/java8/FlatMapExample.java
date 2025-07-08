package java8;

/*
 Scenario:
Given a list of words, return a list of unique characters
 */

/*
2. What is the difference between map() and flatMap()
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world");
        List<Character> uniqueChars = words.stream()
                .map(word -> word.chars().mapToObj(c -> (char) c))
                .flatMap(charStream -> charStream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueChars);
    }
}
