package com.multithreading.reentrant_lock;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource1 = new SharedResource();

        Thread thread1 = new Thread(() -> {
            sharedResource1.producer();
        }, "thread1");

        Thread thread2 = new Thread(sharedResource1::producer, "thread2");
        Thread thread4 = new Thread(sharedResource1::producer, "thread4");
        Thread thread5 = new Thread(sharedResource1::producer, "thread5");
        Thread thread3 = new Thread(sharedResource1::producer, "thread3");

        thread4.start();
        thread5.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
