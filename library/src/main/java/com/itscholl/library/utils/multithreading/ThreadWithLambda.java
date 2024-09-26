package com.itscholl.library.utils.multithreading;

public class ThreadWithLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Lambda expression thread is running"));
        thread.start();
    }
}
