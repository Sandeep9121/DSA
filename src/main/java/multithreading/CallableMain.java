package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class CallableMain implements Callable<String > {



    final CountDownLatch latch;

    public CallableMain(CountDownLatch latch) {
        this.latch = latch;
    }


    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String  call() throws Exception {

        try {
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" ServiceStarted ");
        }finally {
            latch.countDown();
        }
        System.out.println(Thread.currentThread().getName()+" ServiceStarted ");
        return null;
    }
}
