package io.github.Akshayaap.core.multithreading;

public class SyncTestObj {

    private int data;

    public SyncTestObj(int data){
        this.data=data;
    }

    public  void print5(int a) {

        //Achieving Synchronization with synchronized block
        for (int i=0;i<6;i++){
            System.out.println(-(i+a)+"\t\t"+data);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (this)
        {
            for(int i=0;i<5;i++){
                data=a+i;
                System.out.println(data+"\t\t"+data);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        for (int i=0;i<6;i++){
            System.out.println(i-a+1000000+"\t\t"+data);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
