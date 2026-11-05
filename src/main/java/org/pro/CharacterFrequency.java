package org.pro;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

    public static void display(String[] args) {

        String input = "programming";

        Map<Character, Long> frequencyMap =
                input.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));

        frequencyMap.forEach((key, value) ->
                System.out.println(key + " = " + value)
        );
    }
}

