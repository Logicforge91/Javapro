package org.pro;

public class ArthException {

    public static void display(String[] args){

        try {
            System.out.println("A");
            int r1 = 10 / 0;
            System.out.println("B");

        } catch (ArithmeticException e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
    }
}
