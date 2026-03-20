package multithreading;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockAAA {

    private int counter =0;
    private final ReadWriteLock  locks=new  ReentrantReadWriteLock();
    private final Lock readLock = locks.readLock();
    private final Lock writeLock = locks.readLock();

    public void increment(){
        writeLock.lock();
        try {
            counter++;
        }finally {
            writeLock.unlock();
        }

    }

    public int getCounter(){
        readLock.lock();
        try{
            return counter;
        }finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) {

        ReadWriteLockAAA obj= new ReadWriteLockAAA();
        Runnable r =()->{

            for (int i = 0; i < 3; i++) {
                obj.increment();
                System.out.println(Thread.currentThread().getName()+" incremented ");

            }
        };

        Runnable r2 =()->{

            for (int i = 0; i < 3; i++) {

                System.out.println(Thread.currentThread().getName()+"  "+obj.getCounter());

            }
        };
        Thread thread= new Thread(r ,"Thread 1");
        thread.start();
        Thread thread2= new Thread(r ,"Thread 2");
        thread2.start();

        Thread thread3= new Thread(r2,"Thread 3");
        thread3.start();
        Thread thread4= new Thread(r2,"Thread 4");
        thread4.start();




    }
}
