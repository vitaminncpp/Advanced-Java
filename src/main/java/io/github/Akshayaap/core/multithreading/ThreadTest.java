package io.github.Akshayaap.core.multithreading;

public class ThreadTest {
    public static void main(String[] args) {
        SyncTestObj obj=new SyncTestObj(100);
        Thread thread1=new MyThread(obj);

        new Thread(new Thread2(obj)).start();
        thread1.start();
    }
}
