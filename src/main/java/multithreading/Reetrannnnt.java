package multithreading;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reetrannnnt {

    private final Lock rLock = new ReentrantLock(true);


    public void m1() throws InterruptedException {

        if(rLock.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName() + " Acquired");
                // thread 2 sometime not acquired  introduce some delay using random
            }catch (Exception interruptedException){
                System.out.println("interrrupt");
                Thread.currentThread().interrupt();
            }finally {
                rLock.unlock();
            }

        }else {
           // Thread.currentThread().stop();  if current thread got stopped we can interrupt its state
            System.out.println(Thread.currentThread().getName() + " Not Acquired");
        }

        if(Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName() + " got  interrrupted do some clean up operations");
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
