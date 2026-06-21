package com.multithreading.synchronization;

public class SharedResource {

    boolean isAvailable = false;

    public synchronized void producer() {
        try {
            System.out.println("Lock Acquired By ::: " + Thread.currentThread().getName());
            synchronized (this) {
                isAvailable = true;
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Lock Released By ::: " + Thread.currentThread().getName());
    }
}
