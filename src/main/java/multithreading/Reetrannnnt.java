package multithreading;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reetrannnnt {

    private final Lock rLock = new ReentrantLock();


    public void m1() throws InterruptedException {

        if(rLock.tryLock(500,TimeUnit.MILLISECONDS)) {
            try {
                System.out.println(Thread.currentThread().getName() + " Acquired");
                // thread 2 sometime not acquired  introduce some delay using random
            }finally {
                rLock.unlock();
            }

        }else {
            System.out.println(Thread.currentThread().getName() + " Not Acquired");
        }

    }


    public static void main(String[] args) {
        Reetrannnnt obj=new Reetrannnnt();

        Runnable r =()->{

            for (int i = 0; i < 3; i++) {

                try {
                    obj.m1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };
        Thread thread= new Thread(r ,"Thread 1");
        thread.start();
        Thread thread2= new Thread(r ,"Thread 2");
        thread2.start();


    }
}
