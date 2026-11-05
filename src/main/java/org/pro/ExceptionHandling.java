package org.pro;

public class ExceptionHandling {
    public static void display(String[] args){
        try {
            System.out.println("Try");
            return;
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }

    }
}
