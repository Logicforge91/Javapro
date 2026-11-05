package org.pro;

import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void display(String[] args){

        List<Integer>  n1 = Arrays.asList(10,20,30,40,50);
        int r1 = n1.stream().filter(n->n>20).map(n->n*2).reduce(0, Integer::sum);

        System.out.println(r1);
    }
}
