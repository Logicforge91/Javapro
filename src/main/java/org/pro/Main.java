package org.pro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome Java!");

        TextUtility.display(args);
        Stream.display(args);
        ArthException.display(args);
        Collection.display(args);
        Threads.display(args);
        ExceptionHandling.display(args);
        try {
            Concurrency.display(args);
        } catch (InterruptedException e) {
            System.out.println("Concurrency execution was interrupted: " + e.getMessage());
        }
        FindDuplicates.display(args);
        FirstNonRepeatingCharacter.display(args);
        SecondHighest.display(args);
        CommonElements.display(args);
        CharacterFrequency.display(args);



    }
}