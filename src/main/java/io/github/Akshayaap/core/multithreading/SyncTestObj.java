package io.github.Akshayaap.core.multithreading;

public class SyncTestObj {

    private int data;

    public SyncTestObj(int data){
        this.data=data;
    }

    public synchronized void print5(int a) {

        for(int i=0;i<5;i++){
            data=a+i;
            System.out.println(data);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
