package multithreading;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallingMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

      ExecutorService ex =Executors.newFixedThreadPool(1000);
       Future<String> future1= ex.submit(new CallableMain());
        Future<String> future2= ex.submit(new CallableMain());
        Future<String> future3= ex.submit(new CallableMain());

        future1.get();
        future1.get();
        future1.get();

        System.out.println(" all dependent services are finised ");

        ex.shutdown();
    }
}
