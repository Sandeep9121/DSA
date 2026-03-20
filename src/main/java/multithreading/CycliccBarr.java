package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CycliccBarr implements Callable<String > {



    final CyclicBarrier cyclicBarrier;

    public CycliccBarr(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }


    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String  call() throws Exception {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" ServiceStarted ");
            cyclicBarrier.await();
        return "oK";
    }
}
