package multithreading;


import java.util.concurrent.*;

public class CallingMain {



    public static void main(String[] args) throws ExecutionException, InterruptedException {

      ExecutorService ex =Executors.newFixedThreadPool(3);
        CountDownLatch latch=new CountDownLatch(3);
          ex.submit(new CallableMain(latch));
        ex.submit(new CallableMain(latch));
        ex.submit(new CallableMain(latch));
        latch.await(3,TimeUnit.SECONDS);

        System.out.println(" all dependent services are finised ");

        ex.shutdown();
    }
}
