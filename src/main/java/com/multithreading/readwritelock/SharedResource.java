package com.multithreading.readwritelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    ReadWriteLock lock = new ReentrantReadWriteLock(true);
    Lock readlock = lock.readLock();  // shared Lock
    Lock writelock = lock.writeLock();// exclusive Lock
    private int value = 0;

    public int read() {
        readlock.lock();
        try {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Read Value by Thread ::: " + Thread.currentThread().getName() + " Value is ::: " + value);
            return value;
        } finally {
            readlock.unlock();
        }
    }

    public void write(int newValue) {
        writelock.lock();
        try {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            value = newValue;
            System.out.println("Write Value by Thread ::: " + Thread.currentThread().getName() + " write value is ::: " + value);
        } finally {
            writelock.unlock();
        }
    }

}