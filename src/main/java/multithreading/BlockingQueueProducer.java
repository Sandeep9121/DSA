package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;


public class BlockingQueueProducer {
    public static void main(String[] args) {

        BlockingQueue<Integer> bq=new ArrayBlockingQueue<>(5);

        Producer1 p=new Producer1(bq);
        Consumer1 c=new Consumer1(bq);

        Thread t1=new Thread(p,"t1");
        Thread t2=new Thread(c,"t2");

        t1.start();
        t2.start();

    }
}



class Consumer1 implements Runnable{
    BlockingQueue<Integer> bq;

    public  Consumer1( BlockingQueue<Integer> bq){

        this.bq=bq;
    }

    @Override
    public void run() {
        try{
          while(true) {
              System.out.println("consumed "+bq.take());
          }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

class Producer1 implements Runnable{
    BlockingQueue<Integer> bq;

    public  Producer1( BlockingQueue<Integer> bq){

        this.bq=bq;
    }


    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        try{
            for (int i = 0; i < 11; i++) {
               int v= (int) (Math.random() * 100);
                bq.put(v);
                System.out.println("Produced "+v);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
