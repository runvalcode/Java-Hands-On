package com.multithreading.readwritelock;

public class Main {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(resource::read);
        Thread thread2 = new Thread(resource::read);
        Thread thread3 = new Thread(resource::read);

        Thread thread4 = new Thread(() -> {
            resource.write(10);
        });

        Thread thread5 = new Thread(() -> {
            resource.write(15);
        });


        thread4.start();
        thread5.start();

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
