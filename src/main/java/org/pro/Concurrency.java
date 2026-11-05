package org.pro;

public class Concurrency {
    private static int count = 0;

    // Must declare throws InterruptedException because of t1.join()
    public static void display(String[] args) throws InterruptedException {
        count = 0;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                count++;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                count++;
        });

        t1.start();
        t2.start();

        t1.join(); // This throws InterruptedException
        t2.join(); // This throws InterruptedException

        System.out.println("Concurrency Count: " + count);
    }
}