package io.github.Akshayaap.core.multithreading;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread1=new MyThread();
        new Thread(new Thread2()).start();
        thread1.start();
    }
}
