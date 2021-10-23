package io.github.Akshayaap.core.multithreading;

public class SyncTestObj {

    private int data;

    public SyncTestObj(int data){
        this.data=data;
    }

    public  void print5(int a) {

        //Achieving Synchronization with synchronized block
        for (int i=0;i<6;i++){
            System.out.println(-(i+a));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (this)
        {
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
}
