package org.pro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Thread;
public class Main {
    private static int count = 0;
    static void main() {
        
        System.out.println("Hello and welcome Java!");

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
        //
//        Map<String, Integer> map = new HashMap<>();
//        map.put("A", 10);
//        map.put("B", 20);
//        map.put("C", 30);
//        System.out.println(map.size());
//        System.out.println(map.get("A"));

//         Object lock = new Object();
//
//         Thread  t1 = new Thread(() -> {
//
//             synchronized (lock) {
//                 System.out.println("A");
//                 try {
//                     lock.wait();
//
//                 }catch (InterruptedException e){
//                     Thread.currentThread().interrupt();
//                 }
//                 System.out.println("B");
//             }
//
//        });
//
//    Thread t2 = new Thread(() -> {
//        synchronized (lock) {
//            System.out.println("C");
//            lock.notify();
//            System.out.println("D");
//        }
//
//    });
//    t1.start();
//    t2.start();
//
//        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
//        int result = numbers.stream()
//                .filter(n ->n>20)
//                .map(n->n*2)
//                .reduce(0,Integer::sum);
//
//        System.out.println(result);

//        try {
//            System.out.println("Try");
//            return;
//        } catch (Exception e) {
//            System.out.println("Catch");
//        }finally {
//            System.out.println("Finally");
//        }

        throws InterruptedException {

           Thread t1 = new Thread(() -> {
               for(int i=0; i<1000; i++){
                   count++;
               }

           });

            Thread t2 = new Thread(() ->{
                for(int i=0; i<1000; i++){
                    count++;
                }

            });

            t1.start();
            t2.start();

            t1.join();
            t2.join();


            System.out.println(count);



    }
}
