package multithreading;

import java.util.concurrent.Callable;

public class CallableMain implements Callable {


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
        return null;
    }
}
