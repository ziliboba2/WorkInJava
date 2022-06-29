package com.homework.homework22;

import java.util.ArrayList;
import java.util.List;

public class Threads {
    private static int COUNTER = 0;


    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Counter());
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("counter " + COUNTER);
    }

    private synchronized static void nextCounter() {
        COUNTER++;
    }

    public static class Counter implements Runnable {
        public void run() {
            Thread thread = Thread.currentThread();
            System.out.println("Starting threads: " + thread.getName());
            for (int i = 0; i < 1000; i++) {
                nextCounter();
            }
        }
    }
}
