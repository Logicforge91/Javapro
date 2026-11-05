package org.pro;

public class Threads {
    public  static void display(String[] args){

        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock){
                System.out.println("A");
                try {
                    lock.wait();

                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                System.out.println("B");
            }

        });

        Thread t2 = new Thread(() ->{
            synchronized (lock) {
                System.out.println("C");
                lock.notify();
                System.out.println("D");
            }

        });

        t1.start();
        t2.start();
    }
}
