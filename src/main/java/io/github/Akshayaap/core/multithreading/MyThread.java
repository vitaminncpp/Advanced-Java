package io.github.Akshayaap.core.multithreading;

public class MyThread extends Thread{

    private SyncTestObj obj;

    public MyThread(SyncTestObj obj) {
        this.obj=obj;
    }

    @Override
    public void run(){

        obj.print5(300);
//        Previus Commit code
//        int i=0;
//        while(true){
//
//            System.out.println(4*i++);
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
