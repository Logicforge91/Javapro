package org.pro;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class CommonElements {

    public static void display(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {30, 40, 50, 60, 70};

        Set<Integer> set = Arrays.stream(arr2)
                .boxed()
                .collect(Collectors.toSet());

        Set<Integer> commonElements = Arrays.stream(arr1)
                .filter(set::contains)
                .boxed()
                .collect(Collectors.toSet());

        System.out.println("Common Elements: " + commonElements);
    }

}
