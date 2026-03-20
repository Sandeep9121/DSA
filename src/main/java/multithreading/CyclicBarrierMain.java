package multithreading;


import java.util.concurrent.*;

public class CyclicBarrierMain {



    public static void main(String[] args) throws ExecutionException, InterruptedException, BrokenBarrierException, TimeoutException {

      ExecutorService ex =Executors.newFixedThreadPool(3);
        CyclicBarrier barrier=new CyclicBarrier(3);
          ex.submit(new CycliccBarr(barrier));
        ex.submit(new CycliccBarr(barrier));
        ex.submit(new CycliccBarr(barrier));
       // barrier.await(3,TimeUnit.SECONDS);

        System.out.println(" all dependent services are finised ");

        ex.shutdown();
    }
}
