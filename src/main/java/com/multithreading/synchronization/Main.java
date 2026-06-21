package com.multithreading.synchronization;

public class Main {
    public static void main(String[] args) {

        // initially Monitor Lock acquired by JVM on Objects of SharedResource First sharedResource1, sharedResource2
        SharedResource sharedResource1 = new SharedResource();
        Thread thread1 = new Thread(sharedResource1::producer);

        SharedResource sharedResource2 = new SharedResource();
        Thread thread2 = new Thread(sharedResource2::producer);

        thread1.start();
        thread2.start();
    }
}
