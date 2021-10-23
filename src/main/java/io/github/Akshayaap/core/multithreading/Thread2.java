package io.github.Akshayaap.core.multithreading;

public class Thread2 implements Runnable{


    private SyncTestObj obj;

    public Thread2(SyncTestObj obj){
        this.obj=obj;
    }



    @Override
    public void run(){

        obj.print5(20000);

//        Previous Commit code
//        int i=0;
//        while(true){
//            System.out.println("\t\t"+(4*i++-1));
//            try {
//                Thread.sleep(777);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

}
