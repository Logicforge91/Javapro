package org.pro;


    import java.util.Arrays;
import java.util.Comparator;

    public class SecondHighest {

        public static void display(String[] args) {

            int[] numbers = {10, 20, 30, 40, 50, 50, 30};

            Integer secondHighest = Arrays.stream(numbers)
                    .distinct()
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst()
                    .orElseThrow(() ->
                            new IllegalArgumentException(
                                    "Second highest distinct number not found"
                            )
                    );

            System.out.println(
                    "Second highest distinct number: " + secondHighest
            );
        }
    }

