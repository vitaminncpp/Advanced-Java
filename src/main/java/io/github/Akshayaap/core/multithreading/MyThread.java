package io.github.Akshayaap.core.multithreading;

public class MyThread extends Thread{


    @Override
    public void run(){
        int i=0;
        while(true){
            System.out.println(4*i++);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
