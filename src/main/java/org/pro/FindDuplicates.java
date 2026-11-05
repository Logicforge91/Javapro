package org.pro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void display(String[] args){
        int[] numbers ={1,2,3,4,5,6,5,4,3,2,1 };

        Set<Integer>  unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        Arrays.stream(numbers)
                .filter(n->!unique.add(n))
                .forEach(duplicates::add);

        System.out.println("Duplicate Elements:"+duplicates);
    }
}
