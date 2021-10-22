package io.github.Akshayaap.core.multithreading;

public class Thread2 implements Runnable{

    @Override
    public void run(){
        int i=0;
        while(true){
            System.out.println("\t\t"+(4*i++-1));
            try {
                Thread.sleep(777);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
