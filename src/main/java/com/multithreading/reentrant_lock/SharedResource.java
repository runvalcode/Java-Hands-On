package com.multithreading.reentrant_lock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    ReentrantLock lock = new ReentrantLock(true);

    public void producer() {
        lock.lock(); // lock acquired by thread
        System.out.println("queue length  ::: " + lock.getQueueLength());
        try {
            System.out.println("is fair :: " + lock.isFair());
            System.out.println("Lock Acquired by Thread ::: " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } finally {
            lock.unlock(); // released the lock acquired by thread
            System.out.println("Lock Released by Thread ::: " + Thread.currentThread().getName());
        }
    }
}

/*
there are some methods in reentrant lock :

1. lock();
2. unlock();
3. tryLock(); will return boolean if acquired lock, in this method thread will check can i get lock on resource or not ? if yes then perform task if not then perform other task.
4. tryLock(Timeout, TimeUnit.SECONDS); with this method thread can try to wait to given timeout duration if able to acquire lock then will execute task otherwise perform other task
5. isLocked(); is resource locked by other thread - use for monitoring and debugging purpose not recommended for production use.
6. isHeldByCurrentThread(); is lock hold by current thread if yes then return true otherwise return false. when you have to use unlock() method that time use this method.
7. getHoldCount(); this method tells that how many times thread actually acquired lock on resource.
8. isFair(); is ReentrantLock follows fair approach to perform resource allocation.
 */
